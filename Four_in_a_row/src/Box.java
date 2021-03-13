
public class Box {
	private Tile[][] tiles = new Tile [6][7];
	
	public Box() {
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				this.tiles[i][j] = new Tile();
			}
		}
	}
	
	
	//have to do a check for chosen Tiles for the 6 rows
	//if rows are full then throw exception
	public void update(Player player) throws Exception {
			if (this.tiles[5][player.getColumn() - 1].getTileDisc() == null) {
				this.tiles[5][player.getColumn() - 1].setTileDisc(player.getPlayerDisc());
			}else if (this.tiles[4][player.getColumn() - 1].getTileDisc() == null) {
				this.tiles[4][player.getColumn() - 1].setTileDisc(player.getPlayerDisc());
			}else if (this.tiles[3][player.getColumn() - 1].getTileDisc() == null) {
				this.tiles[3][player.getColumn() - 1].setTileDisc(player.getPlayerDisc());
			}else if (this.tiles[2][player.getColumn() - 1].getTileDisc() == null) {
				this.tiles[2][player.getColumn() - 1].setTileDisc(player.getPlayerDisc());
			}else if (this.tiles[1][player.getColumn() - 1].getTileDisc() == null) {
				this.tiles[1][player.getColumn() - 1].setTileDisc(player.getPlayerDisc());
			}else if (this.tiles[0][player.getColumn() - 1].getTileDisc() == null) {
				this.tiles[0][player.getColumn() - 1].setTileDisc(player.getPlayerDisc());
			}else {
				throw new Exception();
			}
	}
	
	
	public Tile[][] getTile() {
		return this.tiles;
	}
}
         