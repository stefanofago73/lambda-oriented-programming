package it.fago.lambdapatterns.nested.initializer;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;



public interface Initializer<R> {


	static <T, R> Initializer<R> from(Collection<T> coll, Function<T, R> mapper) {
		Objects.requireNonNull(coll, "collection");
		Objects.requireNonNull(mapper, "mapper");
		return () -> coll.stream().filter(Objects::nonNull).map(mapper).collect(toList());
	}

	static <T, R> Initializer<R> from(T[] coll, Function<T, R> mapper) {
		Objects.requireNonNull(coll, "collection");
		Objects.requireNonNull(mapper, "mapper");
		ArrayList<R> results = new ArrayList<>(coll.length);
		return () -> {
			for (int i = 0, len = coll.length; i < len; results.add(mapper.apply(coll[i])), i++);
			return results;
		};
	}

	public Collection<R> provide();

	default R[] provideArray(@SuppressWarnings("unchecked") R ... ignore) {
		return provide().toArray(ignore);
	}

}