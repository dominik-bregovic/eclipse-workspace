package ClassesAndObjects;

public class Main {

	public static void main(String[] args) {
	//	How fast is your car driving.
		Car audi = new Car();
		audi.drive(110);
		
		Paint paintCar = new Paint();
		paintCar.folieren(audi, "brown");
		System.out.println(audi.getColor());
		
		
		
	}

}
