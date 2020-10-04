package it.fago.lambdapatterns.chaining;

import static it.fago.lambdapatterns.chaining.TemperatureType.CELSIUS;

public class Meteo {
	private int value;
	private TemperatureType ttype;

	public static final Meteo with(int value, TemperatureType ttype) {
		return new Meteo(value, ttype);
	}

	private Meteo(int value, TemperatureType ttype) {
		this.value = value;
		this.ttype = ttype;
	}

	public Temperature temperature() {
		return ttype == CELSIUS ? Temperature.celsius(value) : Temperature.fahrenheit(value);
	}
}
