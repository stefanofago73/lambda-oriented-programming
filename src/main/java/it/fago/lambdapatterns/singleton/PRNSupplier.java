package it.fago.lambdapatterns.singleton;

import java.util.Random;
import java.util.function.Supplier;

public interface PRNSupplier{

	static Supplier<Integer> create()
	{
		Random rnd = new Random();
		return ()->rnd.nextInt();
	}
	
	static Supplier<Integer> rndConstant()
	{
		Integer constant = new Random().nextInt();
		return ()->constant;
	}
	
}
