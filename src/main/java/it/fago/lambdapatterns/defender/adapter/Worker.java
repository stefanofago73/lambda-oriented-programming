package it.fago.lambdapatterns.defender.adapter;

public interface Worker {

	void work();

	static Worker of(Worker worker) {
		return worker;
	}

}
