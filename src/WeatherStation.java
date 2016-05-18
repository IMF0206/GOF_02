
public class WeatherStation {
	public static void main(String []args){
		WeatherData weatherData = new WeatherData();
		ForcastDisplay forcastDisplay = new ForcastDisplay(weatherData);
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StaticsDisplay staticsDisply = new StaticsDisplay(weatherData);
		HeatIndexDisplay heatindexDisplay = new HeatIndexDisplay(weatherData);
		
		
		weatherData.setMeasurements(25.3f, 65, 30.5f);
		weatherData.setMeasurements(23.4f, 60, 29.2f);
		weatherData.setMeasurements(29.3f, 70, 29.2f);
	}
}
