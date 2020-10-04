package it.fago.lambdapatterns.chaining;

public class SimpleHamburger implements Hamburger{
//
	private String id;
	
	
	public SimpleHamburger(String id) {
		this.id = id;
	}

	@Override
	public void squeez() {
		System.out.println("OMG vegetables are start to overflow!");
	}

	@Override
	public String describe() {
		return "I'm a Hamburger ["+id+"]";
	}

}