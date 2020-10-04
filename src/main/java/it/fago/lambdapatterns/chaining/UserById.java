package it.fago.lambdapatterns.chaining;

import java.util.function.BiFunction;
import java.util.function.Function;

public class UserById {

	public static void main(String[] args) {
		
		UserRepository repository = new UserRepository();
		
		Function<Long, User> userById = repository::findById;
		// or you can have a partial application
		//
		// Function<Long, User> userById = repository();
		//
		Function<User, String> userName = User::name;
		Function<Long, String> userNameById = userById.andThen(userName);
		
		System.out.println(userNameById.apply(3L));
		
	}
	
	
	public static final Function<Long,User> repository()
	{
		UserRepository repository = new UserRepository();
		BiFunction<UserRepository, Long, User> findById = (repo,id) -> repo.findById(id);
		return (id)->findById.apply(repository,id);
	}
}
