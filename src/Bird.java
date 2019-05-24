
public class Bird extends Animal {

	private double wingSpan;
	private String wingColour;
	private String beakColour;

	public Bird(double weight, int age, String colour, double wingSpan, String wingColour, String beakColour) {
		super(weight, age, colour);
		this.wingSpan = wingSpan;
		this.wingColour = wingColour;
		this.beakColour = beakColour;
		// TODO Auto-generated constructor stub
	}

	public void fly() {

	}

	public void layEggs() {

	}

	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}

	public String getWingColour() {
		return wingColour;
	}

	public void setWingColour(String wingColour) {
		this.wingColour = wingColour;
	}

	public String getBeakColour() {
		return beakColour;
	}

	public void setBeakColour(String beakColour) {
		this.beakColour = beakColour;
	}
}
