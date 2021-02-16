package br.com.chessmatch.chess.pieces;

import br.com.chessmatch.boardgame.Board;
import br.com.chessmatch.chess.ChessPiece;
import br.com.chessmatch.chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);

	}

	@Override
	public String toString() {
		return "K";
	}

}
