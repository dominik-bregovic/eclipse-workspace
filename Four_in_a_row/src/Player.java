import java.util.Scanner;

public class Player {
	
	private Disc disc;
	private Scanner scanner;
	private static int playerNumber;
	private int column;
	private String name = "";
	
	
	public Player(Scanner scanner) {
		this.scanner = scanner;
		this.playerNumber++;
	}
	
	public void readName() {
		while (this.name.equals("")) {
			System.out.print("Name of Player "+ this.playerNumber +":" );
			this.name = this.scanner.nextLine();
		}
	}
	
	public void chooseSymbol() {
		this.disc = new Disc(this.scanner);
		this.disc.readSymbol();
	}
	
	public void chooseColumn(Scanner scanner) {
		this.column = scanner.nextInt();
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getColumn() {
		return this.column;
	}
	
	public Disc getPlayerDisc() {
		return this.disc;
	}
		
}
