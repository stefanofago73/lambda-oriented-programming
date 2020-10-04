package it.fago.lambdapatterns.cascadinglambda.builder;

@FunctionalInterface
public interface FamilyNameBuilder {
	AgeBuilder family(String lastName);
}