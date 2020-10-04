package it.fago.lambdapatterns.chaining;

public final class FahrenheitTemperature implements Temperature {

	private int value;

	public FahrenheitTemperature(int value) {
		this.value = value;
	}

	@Override
	public int value() {
		return value;
	}

	@Override
	public Temperature toCelsius() {
		return new CelsiusTemperature((value-32) * 5 / 9);
	}

	@Override
	public Temperature toFahrenheit() {
		return this;
	}

	public final String toString()
	{
		return  "Temperature["+value+"° Fahrenheit]";
	}
}
