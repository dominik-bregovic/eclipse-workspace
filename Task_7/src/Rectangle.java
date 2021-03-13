import java.lang.Math; 

public class Rectangle {
	
	private Point point1;
	private Point point2;
	
	private int height;
	private int width;
	private int area;
	
	public int getArea() {
		return(this.area);
	}
	
	public int calcHeight(Point point1, Point point2) {
		//point1 and point2 into Math.abs and the result also into Math.abs
		
		return (Math.abs(Math.abs(point1.getCoordinateY())-Math.abs(point2.getCoordinateY())));
	}
	
	public int calcWidth(Point point1, Point point2) {
		return (Math.abs(Math.abs(point1.getCoordinateX())-Math.abs(point2.getCoordinateX())));
	}
	
	public void printArea() {
		this.makePoints();
		this.height = calcHeight(this.point1, this.point2);
		this.width = calcWidth(this.point1, this.point2);
		this.area = this.height*this.width;
		System.out.println("\tWidth:  "+this.width);
		System.out.println("\tHeight: "+this.height);
		System.out.println("\tArea:   "+this.area);
	}
	
	public void makePoints() {
		Point point1 = new Point();
		point1.scanCoordinates("First point:  ");
		this.point1 = point1;
		
		Point point2 = new Point();
		point2.scanCoordinates("Second point: ");
		this.point2 = point2;
	}
	
	public void draw() {
		
		// first line horizontal
		System.out.print("\t ");
		for (int i = 0; i < this.width; i++) {
			System.out.print("--");
		}
		
		System.out.println();
		
		//vertikal
		for (int j = 0; j < this.height; j++){
			System.out.print("\t|");
			for (int i = 0; i < this.width; i++) {
				System.out.print("  ");
			}
			System.out.println("|");
		}
		
		//last line horizontal
		System.out.print("\t ");
		for (int i = 0; i < this.width; i++) {
			System.out.print("--");
		}
	}
}
