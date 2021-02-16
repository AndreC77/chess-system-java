package br.com.chessmatch.chess;

import br.com.chessmatch.boardgame.Board;
import br.com.chessmatch.boardgame.Piece;

public class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
