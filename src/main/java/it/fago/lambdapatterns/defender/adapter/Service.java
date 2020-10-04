package it.fago.lambdapatterns.defender.adapter;

public interface Service {
	
	void destroy();
	
	void execute(Object ... arguments);
	
}
