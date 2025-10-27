package Chess.src;

// Final Project: Uliana Boikova

import java.util.ArrayList;

/**
 The ChessPiece class should change the position of a queen and return a list of positions available for movement.
 */
public class Queen extends ChessPiece {

    /**
     Overrides constructor of the ChessPiece class and constructs a chess board with a chess piece in a given position.
     @param chessField the chess board
     @param position a given position
     @param color a given chess color
     */
    public Queen(ChessField chessField, String position, String color, String picture) {
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
            int i = 1;
            while(xCoordinate + i < 8) {
                if (getChessField().getPositionValue(positionToString(yCoordinate, xCoordinate + i)).equals("None ")) {
                    positions.add(positionToString(yCoordinate, xCoordinate + i));
                    i++;
                }
                else if (getChessField().getPositionValue(positionToString(yCoordinate, xCoordinate + i)).equals("Black")) {
                    positions.add(positionToString(yCoordinate, xCoordinate + i));
                    break;
                }
                else break;
            }
            i = 1;
            while(xCoordinate - i >= 0) {
                if (getChessField().getPositionValue(positionToString(yCoordinate, xCoordinate - i)).equals("None ")) {
                    positions.add(positionToString(yCoordinate, xCoordinate - i));
                    i++;
                }
                else if (getChessField().getPositionValue(positionToString(yCoordinate, xCoordinate - i)).equals("Black")) {
                    positions.add(positionToString(yCoordinate, xCoordinate - i));
                    break;
                }
                else break;
            }
            i = 1;
            while(yCoordinate + i < 8) {
                if (getChessField().getPositionValue(positionToString(yCoordinate + i, xCoordinate)).equals("None ")) {
                    positions.add(positionToString(yCoordinate + i, xCoordinate));
                    i++;
                }
                else if (getChessField().getPositionValue(positionToString(yCoordinate + i, xCoordinate)).equals("Black")) {
                    positions.add(positionToString(yCoordinate + i, xCoordinate));
                    break;
                }
                else break;
            }
            i = 1;
            while(yCoordinate - i >= 0) {
                if (getChessField().getPositionValue(positionToString(yCoordinate - i, xCoordinate)).equals("None ")) {
                    positions.add(positionToString(yCoordinate - i, xCoordinate));
                    i++;
                }
                else if (getChessField().getPositionValue(positionToString(yCoordinate - i, xCoordinate)).equals("Black")) {
                    positions.add(positionToString(yCoordinate - i, xCoordinate));
                    break;
                }
                else break;
            }
            i = 1;
            while(xCoordinate + i < 8 && yCoordinate + i < 8) {
                if (getChessField().getPositionValue(positionToString(yCoordinate + i, xCoordinate + i)).equals("None ")) {
                    positions.add(positionToString(yCoordinate + i, xCoordinate + i));
                    i++;
                }
                else if (getChessField().getPositionValue(positionToString(yCoordinate + i, xCoordinate + i)).equals("Black")) {
                    positions.add(positionToString(yCoordinate + i, xCoordinate + i));
                    break;
                }
                else break;
            }
            i = 1;
            while(xCoordinate - i >= 0 && yCoordinate - i >= 0) {
                if (getChessField().getPositionValue(positionToString(yCoordinate - i, xCoordinate - i)).equals("None ")) {
                    positions.add(positionToString(yCoordinate - i, xCoordinate - i));
                    i++;
                }
                else if (getChessField().getPositionValue(positionToString(yCoordinate - i, xCoordinate - i)).equals("Black")) {
                    positions.add(positionToString(yCoordinate - i, xCoordinate - i));
                    break;
                }
                else break;
            }
            i = 1;
            while(yCoordinate + i < 8 && xCoordinate - i >= 0) {
                if (getChessField().getPositionValue(positionToString(yCoordinate + i, xCoordinate - i)).equals("None ")) {
                    positions.add(positionToString(yCoordinate + i, xCoordinate - i));
                    i++;
                }
                else if (getChessField().getPositionValue(positionToString(yCoordinate + i, xCoordinate - i)).equals("Black")) {
                    positions.add(positionToString(yCoordinate + i, xCoordinate - i));
                    break;
                }
                else break;
            }
            i = 1;
            while(yCoordinate - i >= 0 && xCoordinate + i < 8) {
                if (getChessField().getPositionValue(positionToString(yCoordinate - i, xCoordinate + i)).equals("None ")) {
                    positions.add(positionToString(yCoordinate - i, xCoordinate + i));
                    i++;
                } else if (getChessField().getPositionValue(positionToString(yCoordinate - i, xCoordinate + i)).equals("Black")) {
                    positions.add(positionToString(yCoordinate - i, xCoordinate + i));
                    break;
                } else break;
            }
        }

        // find all position where black chess piece can move
        if (getColor().equals("Black")) {
            int yCoordinate = getChessPosition().charAt(0) - 97;
            int xCoordinate = getChessPosition().charAt(1) - 49;
            int i = 1;
            while(xCoordinate + i < 8) {
                if (getChessField().getPositionValue(positionToString(yCoordinate, xCoordinate + i)).equals("None ")) {
                    positions.add(positionToString(yCoordinate, xCoordinate + i));
                    i++;
                }
                else if (getChessField().getPositionValue(positionToString(yCoordinate, xCoordinate + i)).equals("White")) {
                    positions.add(positionToString(yCoordinate, xCoordinate + i));
                    break;
                }
                else break;
            }
            i = 1;
            while(xCoordinate - i >= 0) {
                if (getChessField().getPositionValue(positionToString(yCoordinate, xCoordinate - i)).equals("None ")) {
                    positions.add(positionToString(yCoordinate, xCoordinate - i));
                    i++;
                }
                else if (getChessField().getPositionValue(positionToString(yCoordinate, xCoordinate - i)).equals("White")) {
                    positions.add(positionToString(yCoordinate, xCoordinate - i));
                    break;
                }
                else break;
            }
            i = 1;
            while(yCoordinate + i < 8) {
                if (getChessField().getPositionValue(positionToString(yCoordinate + i, xCoordinate)).equals("None ")) {
                    positions.add(positionToString(yCoordinate + i, xCoordinate));
                    i++;
                }
                else if (getChessField().getPositionValue(positionToString(yCoordinate + i, xCoordinate)).equals("White")) {
                    positions.add(positionToString(yCoordinate + i, xCoordinate));
                    break;
                }
                else break;
            }
            i = 1;
            while(yCoordinate - i >= 0) {
                if (getChessField().getPositionValue(positionToString(yCoordinate - i, xCoordinate)).equals("None ")) {
                    positions.add(positionToString(yCoordinate - i, xCoordinate));
                    i++;
                }
                else if (getChessField().getPositionValue(positionToString(yCoordinate - i, xCoordinate)).equals("White")) {
                    positions.add(positionToString(yCoordinate - i, xCoordinate));
                    break;
                }
                else break;
            }
            i = 1;
            while(xCoordinate + i < 8 && yCoordinate + i < 8) {
                if (getChessField().getPositionValue(positionToString(yCoordinate + i, xCoordinate + i)).equals("None ")) {
                    positions.add(positionToString(yCoordinate + i, xCoordinate + i));
                    i++;
                }
                else if (getChessField().getPositionValue(positionToString(yCoordinate + i, xCoordinate + i)).equals("White")) {
                    positions.add(positionToString(yCoordinate + i, xCoordinate + i));
                    break;
                }
                else break;
            }
            i = 1;
            while(xCoordinate - i >= 0 && yCoordinate - i >= 0) {
                if (getChessField().getPositionValue(positionToString(yCoordinate - i, xCoordinate - i)).equals("None ")) {
                    positions.add(positionToString(yCoordinate - i, xCoordinate - i));
                    i++;
                }
                else if (getChessField().getPositionValue(positionToString(yCoordinate - i, xCoordinate - i)).equals("White")) {
                    positions.add(positionToString(yCoordinate - i, xCoordinate - i));
                    break;
                }
                else break;
            }
            i = 1;
            while(yCoordinate + i < 8 && xCoordinate - i >= 0) {
                if (getChessField().getPositionValue(positionToString(yCoordinate + i, xCoordinate - i)).equals("None ")) {
                    positions.add(positionToString(yCoordinate + i, xCoordinate - i));
                    i++;
                }
                else if (getChessField().getPositionValue(positionToString(yCoordinate + i, xCoordinate - i)).equals("White")) {
                    positions.add(positionToString(yCoordinate + i, xCoordinate - i));
                    break;
                }
                else break;
            }
            i = 1;
            while(yCoordinate - i >= 0 && xCoordinate + i < 8) {
                if (getChessField().getPositionValue(positionToString(yCoordinate - i, xCoordinate + i)).equals("None ")) {
                    positions.add(positionToString(yCoordinate - i, xCoordinate + i));
                    i++;
                }
                else if (getChessField().getPositionValue(positionToString(yCoordinate - i, xCoordinate + i)).equals("White")) {
                    positions.add(positionToString(yCoordinate - i, xCoordinate + i));
                    break;
                }
                else break;
            }
        }
        return positions;
    }


}

