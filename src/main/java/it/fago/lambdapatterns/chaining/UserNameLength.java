package it.fago.lambdapatterns.chaining;

import java.util.function.Function;

public class UserNameLength {

	public static void main(String[] args) {

		Function<User, String> userName = User::name;
		Function<User, Integer> userNameLenght = userName.andThen(String::length);

		System.out.println(userNameLenght.apply(new User(0,"John")));
		
	}
}
