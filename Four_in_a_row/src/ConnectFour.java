public class ConnectFour {
	public static void main(String[] args) {
		
		System.out.println("\n===Connect Four===");
		FileHandler file = new FileHandler();
		Game game = new Game(file);
		file.saveResult(game);
		
	}
}
