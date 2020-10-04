package it.fago.lambdapatterns.genericlambdaexpression;

import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Collectors;

public interface Init<R> {

	Collection<R> provide();
	
	static <T,R> Init<R> from(Collection<T> collection,Function<T,R> mapper)
	{
	  return ()->collection.stream().map(mapper).collect(Collectors.toList());	
	}
	
	//
	// doesn't work since unsupported generic lambda expression
	//
    //<R> Collection<R> provide();
	//
	//static <T,R> Init from(Collection<T> collection,Function<T,R> mapper)
	//{
	//  return ()->collection.stream().map(mapper).collect(Collectors.toList());	
	//}
	
}
