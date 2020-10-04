package it.fago.lambdapatterns.cascadinglambda.builder;

@FunctionalInterface
public interface AgeBuilder {
	PersonBuilder age(int age);
}