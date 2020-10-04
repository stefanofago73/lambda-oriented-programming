package it.fago.lambdapatterns.serialize;

import java.io.Serializable;

public interface GreetCommand {

	String greetTemplate();
	
	default String messageFor(String name)
	{
	  return String.format(greetTemplate(),name);	
	}
	
	default Serializable serializable(){
		String template = this.greetTemplate();
		return (GreetCommand & Serializable) ()->template;
	}
	
}
