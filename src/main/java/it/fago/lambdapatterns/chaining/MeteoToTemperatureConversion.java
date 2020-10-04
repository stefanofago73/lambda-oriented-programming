package it.fago.lambdapatterns.chaining;

import static it.fago.lambdapatterns.chaining.TemperatureType.CELSIUS;

import java.util.function.Function;

public class MeteoToTemperatureConversion {

	public static void main(String[] args) {

		Function<Meteo, Temperature> temperatureInCelsius = Meteo::temperature;
		Function<Temperature, Temperature> toFahrenheit = Temperature::toFahrenheit;
		Function<Meteo, Temperature> temperatureInFahrenheit = toFahrenheit.compose(temperatureInCelsius);

		System.out.println(temperatureInFahrenheit.apply(Meteo.with(10, CELSIUS)));		
	}
}
