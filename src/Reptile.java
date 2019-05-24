
public class Reptile extends Animal {
	private String eyeColour;

	public Reptile(double weight, int age, String colour, String eyeColour) {
		super(weight, age, colour);
		this.eyeColour = eyeColour;
	}

	public void noiseMade() {

	}

	public String getEyeColour() {
		return eyeColour;
	}

	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}
}
