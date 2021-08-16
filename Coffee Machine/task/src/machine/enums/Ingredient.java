package machine.enums;

public enum Ingredient {
	MILK("ml"),
	WATER("ml"),
	BEANS("grams"),
	CUPS("number"),
	MONEY("dollars");

	private final String measure;

	Ingredient(String measure) {
		this.measure = measure;
	}

	public String getMeasure() {
		return measure;
	}
}
