package Chess.src;

// Final Project: Uliana Boikova

/**
 The FindChessPiece should return the desired chess piece with its position.
 */
public class FindChessPiece {
    private final ChessPiece chessPiece;
    private String position;

    /**
     Constructs a new FindChessPiece with given chess piece and its new position.
     @param chessPiece a given chess piece.
     @param position a given position.
     */
    public FindChessPiece(ChessPiece chessPiece, String position) {
        this.chessPiece = chessPiece;
        this.position = position;
    }

    /**
     Gets a needed chess piece.
     @return chess piece.
     */
    public ChessPiece getChessPiece() {
        return chessPiece;
    }

    /**
     Gets a new position of the chess piece.
     @return position.
     */
    public String getPosition() {
        return position;
    }


    /**
     Sets a new position for the chess piece.
     @param position a new position.
     */
    public void setPosition(String position) {
        this.position = position;
    }
}
