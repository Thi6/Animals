
public class Mammal extends Animal {
	private String hairColour;

	public Mammal(double weight, int age, String colour, String hairColour) {
		super(weight, age, colour);
		this.hairColour = hairColour;
	}

	public void noiseMade() {

	}

	public String getHairColour() {
		return hairColour;
	}

	public void setHairColour(String hairColour) {
		this.hairColour = hairColour;
	}

}
