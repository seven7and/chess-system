package chass;

import boardgame.Board;

public class ChessMatch {

    private Board board;


    public ChessMatch() {
        board = new Board(8,8);
    }


    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) { // Walked the line
            for (int j = 0; j < board.getColumns(); j++) { // Walked the columns.
                mat[i][j] = (ChessPiece) board.piece(i, j); //downcast for him to interpret that it is a ChessPiece and not an ordinary Piece.
            }
        }
        return mat;
    }

}
