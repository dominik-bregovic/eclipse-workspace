import java.util.Scanner;

public class Disc {
	private static int countDisc;
	private Scanner scanner;
	private String checkIfDiscEntered = "";
	private char disc;
	
	public Disc(Scanner scanner) {
		this.scanner = scanner;
		countDisc++;
	}
	
	// handle the disc as a String at first to perform string methods on it
	// then convert to char
	public void readSymbol() {
		while (this.checkIfDiscEntered.equals("") || this.checkIfDiscEntered.length() != 1) {
			System.out.print("Symbol for player "+ countDisc +":");
			this.checkIfDiscEntered = this.scanner.nextLine();
		}
		this.disc = this.checkIfDiscEntered.charAt(0);
	}
	
	public char getChar() {
		return this.disc;
	}
	
}
