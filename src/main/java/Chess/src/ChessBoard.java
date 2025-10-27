package Chess.src;
// Final Project: Uliana Boikova
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 The class ChessBoard create a view of a chess board.
 */
public class ChessBoard extends Pane {

    private static int moveX;

    private static int moveY;

    /**
     Constructs a new ChessBoard object.
     */
    public ChessBoard() {
        Color color;
        Rectangle cell = new Rectangle(0, 0, 50, 50);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == 0 && i == 0) {
                    moveX = 0;
                    moveY = 0;
                    addCell(0);
                }
                else if (j == 0) {
                    moveX -= 350;
                    moveY += 50;
                    addCell(i + j);
                }
                else {
                    moveX += 50;
                    addCell(i + j);
                }
            }
        }
    }


    /**
     Adds one cell to the chess board with given color.
     @param colorInt color of the chess cell.
     */
    public void addCell(int colorInt) {
        Color color;
        if (colorInt % 2 == 0) color = Color.WHITE;
        else color = Color.BROWN;
        Rectangle cell = new Rectangle(moveX, moveY, 50, 50);
        cell.setFill(color);
        Game.GROUP.getChildren().add(cell);
    }
}
