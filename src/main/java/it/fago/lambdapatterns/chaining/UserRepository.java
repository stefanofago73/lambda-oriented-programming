package it.fago.lambdapatterns.chaining;

public final class UserRepository {

	private static final String[] NAMES = { "John", "Ruby", "Frank", "Mike", "Jake", "Dean", "Sam", "Lory" };

	public final User findById(long id) {
		return new User(id, NAMES[(int) (id % NAMES.length)]);
	}

}// END
