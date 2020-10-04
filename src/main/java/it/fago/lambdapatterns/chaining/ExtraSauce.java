package it.fago.lambdapatterns.chaining;

public class ExtraSauce implements Hamburger {
	//
	private Hamburger hamburger;

	public ExtraSauce(Hamburger hamburger) {
		this.hamburger = hamburger;
	}

	@Override
	public void squeez() {
		System.out.println("OMG! The Sauce!");
	}

	@Override
	public String describe() {
		return hamburger.describe() + " with extra sauce";
	}

}// END