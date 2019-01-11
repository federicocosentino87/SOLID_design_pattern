package com.observer;

//class open for extension, but close for modification

//object interact with each other, but they are indipendent

public class App {

	public static void main(String[] args) {
		WeatherStation station = new WeatherStation();
		WeatherObserver observer = new WeatherObserver(station);
		
		station.setHumidity(100);
		station.setPressure(200);
		station.setTemperature(20);
	}
	
}
