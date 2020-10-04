package it.fago.lambdapatterns.nested;

public class UsageNested {

	public static void main(String[] args) {
		System.out.println(De.fault(Address.address("via Lodi, 12, Milano")).to(Address.INVALID).description());
	}
}
