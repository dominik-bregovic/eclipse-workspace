import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Words words = new Words();
	Game logic = new Game();
	Hangman hang = new Hangman();
	
	logic.generateHeader();
	logic.printState();
	logic.guessWord();
		
	}

}
