package it.fago.lambdapatterns.defender.adapter;

import java.util.Random;

public interface UseVerboseFunction {

	public static void main(String[] args) {

		VerboseFunction<String, Integer> stringLen = String::length;
		VerboseFunction<Integer, Integer> square = i -> i * i;
		VerboseFunction<Integer, String> rndString = i -> new Random().ints(i, 48, 97)
				.collect(StringBuilder::new, (b, v) -> b.append((char) v), null).toString();

		int lengthOfTargetString = 10;
		System.out.println(stringLen.followedBy(square).butBefore(rndString).executeWith(lengthOfTargetString));
	}
}
