package it.fago.lambdapatterns.defender.base;

import java.util.function.Supplier;

public interface Logger {

	public void log(Level level, String pattern, Object... args);

	public boolean isLevelEnabled(Level level);

	default void log(Level level, String pattern, Supplier<String> lazy) {
		if (isLevelEnabled(level)) {
			log(level, pattern, lazy.get());
		}
	}
}
