public class WeatheDataTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        weatherData.setMeasurements(80, 20, 30);
        weatherData.setMeasurements(20, 22.43f, 30.2f);
        weatherData.removeObserver(currentConditionsDisplay);
        System.out.println();
        weatherData.setMeasurements(20f, 22.43f, 30.2f);
    }
}
