package Chess.src;

// Final Project: Uliana Boikova

import java.util.ArrayList;

/**
 The ChessPiece class should change the position of a pawn and return a list of positions available for movement.
 */

public class Pawn extends ChessPiece {

    /**
     Overrides constructor of the ChessPiece class and constructs a chess board with a chess piece in a given position.
     @param chessField the chess board
     @param position a given position
     @param color a given chess color
     */
    public Pawn(ChessField chessField, String position, String color, String picture) {
        super(chessField, position, color, picture);
    }


    /**
     Overrides method canMoveTo from ChessPiece class.
     @return List of valid moves
     */
    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> positions = new ArrayList<>();
        // find all position where white chess piece can move
        if (getColor().equals("White")) {
            if (getChessPosition().charAt(1) - 49 + 1 < 8 &&
                    getChessField().getPositionValue(positionToString(getChessPosition().charAt(0) - 97,
                            getChessPosition().charAt(1) - 49 + 1)).equals("None ")) {
                positions.add(positionToString(getChessPosition().charAt(0) - 97,
                        getChessPosition().charAt(1) - 49 + 1));
            }
            if (getChessPosition().charAt(0) - 97 + 1 < 8 && getChessPosition().charAt(1) - 49 + 1 < 8 &&
                   getChessField().getPositionValue(positionToString(getChessPosition().charAt(0) - 97 + 1,
                            getChessPosition().charAt(1) - 49 + 1)).equals("Black")) {
                positions.add(positionToString(getChessPosition().charAt(0) - 97 + 1,
                        getChessPosition().charAt(1) - 49 + 1));
            }
            if (getChessPosition().charAt(0) - 97 - 1 >= 0 && getChessPosition().charAt(1) - 49 + 1 < 8 &&
                    getChessField().getPositionValue(positionToString(getChessPosition().charAt(0) - 97 - 1,
                            getChessPosition().charAt(1) - 49 + 1)).equals("Black")) {
                positions.add(positionToString(getChessPosition().charAt(0) - 97 - 1,
                        getChessPosition().charAt(1) - 49 + 1));
            }
            if (getChessPosition().charAt(1) - 49 == 1 && getChessField().getPositionValue(positionToString(getChessPosition().charAt(0) - 97,
                    getChessPosition().charAt(1) - 49 + 2)).equals("None ")) {
                positions.add(positionToString(getChessPosition().charAt(0) - 97,
                        getChessPosition().charAt(1) - 49 + 2));
            }
        }
        // find all position where black chess piece can move
        if (getColor().equals("Black")) {
            if (getChessPosition().charAt(1) - 49 - 1 >= 0 &&
                    getChessField().getPositionValue(positionToString(getChessPosition().charAt(0) - 97,
                            getChessPosition().charAt(1) - 49 - 1)).equals("None ")) {
                positions.add(positionToString(getChessPosition().charAt(0) - 97,
                        getChessPosition().charAt(1) - 49 - 1));
            }
            if (getChessPosition().charAt(1) - 49 - 1 >= 0 && getChessPosition().charAt(0) - 97 + 1 < 8 &&
                    getChessField().getPositionValue(positionToString(getChessPosition().charAt(0) - 97 + 1,
                            getChessPosition().charAt(1) - 49 - 1)).equals("White")) {
                positions.add(positionToString(getChessPosition().charAt(0) - 97 + 1,
                        getChessPosition().charAt(1) - 49 - 1));
            }
            if (getChessPosition().charAt(0) - 97 - 1 >= 0 && getChessPosition().charAt(1) - 49 - 1 >= 0 &&
                    getChessField().getPositionValue(positionToString(getChessPosition().charAt(0) - 97 - 1,
                            getChessPosition().charAt(1) - 49 - 1)).equals("White")) {
                positions.add(positionToString(getChessPosition().charAt(0) - 97 - 1,
                        getChessPosition().charAt(1) - 49 - 1));
            }
            if (getChessPosition().charAt(1) - 49 == 6 && getChessField().getPositionValue(positionToString(getChessPosition().charAt(0) - 97,
                    getChessPosition().charAt(1) - 49 - 2)).equals("None ")) {
                positions.add(positionToString(getChessPosition().charAt(0) - 97,
                        getChessPosition().charAt(1) - 49 - 2));
            }
        }
        return positions;
    }


}
