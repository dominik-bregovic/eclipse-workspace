import java.util.Scanner;

public class Game {
	private Error error;
	private Player player1;
	private Player player2;
	private Box box;
	private int turn = 1;
	private boolean gameNotFinished = true;
	private String finishType;
	private Player winner;
	
	public Game(FileHandler file) {
		Scanner scanner = new Scanner(System.in);
		initializeGame(scanner, file);
		playGame(scanner);
		endGame(file);
		scanner.close();
	}
	
//level 1-------------------------------------
	public void initializeGame(Scanner scanner, FileHandler file) {
		createPlayers(scanner);
		createBox(); 
		file.createFile();
	}
	/*outer part is for palying until game is finished
	  inner part is for printing an error message if one occurs and reseting it to null
	  for next input (turn)
	  when exception is throwen then the player stayes on turn becaus the counter is 
	  not excecuted
	 */
	public void playGame(Scanner scanner) {
		while (this.gameNotFinished) {
			do {
				printFieldState();
				playTurn(scanner);
				checkForFinish();
				System.out.println("\n\n");
			} while (this.error != null);
		}
	}
	
	public void endGame(FileHandler file) {
		printFinalState();
//		file.saveResult(this.box, this.winner, this.turn, this.finishType);
	}
	
//----------------------------------------------------------------
// Level 2
	
	

	public void createPlayers(Scanner scanner) {
			this.player1 = new Player(scanner);
			this.player1.readName();
			this.player1.chooseSymbol();
			
			this.player2 = new Player(scanner);
			this.player2.readName();
			this.player2.chooseSymbol();
	}
	
	public void createBox() {
		this.box = new Box();
	}
	
	public void createFile(FileHandler file) {
		file.createFile();
	}
	
	public void printFieldState() {
		printErrorIfInvalidTurn();
		printField();
		printTurnState();
	}
	
	// includes wrong statement exception (no number!) and index out of bounds
	// i put them together in one exception
	// the error class is null as long as a exception occurs
	public void playTurn(Scanner scanner) {
		if (this.turn %2 != 0) {
			try {
				this.player1.chooseColumn(scanner);
				this.box.update(this.player1);
				this.turn++;
			} catch (Exception e) {
				this.error = new Error();
				scanner.nextLine();
			}
		} else {
			try {
				this.player2.chooseColumn(scanner);
				this.box.update(this.player2);
				this.turn++;
			} catch (Exception e) {
				this.error = new Error();
				scanner.nextLine();
			}
		}
	}
	
	public void checkForFinish() {
		if(this.turn < 43) {
			checkForWinner();
		} else {
			this.finishType = "Draw";
			this.gameNotFinished = false;
		}
		
	}
	public void printFinalState() {
	
		printField();
		
		if (this.finishType.equals("Winner")) {
			System.out.print("Winner after " + --this.turn + " turns: " + this.winner.getName());
		} else {
			System.out.println("Game over! Draw!");
		}
	}
//-----------------------------------------------------------------------------	
// level 3
	
	public void printErrorIfInvalidTurn() {
		if (this.error != null) {
			System.out.println(this.error.getMsg());
			this.error = null;
		}
	}
	
	public void printField() {
		System.out.println("\n 1 2 3 4 5 6 7");
		
		printBox();
		
		for (int i = 0; i < 15; i++) {
			System.out.print("-");
		}
		System.out.println("\n 1 2 3 4 5 6 7\n");
	}
	
	public void printBox() {
		
		for (int i = 0; i < this.box.getTile().length; i++) {
			for (int j = 0; j < this.box.getTile()[i].length; j++) {
				System.out.print("|");
				
				if (this.box.getTile()[i][j].getTileDisc() == null) {
					
					System.out.print(" ");
				}else {
					System.out.print(this.box.getTile()[i][j].getTileDisc().getChar());
				}
			}
			System.out.println("|");
		}
	}
	
	public void printTurnState() {
		
		if (this.turn %2 != 0) {
			System.out.print(this.player1.getName() + " (Turn " + this.turn + "): ");
		} else {
			System.out.print(this.player2.getName() + " (Turn " + this.turn + "): ");
		}
	}
	
	public void checkForWinner() {
		// to change the necessary discs needed for winning
		// for 2 discs: a=b=c;
		// for 3 discs : c=b;
		int a = 1; int b = 2; int c = 3;
		
		checkHorizontal(a, b, c);
		checkVertikal(a, b, c);
		checkLeftDiagonal(a, b, c);
		checkRightDiagonal(a, b, c);
		
	}
	
	public void checkHorizontal(int a, int b, int c) {
		
		//	Horizontal
		
		//Player1
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= 3; j++){
				if(this.box.getTile()[i][j].getTileDisc() == player1.getPlayerDisc() &&
					this.box.getTile()[i][j+a].getTileDisc() == player1.getPlayerDisc() &&
					this.box.getTile()[i][j+b].getTileDisc() == player1.getPlayerDisc() &&
					this.box.getTile()[i][j+c].getTileDisc() == player1.getPlayerDisc()) {
					
					this.finishType = "Winner";
					this.winner = this.player1;
					this.gameNotFinished = false;
				}
			}
		}
		//Player2
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= 3; j++){
				if(this.box.getTile()[i][j].getTileDisc() == player2.getPlayerDisc() &&
					this.box.getTile()[i][j+a].getTileDisc() == player2.getPlayerDisc() &&
					this.box.getTile()[i][j+b].getTileDisc() == player2.getPlayerDisc() &&
					this.box.getTile()[i][j+c].getTileDisc() == player2.getPlayerDisc()) {
					
					this.finishType = "Winner";
					this.winner = this.player2;
					this.gameNotFinished = false;
				}
			}
		}	
	}
	
	public void checkVertikal(int a, int b, int c) {
		
		
		//Player1
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 6; j++){
				if(this.box.getTile()[i][j].getTileDisc() == player1.getPlayerDisc() &&
					this.box.getTile()[i+a][j].getTileDisc() == player1.getPlayerDisc() &&
					this.box.getTile()[i+b][j].getTileDisc() == player1.getPlayerDisc() &&
					this.box.getTile()[i+c][j].getTileDisc() ==player1.getPlayerDisc()) {
					
					this.finishType = "Winner";
					this.winner = this.player1;
					this.gameNotFinished = false;
				}
			}
		}
		//Player2
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 6; j++){
				if(this.box.getTile()[i][j].getTileDisc() == player2.getPlayerDisc() &&
					this.box.getTile()[i+a][j].getTileDisc() == player2.getPlayerDisc() &&
					this.box.getTile()[i+b][j].getTileDisc() == player2.getPlayerDisc() &&
					this.box.getTile()[i+c][j].getTileDisc() == player2.getPlayerDisc()) {
					
					this.finishType = "Winner";
					this.winner = this.player2;
					this.gameNotFinished = false;
				}
			}
		}
	}
	
	
	public void checkLeftDiagonal(int a, int b, int c) {
		
		//check diagonal to the right hand side
			
			//Player1
			for(int i = 0; i < 3; i++){
				for(int j = 6; j > 2; j--){
					if(this.box.getTile()[i][j].getTileDisc() == player1.getPlayerDisc() &&
						this.box.getTile()[i+a][j-a].getTileDisc() == player1.getPlayerDisc() &&
						this.box.getTile()[i+b][j-b].getTileDisc() == player1.getPlayerDisc() &&
						this.box.getTile()[i+c][j-c].getTileDisc() == player1.getPlayerDisc()) {
						
						this.finishType = "Winner";
						this.winner = this.player1;
						this.gameNotFinished = false;
					}
				}
			}
			//Player2
			for(int i = 0; i < 3; i++){
				for(int j = 6; j > 2; j--){
					if(this.box.getTile()[i][j].getTileDisc() == player2.getPlayerDisc() &&
						this.box.getTile()[i+a][j-a].getTileDisc() == player2.getPlayerDisc() &&
						this.box.getTile()[i+b][j-b].getTileDisc() == player2.getPlayerDisc() &&
						this.box.getTile()[i+c][j-c].getTileDisc() == player2.getPlayerDisc()) {
						
						this.finishType = "Winner";
						this.winner = this.player2;
						this.gameNotFinished = false;
					}
				}
			}
	}
	
	
	public void checkRightDiagonal(int a, int b, int c) {
		
		//check diagonal to the left hand side
		
		//Player1
		for(int i = 0; i < 3; i++){
		    for(int j = 0; j < 4; j++){
		        if(this.box.getTile()[i][j].getTileDisc() == player1.getPlayerDisc() &&
	        		this.box.getTile()[i+a][j+a].getTileDisc() == player1.getPlayerDisc() &&
    				this.box.getTile()[i+b][j+b].getTileDisc() == player1.getPlayerDisc() &&
					this.box.getTile()[i+c][j+c].getTileDisc() == player1.getPlayerDisc()) {
		        	
		        	this.finishType = "Winner";
		        	this.winner = this.player1;
					this.gameNotFinished = false;
		        }
		    }
		}
		
		//Player2
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				if(this.box.getTile()[i][j].getTileDisc() == player2.getPlayerDisc() &&
					this.box.getTile()[i+1][j+1].getTileDisc() == player2.getPlayerDisc() &&
					this.box.getTile()[i+2][j+2].getTileDisc() == player2.getPlayerDisc() &&
					this.box.getTile()[i+3][j+3].getTileDisc() == player2.getPlayerDisc()) {
					
					this.finishType = "Winner";
					this.winner = this.player2;
					this.gameNotFinished = false;
				}
			}
		}
	}
	public Box getBox() {
		return this.box;
	}

	public int getTurn() {
		return this.turn;
	}

	public String getFinishType() {
		return this.finishType;
	}

	public Player getWinner() {
		return this.winner;
	}
	
	public Player getPlayer1() {
		return this.player1;
	}
	public Player getPlayer2() {
		return this.player2;
	}

}
