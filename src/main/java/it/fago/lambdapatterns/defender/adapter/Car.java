package it.fago.lambdapatterns.defender.adapter;

public class Car {
	//
	private final String color;
	
	public Car(String color)
	{
		this.color=color;
	}
	
	public String color()
	{
		return color;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + color + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()+"]";
	}	
	
}//END
