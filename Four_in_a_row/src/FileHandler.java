import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileHandler {
	
	public void createFile() {
		try {
			File file = new File("result.txt");
			if (file.createNewFile()) {
//		        System.out.println("File created: " + file.getName());
			} else {
//		        System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred while creating file");
			e.printStackTrace();
		}
	}
	
	// was not successfull with filewriter so choose the printstream way
	public void saveResult(Game game) {
		PrintStream standard_out = System.out;
		try {
			System.setOut(new PrintStream(new FileOutputStream("result.txt")));
			System.out.println("Player 1: " + game.getPlayer1().getName() + " (" + game.getPlayer1().getPlayerDisc().getChar() + ")");
			System.out.println("Player 2: " + game.getPlayer2().getName() + " (" + game.getPlayer2().getPlayerDisc().getChar() + ")");
			game.printFinalState();
		} catch (FileNotFoundException e) {
			System.setOut(standard_out);
			e.printStackTrace();
		}
	}
}
