package Chess.src;

// Final Project: Uliana Boikova

import java.util.ArrayList;

/**
 The ChessPiece class should change the position of a king and return a list of positions available for movement.
 */
public class King extends ChessPiece {
    /**
     Overrides constructor of the ChessPiece class and constructs a chess board with a chess piece in a given position.
     @param chessField the chess board
     @param position a given position
     @param color a given chess color
     */

    public King(ChessField chessField, String position, String color, String picture) {
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
            int yCoordinate = getChessPosition().charAt(0) - 97;
            int xCoordinate = getChessPosition().charAt(1) - 49;

            if (yCoordinate + 1 < 8 && xCoordinate + 1 < 8 &&
                    (getChessField().getPositionValue(positionToString(yCoordinate + 1,
                            xCoordinate + 1)).equals("None ") ||
                            getChessField().getPositionValue(positionToString(yCoordinate + 1,
                                    xCoordinate + 1)).equals("Black"))) {
                positions.add(positionToString(yCoordinate + 1, xCoordinate + 1));
            }
            if (yCoordinate + 1 < 8 && xCoordinate < 8 &&
                    (getChessField().getPositionValue(positionToString(yCoordinate + 1,
                            xCoordinate)).equals("None ") ||
                            getChessField().getPositionValue(positionToString(yCoordinate + 1,
                                    xCoordinate)).equals("Black"))) {
                positions.add(positionToString(yCoordinate + 1, xCoordinate));
            }
            if (yCoordinate - 1 >= 0 && xCoordinate + 1 < 8 &&
                    (getChessField().getPositionValue(positionToString(yCoordinate - 1,
                            xCoordinate + 1)).equals("None ") ||
                            getChessField().getPositionValue(positionToString(yCoordinate - 1,
                                    xCoordinate + 1)).equals("Black"))) {
                positions.add(positionToString(yCoordinate - 1, xCoordinate + 1));
            }
            if (yCoordinate >= 0 && xCoordinate + 1 < 8 &&
                    (getChessField().getPositionValue(positionToString(yCoordinate,
                            xCoordinate + 1)).equals("None ") ||
                            getChessField().getPositionValue(positionToString(yCoordinate,
                                    xCoordinate + 1)).equals("Black"))) {
                positions.add(positionToString(yCoordinate, xCoordinate + 1));
            }
            if (yCoordinate - 1 >= 0 && xCoordinate - 1 >= 0 &&
                    (getChessField().getPositionValue(positionToString(yCoordinate - 1,
                            xCoordinate - 1)).equals("None ") ||
                            getChessField().getPositionValue(positionToString(yCoordinate - 1,
                                    xCoordinate - 1)).equals("Black"))) {
                positions.add(positionToString(yCoordinate - 1, xCoordinate - 1));
            }
            if (yCoordinate - 1 >= 0 && xCoordinate >= 0 &&
                    (getChessField().getPositionValue(positionToString(yCoordinate - 1,
                            xCoordinate)).equals("None ") ||
                            getChessField().getPositionValue(positionToString(yCoordinate - 1,
                                    xCoordinate)).equals("Black"))) {
                positions.add(positionToString(yCoordinate - 1, xCoordinate));
            }
            if (yCoordinate < 8 && xCoordinate - 1 >= 0 &&
                    (getChessField().getPositionValue(positionToString(yCoordinate,
                            xCoordinate - 1)).equals("None ") ||
                            getChessField().getPositionValue(positionToString(yCoordinate,
                                    xCoordinate - 1)).equals("Black"))) {
                positions.add(positionToString(yCoordinate, xCoordinate - 1));
            }
            if (yCoordinate + 1 < 8 && xCoordinate - 1 >= 0 &&
                    (getChessField().getPositionValue(positionToString(yCoordinate + 1,
                            xCoordinate - 1)).equals("None ") ||
                            getChessField().getPositionValue(positionToString(yCoordinate + 1,
                                    xCoordinate - 1)).equals("Black"))) {
                positions.add(positionToString(yCoordinate + 1, xCoordinate - 1));
            }
        }

        // find all position where black chess piece can move
        if (getColor().equals("Black")) {
            int yCoordinate = getChessPosition().charAt(0) - 97;
            int xCoordinate = getChessPosition().charAt(1) - 49;

            if (yCoordinate + 1 < 8 && xCoordinate + 1 < 8 &&
                    (getChessField().getPositionValue(positionToString(yCoordinate + 1,
                            xCoordinate + 1)).equals("None ") ||
                            getChessField().getPositionValue(positionToString(yCoordinate + 1,
                                    xCoordinate + 1)).equals("White"))) {
                positions.add(positionToString(yCoordinate + 1, xCoordinate + 1));
            }
            if (yCoordinate + 1 < 8 && xCoordinate < 8 &&
                    (getChessField().getPositionValue(positionToString(yCoordinate + 1,
                            xCoordinate)).equals("None ") ||
                            getChessField().getPositionValue(positionToString(yCoordinate + 1,
                                    xCoordinate)).equals("White"))) {
                positions.add(positionToString(yCoordinate + 1, xCoordinate));
            }
            if (yCoordinate - 1 >= 0 && xCoordinate + 1 < 8 &&
                    (getChessField().getPositionValue(positionToString(yCoordinate - 1,
                            xCoordinate + 1)).equals("None ") ||
                            getChessField().getPositionValue(positionToString(yCoordinate - 1,
                                    xCoordinate + 1)).equals("White"))) {
                positions.add(positionToString(yCoordinate - 1, xCoordinate + 1));
            }
            if (yCoordinate >= 0 && xCoordinate + 1 < 8 &&
                    (getChessField().getPositionValue(positionToString(yCoordinate,
                            xCoordinate + 1)).equals("None ") ||
                            getChessField().getPositionValue(positionToString(yCoordinate,
                                    xCoordinate + 1)).equals("White"))) {
                positions.add(positionToString(yCoordinate, xCoordinate + 1));
            }
            if (yCoordinate - 1 >= 0 && xCoordinate - 1 >= 0 &&
                    (getChessField().getPositionValue(positionToString(yCoordinate - 1,
                            xCoordinate - 1)).equals("None ") ||
                            getChessField().getPositionValue(positionToString(yCoordinate - 1,
                                    xCoordinate - 1)).equals("White"))) {
                positions.add(positionToString(yCoordinate - 1, xCoordinate - 1));
            }
            if (yCoordinate - 1 >= 0 && xCoordinate >= 0 &&
                    (getChessField().getPositionValue(positionToString(yCoordinate - 1,
                            xCoordinate)).equals("None ") ||
                            getChessField().getPositionValue(positionToString(yCoordinate - 1,
                                    xCoordinate)).equals("White"))) {
                positions.add(positionToString(yCoordinate - 1, xCoordinate));
            }
            if (yCoordinate < 8 && xCoordinate - 1 >= 0 &&
                    (getChessField().getPositionValue(positionToString(yCoordinate,
                            xCoordinate - 1)).equals("None ") ||
                            getChessField().getPositionValue(positionToString(yCoordinate,
                                    xCoordinate - 1)).equals("White"))) {
                positions.add(positionToString(yCoordinate, xCoordinate - 1));
            }
            if (yCoordinate + 1 < 8 && xCoordinate - 1 >= 0 &&
                    (getChessField().getPositionValue(positionToString(yCoordinate + 1,
                            xCoordinate - 1)).equals("None ") ||
                            getChessField().getPositionValue(positionToString(yCoordinate + 1,
                                    xCoordinate - 1)).equals("White"))) {
                positions.add(positionToString(yCoordinate + 1, xCoordinate - 1));
            }
        }
        return positions;
    }
}

