package it.fago.lambdapatterns.singleton;

import java.util.function.Supplier;

public class UsagePRNSupplier {

	public static void main(String[] args) {
		Supplier<Integer> prnSupplier = PRNSupplier.create();
		System.out.println(prnSupplier.get());
		System.out.println(prnSupplier.get());
		System.out.println(prnSupplier.get());

		Supplier<Integer> rndConstant = PRNSupplier.rndConstant();
		System.out.println(rndConstant.get());
		System.out.println(rndConstant.get());
		System.out.println(rndConstant.get());
	}
}
