package com.personal.observer.part1;

public class WeatherData {
	// instaces varaible declarations
	public void measurementsChanged() {
		float temp = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();

		// in this senario all the displays will be updated
		// but you will need to update them as you go and alot of code duplicaton

		currentConditionsDisplay.update(temp, humidity, pressure);
		statisticsDisplay.update(temp, humidity, pressure);
		forecastDisplay.update(temp, humidity, pressure);
	}
}
