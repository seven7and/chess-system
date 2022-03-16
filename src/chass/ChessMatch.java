package chass;

import boardgame.Board;
import boardgame.Position;
import chass.piece.Rook;

public class ChessMatch {

    private Board board;


    public ChessMatch() {
        board = new Board(8,8);
        initialSetup();
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

    public void initialSetup(){
        board.placePiece(new Rook(board, Color.BLACK), new Position(2,4));
    }

}
