package it.fago.lambdapatterns.defender.adapter;

public class UsageFactory {

	public static void main(String[] args) {
		Factory<Car> redCarFactory = Factory.createFactory(Car::new, "RED");
		Car car = redCarFactory.newInstance();
		System.out.println(car);
	}
}
