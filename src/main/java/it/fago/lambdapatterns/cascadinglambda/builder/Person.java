package it.fago.lambdapatterns.cascadinglambda.builder;

public final class Person {

	private final String name;
	private final String familyName;
	private final int age;

	private Person(String name, String familyName, int age) {
		this.name = name;
		this.familyName = familyName;
		this.age = age;
	}

	public String name() {
		return name;
	}

	public String familyName() {
		return familyName;
	}

	public int age() {
		return age;
	}

	public String toString() {
		return "Person[" + name + ", " + familyName + ", " + age + "years]";
	}

	public static NameBuilder builder() {
		return firstName -> lastName -> age -> () -> new Person(firstName, lastName, age);
	}

}