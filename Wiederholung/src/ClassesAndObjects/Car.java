package ClassesAndObjects;

public class Car {
	private String color="black";
	String modell;
	int hp;
	int speed;
	boolean driving=false;
	
	public void drive(int speed) {
		this.driving=true;
		this.speed=speed;
		System.out.println("Car is driving("+this.speed+" km/h)");
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String newColor) {
		this.color=newColor;
	}

}
