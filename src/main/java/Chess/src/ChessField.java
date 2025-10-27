package Chess.src;
// Final Project: Uliana Boikova

/**
 The ChessField class should show the condition of the chess board.
 */
public class ChessField {
    private final String[][] chess;

    /**
     Constructs a chess board.
     */
    public ChessField() {
        chess = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chess[i][j] = "None ";
            }
        }
    }

    /**
     Adds a chess piece to the chess board with a given position and color.
     * @param position the chess position
     * @param color the chess color
     */
    public void addCell(String position, String color) {
        chess[position.charAt(0) - 97][position.charAt(1) - 49] = color;
    }

    /**
     Gets value of the given position.
     @param position the chess position
     @return value of the given position
     */
    public String getPositionValue(String position) {
        return chess[position.charAt(0) - 97][position.charAt(1) - 49];
    }


    /**
     Switches values of the two positions.
     @param position1 first position
     @param position2 second position
     */
    public void changeChess(String position1, String position2) {
        chess[position2.charAt(0) - 97][position2.charAt(1) - 49] =
                chess[position1.charAt(0) - 97][position1.charAt(1) - 49];
        chess[position1.charAt(0) - 97][position1.charAt(1) - 49] = "None ";
    }

    /**
     Sets to a given position needed value.
     @param position a given position
     @param value a new value
     */
    public void setPositionalValue(String position, String value) {
        chess[position.charAt(0) - 97][position.charAt(1) - 49] = value;
    }

    /**
     Returns condition of the chess board.
     @return condition of the chess board
     */
    public String toString() {
        String result = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                result += chess[j][7 - i] + " ";
            }
            result += "\n";
        }
        return result;
    }
}

/*
Black Black Black Black Black Black Black Black
Black Black Black Black Black Black Black Black
None  None  None  None  None  None  None  None
None  None  None  None  None  None  None  None
None  None  None  None  None  None  None  None
None  None  None  None  None  None  None  None
White White White White White White White White
White White White White White White White White
 */