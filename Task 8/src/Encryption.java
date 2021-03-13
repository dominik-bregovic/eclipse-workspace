import java.util.Scanner;

public class Encryption {
	
	
	
	public static void main(String[] args) {
		int number;
		
		//Choose program
		ScanInput scanner = new ScanInput();
		Encryption_process encrypt = new Encryption_process();
		encrypt.chooseProgramm();
		
		// ask for number(gets validated here)
		scanner.validateNumber();
		number=scanner.getStartNumber();
		
		// go for chosen program/ Encrypt or Decrypt
			if (number==1) {
				System.out.print("  Enter rotation: ");
				encrypt.enterRotation();
				encrypt.encryptWord();
				
			}else if (number==2) {
				System.out.println("  out of order :D");
			}else if (number==3) {
				System.out.println("  Good Bye");
			}
			
	}

}
