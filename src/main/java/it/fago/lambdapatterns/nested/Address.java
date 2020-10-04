package it.fago.lambdapatterns.nested;

public final class Address {

	public static final Address INVALID = new Address(new String[] {});

	private String[] data;

	private Address(String[] data) {
		this.data = data;
	}

	public static final Address address(String informations) {
		if (informations == null) {
			return null;
		}
		String[] tmp = informations.split(",");

		if (tmp.length < 3) {
			return null;
		}
		return new Address(tmp);
	}

	public String description() {
		return this == INVALID ? "Address[INVALID]" : "Address[" + String.join(", ", data) + "]";
	}

}