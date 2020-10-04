package it.fago.lambdapatterns.nested.initializer;

public class Person {

	private final String name;
	private final String familyName;

	public Person(String name, String familyName) {
		this.name = name;
		this.familyName = familyName;
	}

	public String name() {
		return name;
	}

	public String familyName() {
		return familyName;
	}

}// END