package it.fago.lambdapatterns.chaining;

public interface Temperature {

	int value();

	Temperature toCelsius();

	Temperature toFahrenheit();

	public static Temperature celsius(int value)
	{
		return new CelsiusTemperature(value);
	}
	
	public static Temperature fahrenheit(int value)
	{
		return new FahrenheitTemperature(value);
	}
}
