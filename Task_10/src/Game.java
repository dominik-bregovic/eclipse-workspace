import java.util.Scanner;

public class Game {
	private Scanner scan = new Scanner(System.in);
	private Words words = new Words();
	private Hangman hang = new Hangman();
	private int amountOfLetters;
	private int rightLetter;
	private int missedTry = 0;
	private boolean gameOver = false;
	private String randomWord;	//"Word" with first Uppercase
	private String randomWord2;	//"word" toLowercase
	private char randomLetter;
	private char randomLetter2;
	private char line = '-';
	private String scannedLetter;
	private String missedLetter;
	private char firstScannedLetter;
	
//-------------HELPER METHODS---------------------------------------	
	public void generateHeader() {
		words.fileReader();
		words.randomNumber();
		startHeader();
	}
	
	public void printState() {
		
		getRandomWord();
		determineWordLength();
		
		System.out.print("Word: ");
		for (int i = 0; i < this.amountOfLetters; i++) {
			System.out.print("-");
		} 
		System.out.print(this.randomWord);		//only for testing 
		System.out.println("\nMissed: ("+this.missedTry+"/11)");
	}
	
	public void startHeader() {
		for (int i = 0; i < 80; i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.print("Hangman");
		System.out.println(" ("+this.words.getAmoutWords()+" Words)");
		
		for (int i = 0; i < 80; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("Word #1:");
		System.out.println("\n");
	}
	
	public void getRandomWord() {
		this.randomWord = this.words.randomWord();
	}
	
	public void determineWordLength() {
		this.amountOfLetters = this.randomWord.length();
	}
		
	public void toLowerCase() {
		this.randomWord2 = this.randomWord.toLowerCase();
		this.scannedLetter = this.scannedLetter.toLowerCase();
	}
//-----------------------------------------------------------------------------------------
	
	public void guessWord() {
		char foundLetter[] = new char[this.randomWord.length()];
		for (int i = 0; i < this.randomWord.length(); i++) {
			foundLetter[i] = this.line;
		}
		
		while (!gameOver) {
			this.scannedLetter = this.scan.next();
			this.scan.nextLine();
			toLowerCase();
			char letters[]= this.scannedLetter.toCharArray();
			System.out.println("\n");
			if (!this.randomWord2.contains(this.scannedLetter)) {
				this.missedTry++;
				
				// printing the missed letter and the image
				System.out.println(missedLetter = scannedLetter.toUpperCase());
				this.hang.hang1(this.missedTry);
			}
			System.out.print("Word: ");
		
			// right letter saved into array of random word
			for (int i = 0; i < this.randomWord.length(); i++) {
				this.randomLetter = this.randomWord.charAt(i);		//normalcase Word is saved into random letter only for printing
				this.randomLetter2 = this.randomWord2.charAt(i);	//lowercase Word is going to get checked
				this.firstScannedLetter = letters[0];				//scanned letter is saved into this.first.. for checking with letters of word
				
				if (this.randomLetter2 == this.firstScannedLetter) {	// here is the checking point
					foundLetter[i] = this.randomLetter;				// i have to determine when it is wrong and when true and save it 
					this.rightLetter++;
				}
			}
			
			// closing program when max missed tries have been entered
			if (this.missedTry==11) {
				System.out.print(foundLetter);
				System.out.println("\nMissed: ("+this.missedTry+"/11)");
				System.out.println("\nYOU LOSE!");
				for (int i = 0; i < 80; i++) {
					System.out.print("=");
				}
				gameOver = true;
				break;
			}else if (this.amountOfLetters == this.rightLetter) {
				System.out.print(foundLetter);
				System.out.println("\nMissed: ("+this.missedTry+"/11)");
				System.out.println("\nYOU WIN!");
				for (int i = 0; i < 80; i++) {
					System.out.print("-");
				}
				gameOver = true;
				break;
			}else if (this.randomWord2.contains(this.scannedLetter)) {
				System.out.print(foundLetter);
				System.out.println("\nMissed: ("+this.missedTry+"/11)");
				
			}else {
				System.out.print(foundLetter);
				System.out.println("\nMissed: ("+this.missedTry+"/11)");
			}
		}
	}
}
