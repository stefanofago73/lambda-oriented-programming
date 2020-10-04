package it.fago.lambdapatterns.cascadinglambda.simple;

import java.util.function.Function;
import java.util.function.Predicate;

public class SimpleCascade {

	static final Function<String, Predicate<String>> startsWithLetter =
			letter -> name -> name.startsWith(letter);
			
			
			public static void main(String[] args) {
				
				String name1 = "John";
				String name2 = "Phil";
				
				System.out.println(startsWithLetter.apply("J").test(name1));
				System.out.println(startsWithLetter.apply("P").test(name1));
				System.out.println(startsWithLetter.apply("P").test(name2));
				
				
			}
}
