import java.util.Scanner;

public class ScanInput {
	
	private Scanner scanner = new Scanner(System.in);
	private int start;
	private int rotation;
	private int quit;
	private String sentence;
	 
	 public void setStart() {
		 this.start=scanner.nextInt();
	}
	 public int scanNumber() {
		 return scanner.nextInt();
	 }
	 public int getStartNumber() {
		return this.start;
	}
	 public int getRotationNumber() {
		return this.rotation;
	}
	 public String getText() {
		return this.sentence;
	}
	 
	 public void scanForText() {
		 emptyScanner();
		 this.sentence=this.scanner.nextLine();
	 }
	 
	 
	 public void emptyScanner() {
		 this.scanner.nextLine();
	 }
	 
	 public  void validateNumber() {
		 int number;
		    do {
		        while (!this.scanner.hasNextInt()) {
		            System.out.println("invalid number");
		            this.scanner.next();
		        }
		        number = this.scanner.nextInt();
		    } while (number >= 4);
		    this.start=number;
		  }
	 
	 public  void validateNumberRotation() {
		 int number;
		    do {
		        while (!this.scanner.hasNextInt()) {
		            System.out.println("invalid number");
		            this.scanner.next();
		        }
		        number = this.scanner.nextInt();
		    } while (number <= 0);
		    this.rotation=number;
	 }
}
