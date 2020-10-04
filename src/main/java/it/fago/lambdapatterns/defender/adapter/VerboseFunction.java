package it.fago.lambdapatterns.defender.adapter;

import java.util.function.Function;

import org.slf4j.LoggerFactory;

public interface VerboseFunction<T, R> extends Function<T, R> {

	default R executeWith(T t) {
		R result = null;
		try {
			return (result = apply(t));
		} finally {
			LoggerFactory.getLogger(getClass()).debug("Excuting {} with input: {} - returning : {} ", this, t, result);
		}
	}

	default <V> VerboseFunction<V, R> butBefore(VerboseFunction<? super V, ? extends T> before) {
		return v -> compose(before).apply(v);
	}

	default <V> VerboseFunction<T, V> followedBy(VerboseFunction<? super R, ? extends V> after) {
		return t -> andThen(after).apply(t);
	}

	static <T> VerboseFunction<T, T> identity() {
		return t -> t;
	}

}
