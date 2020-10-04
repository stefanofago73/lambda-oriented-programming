package it.fago.lambdapatterns.chaining;

public class ExtraCheese implements Hamburger{
//
	private Hamburger hamburger;
	
	public ExtraCheese(Hamburger hamburger)
	{
	 this.hamburger = hamburger;	
	}

	@Override
	public void squeez() {
		System.out.println("Cheese is all around!");
	}

	@Override
	public String describe() {
		return hamburger.describe()+" with extra cheese";
	}
}
