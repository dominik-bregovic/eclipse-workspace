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
			//starting for rectangle
			System.out.println("Rectangle #1: ");
			Rectangle rect1 = new Rectangle();
			rect1.printArea();
			
			// if height or width is zero than area is also zero, so don't draw
			if (rect1.getArea()!=0) {
				rect1.draw();
			}
			
		}
		if (input.equals("new circle")) {
			//starting for circle
			System.out.println("Circle #1: ");
			Circle circ1 = new Circle();
			circ1.printRadius();
		}
		
		scanner.close();
	}
}
