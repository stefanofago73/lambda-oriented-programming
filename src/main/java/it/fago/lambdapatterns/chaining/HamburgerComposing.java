package it.fago.lambdapatterns.chaining;

import java.util.function.Function;

public class HamburgerComposing {

	protected static void describe(String id, Function<String, Hamburger> hamburger) {
		System.out.println(hamburger.apply(id).describe());
	}

	public static void main(String[] args) {
		Function<String, Hamburger> simpleHamburger = SimpleHamburger::new;
		Function<Hamburger, Hamburger> withExtraCheese = ExtraCheese::new;
		Function<Hamburger, Hamburger> withExtraSource = ExtraSauce::new;

		describe("EveryThing", withExtraSource.compose(withExtraCheese.compose(simpleHamburger)));
		describe("CheeseMaster", withExtraCheese.compose(simpleHamburger));
		describe("Mexican", withExtraSource.compose(simpleHamburger));
	}

}
