package it.fago.lambdapatterns.chaining;

public final class CelsiusTemperature implements Temperature {

	private int value;

	public CelsiusTemperature(int value) {
		this.value = value;
	}

	@Override
	public int value() {
		return value;
	}

	@Override
	public Temperature toCelsius() {
		return this;
	}

	@Override
	public Temperature toFahrenheit() {
		return new FahrenheitTemperature((value * 9 / 5) + 32);
	}

	public final String toString()
	{
		return  "Temperature["+value+"° Celsius]";
	}
}