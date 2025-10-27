package Chess.src;

// Final Project: Uliana Boikova

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 The Game class should display chess game on the screen.
 */
public class Game extends Application {

    public static final Pane GROUP = new Pane();


    /**
     Runs the program to launch the game.
     @param args arguments.
     */
    public static void main(String[] args) {
        launch(args);
    }

    // creates the chess field that will see all chess in the chess board
    private final ChessField chess = new ChessField();

    // creates all chess pieces: black and white
    //  pawns
    private final Pawn whitePaw1 = new Pawn(chess, "a2", "White", "whitePawn.png");
    private final Pawn whitePaw2 = new Pawn(chess, "b2", "White", "whitePawn.png");
    private final Pawn whitePaw3 = new Pawn(chess, "c2", "White", "whitePawn.png");
    private final Pawn whitePaw4 = new Pawn(chess, "d2", "White", "whitePawn.png");
    private final Pawn whitePaw5 = new Pawn(chess, "e2", "White", "whitePawn.png");
    private final Pawn whitePaw6 = new Pawn(chess, "f2", "White", "whitePawn.png");
    private final Pawn whitePaw7 = new Pawn(chess, "g2", "White", "whitePawn.png");
    private final Pawn whitePaw8 = new Pawn(chess, "h2", "White", "whitePawn.png");

    // white rooks
    private final Rook whiteRook1 = new Rook(chess, "a1", "White", "whiteRook.png");
    private final Rook whiteRook2 = new Rook(chess, "h1", "White", "whiteRook.png");

    // white knights
    private final Knight whiteKnight1 = new Knight(chess, "b1", "White", "whiteKnight.png");
    private final Knight whiteKnight2 = new Knight(chess, "g1", "White", "whiteKnight.png");

    // white bishops
    private final Bishop whiteBishop1 = new Bishop(chess, "c1", "White", "whiteBishop.png");
    private final Bishop whiteBishop2 = new Bishop(chess, "f1", "White", "whiteBishop.png");

    // white queen
    private final Queen whiteQueen = new Queen(chess, "d1", "White", "whiteQueen.png");

    // white king
    private final King whiteKing = new King(chess, "e1", "White", "whiteKing.png");


    // black pawns
    private final Pawn blackPaw1 = new Pawn(chess, "a7", "Black", "pawn.png");
    private final Pawn blackPaw2 = new Pawn(chess, "b7", "Black", "pawn.png");
    private final Pawn blackPaw3 = new Pawn(chess, "c7", "Black", "pawn.png");
    private final Pawn blackPaw4 = new Pawn(chess, "d7", "Black", "pawn.png");
    private final Pawn blackPaw5 = new Pawn(chess, "e7", "Black", "pawn.png");
    private final Pawn blackPaw6 = new Pawn(chess, "f7", "Black", "pawn.png");
    private final Pawn blackPaw7 = new Pawn(chess, "g7", "Black", "pawn.png");
    private final Pawn blackPaw8 = new Pawn(chess, "h7", "Black", "pawn.png");

    // black rooks
    private final Rook blackRook1 = new Rook(chess, "a8", "Black", "rook.png");
    private final Rook blackRook2 = new Rook(chess, "h8", "Black", "rook.png");

    // black knights
    private final Knight blackKnight1 = new Knight(chess, "b8", "Black", "knight.png");
    private final Knight blackKnight2 = new Knight(chess, "g8", "Black", "knight.png");

    // black bishops
    private final Bishop blackBishop1 = new Bishop(chess, "c8", "Black", "bishop.png");
    private final Bishop blackBishop2 = new Bishop(chess, "f8", "Black", "bishop.png");

    // black queen
    private final Queen blackQueen = new Queen(chess, "d8", "Black", "queen.png");

    // black king
    private final King blackKing = new King(chess, "e8", "Black", "king.png");

    // creates a variable that will show which color of the chess now should do the step
    private static String color = "White";
    // creates a variables for checking if the chess piece (chessKiller) can eat another color chess piece
    private final ChessField chess1 = new ChessField();
    private ChessPiece chessKiller = new Pawn(chess1, "a1", "White", "pawn.png");
    // the image of the chess piece (chessKiller) that can eat another color chess piece
    private ImageView imageViewKiller;

    /**
     Starts displaying a new chess game on the screen.
     @param stage the stage where program is displaying.
     @throws Exception if image of the chess piece is not found.
     */
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(GROUP, 400,400);
        // adding on the screen the chess board image
        GROUP.getChildren().add(new ChessBoard());


        // adding all pictures of the chess on the screen
        addImage("/pawn.png", 0, 50, 50,50, blackPaw1);
        addImage("/pawn.png", 50, 50, 50,50, blackPaw2);
        addImage("/pawn.png", 100, 50, 50,50, blackPaw3);
        addImage("/pawn.png", 150, 50, 50,50, blackPaw4);
        addImage("/pawn.png", 200, 50, 50,50, blackPaw5);
        addImage("/pawn.png", 250, 50, 50,50, blackPaw6);
        addImage("/pawn.png", 300, 50, 50,50, blackPaw7);
        addImage("/pawn.png", 350, 50, 50,50, blackPaw8);
        addImage("/rook.png", 0, 0, 50,50, blackRook1);
        addImage("/rook.png", 350, 0, 50,50, blackRook2);
        addImage("/knight.png", 50, 0, 50,50, blackKnight1);
        addImage("/knight.png", 300, 0, 50,50, blackKnight2);
        addImage("/bishop.png", 100, 0, 50,50, blackBishop1);
        addImage("/bishop.png", 250, 0, 50,50, blackBishop2);
        addImage("/queen.png", 150, 0, 50,50, blackQueen);
        addImage("/king.png", 200, 0, 50,50, blackKing);



        addImage("/whitePawn.png", 0, 300, 50,50, whitePaw1);
        addImage("/whitePawn.png", 50, 300, 50,50, whitePaw2);
        addImage("/whitePawn.png", 100, 300, 50,50, whitePaw3);
        addImage("/whitePawn.png", 150, 300, 50,50, whitePaw4);
        addImage("/whitePawn.png", 200, 300, 50,50, whitePaw5);
        addImage("/whitePawn.png", 250, 300, 50,50, whitePaw6);
        addImage("/whitePawn.png", 300, 300, 50,50, whitePaw7);
        addImage("/whitePawn.png", 350, 300, 50,50, whitePaw8);
        addImage("/whiteRook.png", 0, 350, 50,50, whiteRook1);
        addImage("/whiteRook.png", 350, 350, 50,50, whiteRook2);
        addImage("/whiteKnight.png", 50, 350, 50,50, whiteKnight1);
        addImage("/whiteKnight.png", 300, 350, 50,50, whiteKnight2);
        addImage("/whiteBishop.png", 100, 350, 50,50, whiteBishop1);
        addImage("/whiteBishop.png", 250, 350, 50,50, whiteBishop2);
        addImage("/whiteQueen.png", 150, 350, 50,50, whiteQueen);
        addImage("/whiteKing.png", 200, 350, 50,50, whiteKing);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    /**
     Adds image on the screen to given position.
     * @param name a name of the image.
     * @param x x-position where image should be added.
     * @param y y-position where image should be added.
     * @param height height of the image.
     * @param width width of the image.
     * @param chessPiece chess piece from the image.
     */
    public void addImage(String name, int x, int y, int height, int width, ChessPiece chessPiece) {
        try {
            // adds image of the given chess on the screen
            Image image = new Image(new FileInputStream(new File("").getAbsolutePath() + name));
            MyImageView imageView = new MyImageView(image, chessPiece);
            imageView.setFitHeight(height);
            imageView.setFitWidth(width);
            imageView.setX(x);
            imageView.setY(y);
            GROUP.getChildren().add(imageView);
            AtomicInteger count = new AtomicInteger();
            count.set(0);
            // process the click, when clicking on a chess piece
            imageView.setOnMousePressed(e -> {
                // case when chess piece will beat another chess piece
                if (chessKiller.canMoveTo().contains(ChessPiece.positionToString((int) ((e.getSceneX() - (e.getSceneX()) % 50) / 50),
                        7 - (int) ((e.getSceneY() - (e.getSceneY()) % 50) / 50))) && (!color.equals(chessPiece.getColor()))) {

                    if (chessKiller.canMoveTo().contains(ChessPiece.positionToString((int) ((e.getSceneX() - (e.getSceneX()) % 50) / 50),
                            7 - (int) ((e.getSceneY() - (e.getSceneY()) % 50) / 50)))) {
                        // removes picture of the beaten chess piece from the screen
                        GROUP.getChildren().remove(imageView);
                        // sets that the beaten chess piece is dead
                        chessPiece.setDead(true);
                        // moves the picture of the chess piece killer to new position
                        chessKiller.setPosition(ChessPiece.positionToString((int) ((e.getSceneX() - (e.getSceneX()) % 50) / 50),
                                7 - (int) ((e.getSceneY() - (e.getSceneY()) % 50) / 50)));
                        GROUP.getChildren().remove(imageViewKiller);
                        System.out.println((x + e.getSceneX() - (x + e.getSceneX()) % 50) + " " + (0 + e.getSceneY() - (0 + e.getSceneY()) % 50));
                        imageViewKiller.setTranslateX(-imageViewKiller.getX() + e.getSceneX() - (imageViewKiller.getX() + e.getSceneX()) % 50);
                        System.out.println("Move X" + (-x + e.getSceneX() - (x + e.getSceneX()) % 50));
                        imageViewKiller.setTranslateY(-imageViewKiller.getY() + e.getSceneY() - (imageViewKiller.getY() + e.getSceneY()) % 50);
                        System.out.println("Move Y" + (-y + e.getSceneX() - (y + e.getSceneX()) % 50));
                        GROUP.getChildren().add(imageViewKiller);
                        color = "White";

                        // checks if the black king is dead, if so, shows the picture of white chess winning
                        if (blackKing.isDead()) {
                            Image image1 = null;
                            try {
                                image1 = new Image(new FileInputStream(new File("").getAbsolutePath() + "/whiteWin.jpg"));
                            } catch (FileNotFoundException ex) {
                                throw new RuntimeException(ex);
                            }
                            ImageView lose = new ImageView(image1);
                            lose.setFitHeight(400);
                            lose.setFitWidth(400);
                            lose.setX(0);
                            lose.setY(0);
                            GROUP.getChildren().add(lose);
                        }

                        // starts moving of the black chess
                        // finds a desirable chess for black and desirable position fo it with AL using
                        FindChessPiece find = choseBlackChessPosition();
                        ChessPiece blackChessPiece = find.getChessPiece();
                        String newPositionBlack = find.getPosition();

                        // goes through all nodes on the screen, finds desirable chess and moves picture of it
                        List<Node> nodes = NodeUtils.paneNodes(GROUP);
                        int countElements = 0;
                        for (Node element: nodes) {
                            if (element instanceof MyImageView && ((MyImageView) element).getChessPiece() == blackChessPiece) {
                                try {
                                    moveBlack((MyImageView) nodes.get(countElements), newPositionBlack);
                                } catch (FileNotFoundException ex) {
                                    throw new RuntimeException(ex);
                                }
                                break;
                            }
                            countElements++;
                        }
                    }
                }
                else {
                    count.set(0);
                    chessKiller = chessPiece;
                    imageViewKiller = imageView;
                    // process the click, when clicking on a chess piece
                    GROUP.setOnMousePressed(e1 -> {
                        // if on the spot where we pressed on the screen wasn't any chess piece we just move the chess
                        // piece to it if it is able to go to it.
                        if (e1.getButton().equals(MouseButton.PRIMARY)
                                && chessPiece.canMoveTo().contains(ChessPiece.positionToString((int) ((e1.getSceneX() - (e1.getSceneX()) % 50) / 50),
                                7 - (int) ((e1.getSceneY() - (e1.getSceneY()) % 50) / 50))) &&
                                count.get() < 1 && color.equals(chessPiece.getColor())) {
                            count.getAndIncrement();
                            // moves the picture of the chess piece to new position
                            GROUP.getChildren().remove(imageView);
                            System.out.println((x + e1.getSceneX() - (x + e1.getSceneX()) % 50) + " " + (0 + e1.getSceneY() - (0 + e1.getSceneY()) % 50));
                            imageView.setTranslateX(-x + e1.getSceneX() - (x + e1.getSceneX()) % 50);
                            imageView.setTranslateY(-y + e1.getSceneY() - (y + e1.getSceneY()) % 50);
                            chessPiece.setPosition(ChessPiece.positionToString((int) ((e1.getSceneX() - (e1.getSceneX()) % 50) / 50),
                                    7 - (int) ((e1.getSceneY() - (e1.getSceneY()) % 50) / 50)));
                            GROUP.getChildren().add(imageView);
                            color = "White";

                            // starts moving of the black chess
                            // finds a desirable chess for black and desirable position fo it with AL using

                            FindChessPiece find = choseBlackChessPosition();
                            ChessPiece blackChessPiece = find.getChessPiece();
                            String newPositionBlack = find.getPosition();

                            // goes through all nodes on the screen, finds desirable chess and moves picture of it
                            List<Node> nodes = NodeUtils.paneNodes(GROUP);
                            int countElements = 0;
                            for (Node element: nodes) {
                                if (element instanceof MyImageView && ((MyImageView) element).getChessPiece() == blackChessPiece) {
                                    try {
                                        moveBlack((MyImageView) nodes.get(countElements), newPositionBlack);
                                    } catch (FileNotFoundException ex) {
                                        throw new RuntimeException(ex);
                                    }
                                    break;
                                }
                                countElements++;
                            }
                            System.out.println(nodes.size());

                        }
                    });
                }
            });

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    /**
     Moves a given black chess piece picture to given position.
     @param imageView an imageView of the chess piece.
     @param position new position
     @throws FileNotFoundException if file is not found.
     */
    public void moveBlack(MyImageView imageView, String position) throws FileNotFoundException {
            // moves picture of the black chess to the new position
            GROUP.getChildren().remove(imageView);
            imageView.setX((position.charAt(0) - 97) * 50);
            imageView.setY((7 - (position.charAt(1) - 49)) * 50);
            List<Node> nodes = NodeUtils.paneNodes(GROUP);
            int countElements = 0;
            for (Node element: nodes) {
                if (element instanceof MyImageView && ((MyImageView) element).getChessPiece().getChessPosition().equals(position)) {
                    GROUP.getChildren().remove(element);
                    ((MyImageView) element).getChessPiece().setDead(true);
                    break;
                }
                countElements++;
            }

            imageView.getChessPiece().setPosition(position);

            System.out.println(chess);
            GROUP.getChildren().add(imageView);

            // checks if white king is dead and if so finish game and show the picture of the black winning
        if (whiteKing.isDead()) {
            Image image = new Image(new FileInputStream(new File("").getAbsolutePath() + "/blackWin.png"));
            ImageView lose = new ImageView(image);
            lose.setFitHeight(400);
            lose.setFitWidth(400);
            lose.setX(0);
            lose.setY(0);
            GROUP.getChildren().add(lose);
        }
    }


    /**
     Chooses the best movement for black chess.
     @return chess piece that we need to move and its new position.
     */
    public FindChessPiece choseBlackChessPosition()
    {
        // The AI that choose desirable chess and position to move to black chess
        ChessPiece piece = null;
        String position = null;

        // makes a list of chess that can be in danger
        ArrayList<ChessPiece> inDanger = new ArrayList<>();
        inDanger.add(blackPaw1);
        inDanger.add(blackPaw2);
        inDanger.add(blackPaw3);
        inDanger.add(blackPaw4);
        inDanger.add(blackPaw5);
        inDanger.add(blackPaw6);
        inDanger.add(blackPaw7);
        inDanger.add(blackPaw8);
        inDanger.add(blackKnight1);
        inDanger.add(blackKnight2);
        inDanger.add(blackBishop1);
        inDanger.add(blackBishop2);
        inDanger.add(blackRook1);
        inDanger.add(blackRook2);
        inDanger.add(blackQueen);
        inDanger.add(blackKing);


        // makes a list of chess that can beat white chess
        ArrayList<ChessPiece> canBeat = new ArrayList<>();
        canBeat.add(blackKing);
        canBeat.add(blackPaw1);
        canBeat.add(blackPaw2);
        canBeat.add(blackPaw3);
        canBeat.add(blackPaw4);
        canBeat.add(blackPaw5);
        canBeat.add(blackPaw6);
        canBeat.add(blackPaw7);
        canBeat.add(blackPaw8);
        canBeat.add(blackKnight1);
        canBeat.add(blackKnight2);
        canBeat.add(blackBishop1);
        canBeat.add(blackBishop2);
        canBeat.add(blackRook1);
        canBeat.add(blackRook2);
        canBeat.add(blackQueen);


        // makes a list of chess that can do step
        ArrayList<ChessPiece> canDoStep = new ArrayList<>();
        canDoStep.add(blackKing);
        canDoStep.add(blackBishop1);
        canDoStep.add(blackBishop2);
        canDoStep.add(blackQueen);
        canDoStep.add(blackPaw4);
        canDoStep.add(blackKnight1);
        canDoStep.add(blackPaw2);
        canDoStep.add(blackRook1);
        canDoStep.add(blackPaw1);
        canDoStep.add(blackPaw3);
        canDoStep.add(blackKnight2);
        canDoStep.add(blackRook2);
        canDoStep.add(blackPaw7);
        canDoStep.add(blackPaw5);
        canDoStep.add(blackPaw6);
        canDoStep.add(blackPaw8);


        // goes through the list and checks which chess now in danger
        for (ChessPiece chessPiece: inDanger) {
            ArrayList<String> blackCanMoveTo = chessPiece.canMoveTo();
            if (!chessPiece.isDead() && whiteCanMoveTo().contains(chessPiece.getChessPosition())) {
                for (int i = 0; i < blackCanMoveTo.size(); i++) {
                    String colorCanMoveTo = chess.getPositionValue(blackCanMoveTo.get(i));
                    chess.setPositionalValue(blackCanMoveTo.get(i), "Black");
                    chess.setPositionalValue(chessPiece.getChessPosition(), "None ");
                    if (!whiteCanMoveTo().contains(blackCanMoveTo.get(i))) {
                        piece = chessPiece;
                        position = blackCanMoveTo.get(i);
                    }
                    chess.setPositionalValue(chessPiece.getChessPosition(), "Black");
                    chess.setPositionalValue(blackCanMoveTo.get(i), colorCanMoveTo);
                }
            }
        }



        // goes through the list and checks which chess now can beat white chess
        if (piece == null || position == null) {
            for (ChessPiece chessPiece: canBeat) {
                if (!chessPiece.isDead()) {
                    for (int i = 0; i < chessPiece.canMoveTo().size(); i++) {
                        if (chess.getPositionValue(chessPiece.canMoveTo().get(i)).equals("White")) {
                            if (!whiteCanMoveTo().contains(chessPiece.canMoveTo().get(i))) {
                                piece = chessPiece;
                                position = chessPiece.canMoveTo().get(i);
                            }
                        }
                    }
                }
            }

        }
        if (piece == null || position == null) {
            // goes through the list and checks which chess do step
            for (ChessPiece chessPiece: canDoStep) {
                ArrayList<String> blackCanMoveTo = chessPiece.canMoveTo();
                if (!chessPiece.isDead()) {
                    for (int i = 0; i < blackCanMoveTo.size(); i++) {
                        String colorCanMoveTo = chess.getPositionValue(blackCanMoveTo.get(i));
                        chess.setPositionalValue(blackCanMoveTo.get(i), "Black");
                        chess.setPositionalValue(chessPiece.getChessPosition(), "None ");
                        System.out.println(chess);
                        if (!whiteCanMoveTo().contains(blackCanMoveTo.get(i))) {
                            piece = chessPiece;
                            position = blackCanMoveTo.get(i);
                        }
                        chess.setPositionalValue(chessPiece.getChessPosition(), "Black");
                        chess.setPositionalValue(blackCanMoveTo.get(i), colorCanMoveTo);
                    }
                }
            }
        }
        FindChessPiece findChessPiece = new FindChessPiece(piece, position);
        return findChessPiece;
    }

    public ArrayList<String> whiteCanMoveTo() {
        // just updates the list of all position where white chess can do step
        ArrayList<String> whiteCanMoveTo = new ArrayList<>();
        whiteCanMoveTo.addAll(whitePaw1.canMoveTo());
        whiteCanMoveTo.addAll(whitePaw2.canMoveTo());
        whiteCanMoveTo.addAll(whitePaw3.canMoveTo());
        whiteCanMoveTo.addAll(whitePaw4.canMoveTo());
        whiteCanMoveTo.addAll(whitePaw5.canMoveTo());
        whiteCanMoveTo.addAll(whitePaw6.canMoveTo());
        whiteCanMoveTo.addAll(whitePaw7.canMoveTo());
        whiteCanMoveTo.addAll(whitePaw8.canMoveTo());
        whiteCanMoveTo.addAll(whiteRook1.canMoveTo());
        whiteCanMoveTo.addAll(whiteRook2.canMoveTo());
        whiteCanMoveTo.addAll(whiteBishop1.canMoveTo());
        whiteCanMoveTo.addAll(whiteBishop2.canMoveTo());
        whiteCanMoveTo.addAll(whiteKnight1.canMoveTo());
        whiteCanMoveTo.addAll(whiteKnight2.canMoveTo());
        whiteCanMoveTo.addAll(whiteQueen.canMoveTo());
        whiteCanMoveTo.addAll(whiteKing.canMoveTo());
        return whiteCanMoveTo;
    }

}


