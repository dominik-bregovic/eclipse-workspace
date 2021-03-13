import java.util.Scanner;

public class Point {
	
	private int x;
	private int y;
	
	public int getCoordinateX() {
		return(this.x);
	}
	
	public int getCoordinateY() {
		return(this.y);
	}
	// scanning the coordinates
	public void scan(String coordinateName, String pointNr) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("\t"+pointNr+coordinateName+" coordinate: ");
			
		
		while(!scanner.hasNextInt()) {
			System.out.print("\t"+pointNr+coordinateName+" coordinate: ");
			scanner.next();
		}
		
		if (coordinateName.equals("x")) {
			this.x=scanner.nextInt();
		} else if (coordinateName.equals("y")) {
			this.y=scanner.nextInt();
		}
	}
	// calling the method for each coordinate
	public void scanCoordinates(String pointNr) {
		this.scan("x", pointNr);
		this.scan("y", pointNr);
	}
}
