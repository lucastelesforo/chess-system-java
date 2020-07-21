package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	 
	private  color Color;

	public ChessPiece(Board board, color color) {
		super(board);
		Color = color;
	}

	public color getColor() {
		return Color;
	}

	

}
