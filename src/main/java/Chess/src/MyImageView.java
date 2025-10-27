package Chess.src;

// Final Project: Uliana Boikova

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 The MyImage class should extend class ImageView, adding an instance variable, chessPiece.
 */
public class MyImageView extends ImageView {
    private final ChessPiece chessPiece;

    /**
     Constructs an ImageView object withe given image and chess piece.
     * @param image a given image.
     * @param chessPiece a chess piece on the image.
     */
    public MyImageView(Image image, ChessPiece chessPiece) {
        super(image);
        this.chessPiece = chessPiece;
    }

    /**
     Gets chess piece from the image.
     @return chess piece.
     */
    public ChessPiece getChessPiece() {
        return chessPiece;
    }
}
