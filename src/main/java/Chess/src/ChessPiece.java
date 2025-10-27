package Chess.src;
// Final Project: Uliana Boikova
import java.util.ArrayList;

/**
 The ChessPiece class should change the position of a given shape and return a list of positions available for movement.
 */
public class ChessPiece {
    private final ChessField chessField;
    private String chessPosition;

    private final String color;

    private boolean isDead;
    private final String chessPicture;

    /**
     Constructs a chess board with a chess piece in a given position.
     @param chessField the chess board
     @param position a given position
     */
    public ChessPiece(ChessField chessField, String position, String color, String picture) {
        this.chessField = chessField;
        chessPosition = position;
        chessPicture = picture;
        this.color = color;
        isDead = false;
        chessField.addCell(position, color);
    }


    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    /**
     Gets position of the chess piece.
     @return position
     */
    public String getChessPosition() {
        return chessPosition;
    }

    /**
     Gets chess field.
     @return chess field.
     */
    public ChessField getChessField() {
        return chessField;
    }

    /**
     Gets color of the chess piece.
     @return color
     */
    public String getColor() {
        return color;
    }

    public String getChessPicture() {
        return chessPicture;
    }

    /**
     Change the position of a chess piece to a new value.
     @param newPosition a new position
     */
    public void setPosition(String newPosition) {
        getChessField().changeChess(chessPosition, newPosition);
        chessPosition = newPosition;
    }

    /**
     Lists valid moves from the current position.
     @return List of valid moves
     */
    public ArrayList<String> canMoveTo() {
        return new ArrayList<String>();
    }

    /**
     Returns the string value of the position of the given shape.
     @param colon the colon number
     @param row the row number
     @return the string value of the position
     */
    public static String positionToString(int colon, int row) {
        Integer letter = (colon + 97);
        String number = String.valueOf((row + 1));
        String s = Character.toString (letter) + number;
        return s;
    }


}
