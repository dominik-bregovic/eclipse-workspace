import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
public class Words {
	
	private int randomNumber;
	private int amountWords;
	private String word;
	private String words[] = new String[10];
	
	
	// reading though the file and counting the words and then safe every word in words[], after every word is a \n 
	public void fileReader() {
		try {
			File datei = new File("data/HangmanWords.txt"); // relative path
			Scanner scan = new Scanner(datei);
				while (scan.hasNextLine()) {
					this.word = scan.nextLine();					//going through lines
					this.words[this.amountWords] = this.word;
					this.amountWords++;								//counts each line
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void randomNumber() {
		Random rn = new Random();
		for(int i =0; i < 1; i++){
		   this.randomNumber = rn.nextInt(10);
		}
	}
	
	public int getRandom() {
		return this.randomNumber;
	}
	
	public String[] getWords() {
		return this.words;
	}
	
	public String randomWord() {
		return this.words[randomNumber];
	}
	
	public int getAmoutWords() {
		return this.amountWords;
	}
	}


