package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		//So colou o board, p/ intepretar a peça como nula
		this.board = board;
		position=null;
		
	}
	// utilizar o tabueleiro com interno
	public Board getBoard() {
		return board;
	}



	
	
}
