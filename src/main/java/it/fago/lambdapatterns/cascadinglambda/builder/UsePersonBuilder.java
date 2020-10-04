package it.fago.lambdapatterns.cascadinglambda.builder;

public class UsePersonBuilder {

	public static void main(String[] args) {
		System.out.println(Person
		  .builder()
		    .name("John")
		    .family("Black")
		    .age(30)
		  .build());
	}
}
