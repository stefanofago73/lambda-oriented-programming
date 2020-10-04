package it.fago.lambdapatterns.defender.adapter;

import java.util.function.Consumer;

public interface ICloseable<S> extends AutoCloseable {

	default void close() {
		doClose();
	}

	void doClose();

	static <S> ICloseable<S> fromResource(S subject, Consumer<S> callback) {
		return () -> callback.accept(subject);
	}

}
