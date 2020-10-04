package it.fago.lambdapatterns.genericlambdaexpression;

public interface Factory {

	 <T> Product<T> make(); 
	 
}
