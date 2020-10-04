package it.fago.lambdapatterns.cascadinglambda.builder;

@FunctionalInterface
public interface NameBuilder {
	FamilyNameBuilder name(String firstName);
}