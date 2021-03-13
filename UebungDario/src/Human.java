
public class Human {
	
	public String name;
	public int height;
	public String eyeColor;
	
	public Human(String objName, int objHeight, String objEyeColor) {
		this.name=objName;
		this.height=objHeight;
		this.eyeColor=objEyeColor;
	}
	
	public void goToWork() {
		System.out.println(this.name + " is going to work");
	}
	
	public String repeatAfterMe(String sentence) {
		System.out.println("Saying after you...");
		return (sentence);
	}
	
	
	public static void main(String[] args) {
		
		// scanner
		Human human1 = new Human("Dario", 182, "gray");
//		human1.name="Dario";
//		human1.height=182;
//		human1.eyeColor="gray";
		human1.goToWork();
		
		
		Human human2 = new Human("Dominik", 179, "brown");
		human2.goToWork();	
		
	}

}
