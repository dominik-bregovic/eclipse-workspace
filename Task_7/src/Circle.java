
public class Circle {
	private Point point1;
	private Point point2;
	
	private int height;
	private int width;
	private int radius;
	
	public int calcHeight(Point point1, Point point2) {
		//point1 and point2 into Math.abs and the result also into Math.abs
		
		return (Math.abs(Math.abs(point1.getCoordinateY())-Math.abs(point2.getCoordinateY())));
	}
	
	public int calcWidth(Point point1, Point point2) {
		return (Math.abs(Math.abs(point1.getCoordinateX())-Math.abs(point2.getCoordinateX())));
	}
	public void printRadius() {
		this.makePoints();
		this.height = calcHeight(this.point1, this.point2);
		this.width = calcWidth(this.point1, this.point2);
		double width1 = this.width;
		double height1= this.height;
		double radius1= this.radius;
		radius1 = Math.sqrt(width1+height1);
		System.out.println("\tWidth:  "+this.width);
		System.out.println("\tHeight: "+this.height);
		System.out.println("\tRadius: "+radius1);
	}

	public void makePoints() {
		Point point1 = new Point();
		point1.scanCoordinates("First point: ");
		this.point1 = point1;
		
		Point point2 = new Point();
		point2.scanCoordinates("First point: ");
		this.point1 = point2;
		
	}
}
