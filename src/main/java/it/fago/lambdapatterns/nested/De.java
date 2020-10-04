package it.fago.lambdapatterns.nested;

public interface De {

	interface To<T> {
		T to(T t);
	}

	static <T> To<T> fault(T to) {
		return t -> to != null ? to : t;
	}
}
