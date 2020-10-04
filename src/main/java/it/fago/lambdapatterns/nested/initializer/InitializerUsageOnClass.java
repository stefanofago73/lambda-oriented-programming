package it.fago.lambdapatterns.nested.initializer;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class InitializerUsageOnClass {

	private Collection<String> families;

	private Collection<Integer> paragraphSpacing =  Initializer.from(new String[]{"I","II","III"}, String::length).provide();


	private Integer [] familyNamesLenght;
			
	public InitializerUsageOnClass(List<Person> persons) {
		families = Initializer.from(persons, Person::familyName).provide();
		familyNamesLenght = Initializer.from(families, String::length).provideArray();
	}

	public Collection<String> families() {
		return families;
	}

	public Integer [] familyNamesLength() {
		return familyNamesLenght;
	}
	
	public Collection<Integer> paragraphSpacing() {
		return paragraphSpacing;
	}
	
	public static void main(String[] args) {

		List<Person> persons = asList(
				new Person("John", "Black"), 
				new Person("Peter", "Red"),
				new Person("Jack", "White"));

		InitializerUsageOnClass tmp = new InitializerUsageOnClass(persons);
		System.out.println(tmp.families());
		System.out.println(tmp.paragraphSpacing());
		System.out.println(Arrays.toString(tmp.familyNamesLength()));
	}
}
