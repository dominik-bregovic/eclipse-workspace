import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String input;
		Scanner scanner = new Scanner(System.in);

		do {
			input = scanner.nextLine();
			input=input.toLowerCase();
			//3 options to transform to lower case
			//Scanner scanner = new Scanner(System.in).toLowerCase();
			// input = input.toLowerCase();
			// input.equalsIgnoreCase("String");
		} while (!input.equals("new rectangle") && !input.equals("new circle")); //if new rec. or circ then false and quit
		
		if (input.equals("new rectangle")) {
			Point point1 = new Point();
			point1.setCoordinateX(scanner.nextInt());
			point1.setCoordinateY(scanner.nextInt());
			
			System.out.println(point1.getCoordinateX());
			System.out.println(point1.getCoordinateY());
			//Rectangle rect1 = new Rectangle();
			//scanCoordinates();
			//rect1.draw();
		}
		
		if (input.equals("new circle")) {

		}
		scanner.close();		
	}
}
