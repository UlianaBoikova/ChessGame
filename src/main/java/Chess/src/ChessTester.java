package Chess.src;
// Final Project: Uliana Boikova

public class ChessTester {
    public static void main(String[] args) {

        // Tests the whole chess-program, creating the short chess-game.
        ChessField chess = new ChessField();
        // white pawns
        Pawn whitePaw1 = new Pawn(chess, "a2", "White", "whitePawn.png");
        Pawn whitePaw2 = new Pawn(chess, "b2", "White", "whitePawn.png");
        Pawn whitePaw3 = new Pawn(chess, "c2", "White", "whitePawn.png");
        Pawn whitePaw4 = new Pawn(chess, "d2", "White", "whitePawn.png");
        Pawn whitePaw5 = new Pawn(chess, "e2", "White", "whitePawn.png");
        Pawn whitePaw6 = new Pawn(chess, "f2", "White", "whitePawn.png");
        Pawn whitePaw7 = new Pawn(chess, "g2", "White", "whitePawn.png");
        Pawn whitePaw8 = new Pawn(chess, "h2", "White", "whitePawn.png");

        // white rooks
        Rook whiteRook1 = new Rook(chess, "a1", "White", "whiteRook.png");
        Rook whiteRook2 = new Rook(chess, "h1", "White", "whiteRook.png");

        // white knights
        Knight whiteKnight1 = new Knight(chess, "b1", "White", "whiteKnight.png");
        Knight whiteKnight2 = new Knight(chess, "g1", "White", "whiteKnight.png");

        // white bishops
        Bishop whiteBishop1 = new Bishop(chess, "c1", "White", "whiteBishop.png");
        Bishop whiteBishop2 = new Bishop(chess, "f1", "White", "whiteBishop.png");

        // white queen
        Queen whiteQueen = new Queen(chess, "d1", "White", "whiteQueen.png");

        // white king
        King whiteKing = new King(chess, "e1", "White", "whiteKing.png");


        // black pawns
        Pawn blackPaw1 = new Pawn(chess, "a7", "Black", "pawn.png");
        Pawn blackPaw2 = new Pawn(chess, "b7", "Black", "pawn.png");
        Pawn blackPaw3 = new Pawn(chess, "c7", "Black", "pawn.png");
        Pawn blackPaw4 = new Pawn(chess, "d7", "Black", "pawn.png");
        Pawn blackPaw5 = new Pawn(chess, "e7", "Black", "pawn.png");
        Pawn blackPaw6 = new Pawn(chess, "f7", "Black", "pawn.png");
        Pawn blackPaw7 = new Pawn(chess, "g7", "Black", "pawn.png");
        Pawn blackPaw8 = new Pawn(chess, "h7", "Black", "pawn.png");

        // black rooks
        Rook blackRook1 = new Rook(chess, "a8", "Black", "rook.png");
        Rook blackRook2 = new Rook(chess, "h8", "Black", "rook.png");

        // black knights
        Knight blackKnight1 = new Knight(chess, "b8", "Black", "knight.png");
        Knight blackKnight2 = new Knight(chess, "g8", "Black", "knight.png");

        // black bishops
        Bishop blackBishop1 = new Bishop(chess, "c8", "Black", "bishop.png");
        Bishop blackBishop2 = new Bishop(chess, "f8", "Black", "bishop.png");

        // black queen
        Queen blackQueen = new Queen(chess, "d8", "Black", "queen.png");

        // black king
        King blackKing = new King(chess, "e8", "Black", "king.png");

        System.out.println("This program will imitate small chess play");
        System.out.println();

        System.out.println(chess);
        System.out.println();

        if (!whitePaw1.canMoveTo().isEmpty()) System.out.println("White pawn 1 can move to: " + whitePaw1.canMoveTo());
        if (!whitePaw2.canMoveTo().isEmpty()) System.out.println("White pawn 2 can move to: " + whitePaw2.canMoveTo());
        if (!whitePaw3.canMoveTo().isEmpty()) System.out.println("White pawn 3 can move to: " + whitePaw3.canMoveTo());
        if (!whitePaw4.canMoveTo().isEmpty()) System.out.println("White pawn 4 can move to: " + whitePaw4.canMoveTo());
        if (!whitePaw5.canMoveTo().isEmpty()) System.out.println("White pawn 5 can move to: " + whitePaw5.canMoveTo());
        if (!whitePaw6.canMoveTo().isEmpty()) System.out.println("White pawn 6 can move to: " + whitePaw6.canMoveTo());
        if (!whitePaw7.canMoveTo().isEmpty()) System.out.println("White pawn 7 can move to: " + whitePaw7.canMoveTo());
        if (!whitePaw8.canMoveTo().isEmpty()) System.out.println("White pawn 8 can move to: " + whitePaw8.canMoveTo());
        if (!whiteRook1.canMoveTo().isEmpty()) System.out.println("White rook 1 can move to: " + whiteRook1.canMoveTo());
        if (!whiteRook2.canMoveTo().isEmpty()) System.out.println("White rook 2 can move to: " + whiteRook2.canMoveTo());
        if (!whiteKnight1.canMoveTo().isEmpty()) System.out.println("White knight 1 can move to: " + whiteKnight1.canMoveTo());
        if (!whiteKnight2.canMoveTo().isEmpty()) System.out.println("White knight 2 can move to: " + whiteKnight2.canMoveTo());
        if (!whiteBishop1.canMoveTo().isEmpty()) System.out.println("White bishop 1 can move to: " + whiteBishop1.canMoveTo());
        if (!whiteBishop2.canMoveTo().isEmpty()) System.out.println("White bishop 2 can move to: " + whiteBishop2.canMoveTo());
        if (!whiteQueen.canMoveTo().isEmpty()) System.out.println("White queen 1 can move to: " + whiteQueen.canMoveTo());
        if (!whiteKing.canMoveTo().isEmpty()) System.out.println("White king 1 can move to: " + whiteQueen.canMoveTo());

        whitePaw5.setPosition("e4");

        System.out.println();
        System.out.println(chess);
        System.out.println();

        if (!blackPaw1.canMoveTo().isEmpty()) System.out.println("Black pawn 1 can move to: " + blackPaw1.canMoveTo());
        if (!blackPaw2.canMoveTo().isEmpty()) System.out.println("Black pawn 2 can move to: " + blackPaw2.canMoveTo());
        if (!blackPaw3.canMoveTo().isEmpty()) System.out.println("Black pawn 3 can move to: " + blackPaw3.canMoveTo());
        if (!blackPaw4.canMoveTo().isEmpty()) System.out.println("Black pawn 4 can move to: " + blackPaw4.canMoveTo());
        if (!blackPaw5.canMoveTo().isEmpty()) System.out.println("Black pawn 5 can move to: " + blackPaw5.canMoveTo());
        if (!blackPaw6.canMoveTo().isEmpty()) System.out.println("Black pawn 6 can move to: " + blackPaw6.canMoveTo());
        if (!blackPaw7.canMoveTo().isEmpty()) System.out.println("Black pawn 7 can move to: " + blackPaw7.canMoveTo());
        if (!blackPaw8.canMoveTo().isEmpty()) System.out.println("Black pawn 8 can move to: " + blackPaw8.canMoveTo());
        if (!blackRook1.canMoveTo().isEmpty()) System.out.println("Black rook 1 can move to: " + blackRook1.canMoveTo());
        if (!blackRook2.canMoveTo().isEmpty()) System.out.println("Black rook 2 can move to: " + blackRook2.canMoveTo());
        if (!blackKnight1.canMoveTo().isEmpty()) System.out.println("Black knight 1 can move to: " + blackKnight1.canMoveTo());
        if (!blackKnight2.canMoveTo().isEmpty()) System.out.println("Black knight 2 can move to: " + blackKnight2.canMoveTo());
        if (!blackBishop1.canMoveTo().isEmpty()) System.out.println("Black bishop 1 can move to: " + blackBishop1.canMoveTo());
        if (!blackBishop2.canMoveTo().isEmpty()) System.out.println("Black bishop 2 can move to: " + blackBishop2.canMoveTo());
        if (!blackQueen.canMoveTo().isEmpty()) System.out.println("Black queen 1 can move to: " + blackQueen.canMoveTo());
        if (!blackKing.canMoveTo().isEmpty()) System.out.println("Black king 1 can move to: " + blackQueen.canMoveTo());

        blackPaw5.setPosition("e5");

        System.out.println();
        System.out.println(chess);
        System.out.println();

        if (!whitePaw1.canMoveTo().isEmpty()) System.out.println("White pawn 1 can move to: " + whitePaw1.canMoveTo());
        if (!whitePaw2.canMoveTo().isEmpty()) System.out.println("White pawn 2 can move to: " + whitePaw2.canMoveTo());
        if (!whitePaw3.canMoveTo().isEmpty()) System.out.println("White pawn 3 can move to: " + whitePaw3.canMoveTo());
        if (!whitePaw4.canMoveTo().isEmpty()) System.out.println("White pawn 4 can move to: " + whitePaw4.canMoveTo());
        if (!whitePaw5.canMoveTo().isEmpty()) System.out.println("White pawn 5 can move to: " + whitePaw5.canMoveTo());
        if (!whitePaw6.canMoveTo().isEmpty()) System.out.println("White pawn 6 can move to: " + whitePaw6.canMoveTo());
        if (!whitePaw7.canMoveTo().isEmpty()) System.out.println("White pawn 7 can move to: " + whitePaw7.canMoveTo());
        if (!whitePaw8.canMoveTo().isEmpty()) System.out.println("White pawn 8 can move to: " + whitePaw8.canMoveTo());
        if (!whiteRook1.canMoveTo().isEmpty()) System.out.println("White rook 1 can move to: " + whiteRook1.canMoveTo());
        if (!whiteRook2.canMoveTo().isEmpty()) System.out.println("White rook 2 can move to: " + whiteRook2.canMoveTo());
        if (!whiteKnight1.canMoveTo().isEmpty()) System.out.println("White knight 1 can move to: " + whiteKnight1.canMoveTo());
        if (!whiteKnight2.canMoveTo().isEmpty()) System.out.println("White knight 2 can move to: " + whiteKnight2.canMoveTo());
        if (!whiteBishop1.canMoveTo().isEmpty()) System.out.println("White bishop 1 can move to: " + whiteBishop1.canMoveTo());
        if (!whiteBishop2.canMoveTo().isEmpty()) System.out.println("White bishop 2 can move to: " + whiteBishop2.canMoveTo());
        if (!whiteQueen.canMoveTo().isEmpty()) System.out.println("White queen 1 can move to: " + whiteQueen.canMoveTo());
        if (!whiteKing.canMoveTo().isEmpty()) System.out.println("White king 1 can move to: " + whiteQueen.canMoveTo());

        whiteBishop2.setPosition("c4");

        System.out.println();
        System.out.println(chess);
        System.out.println();

        if (!blackPaw1.canMoveTo().isEmpty()) System.out.println("Black pawn 1 can move to: " + blackPaw1.canMoveTo());
        if (!blackPaw2.canMoveTo().isEmpty()) System.out.println("Black pawn 2 can move to: " + blackPaw2.canMoveTo());
        if (!blackPaw3.canMoveTo().isEmpty()) System.out.println("Black pawn 3 can move to: " + blackPaw3.canMoveTo());
        if (!blackPaw4.canMoveTo().isEmpty()) System.out.println("Black pawn 4 can move to: " + blackPaw4.canMoveTo());
        if (!blackPaw5.canMoveTo().isEmpty()) System.out.println("Black pawn 5 can move to: " + blackPaw5.canMoveTo());
        if (!blackPaw6.canMoveTo().isEmpty()) System.out.println("Black pawn 6 can move to: " + blackPaw6.canMoveTo());
        if (!blackPaw7.canMoveTo().isEmpty()) System.out.println("Black pawn 7 can move to: " + blackPaw7.canMoveTo());
        if (!blackPaw8.canMoveTo().isEmpty()) System.out.println("Black pawn 8 can move to: " + blackPaw8.canMoveTo());
        if (!blackRook1.canMoveTo().isEmpty()) System.out.println("Black rook 1 can move to: " + blackRook1.canMoveTo());
        if (!blackRook2.canMoveTo().isEmpty()) System.out.println("Black rook 2 can move to: " + blackRook2.canMoveTo());
        if (!blackKnight1.canMoveTo().isEmpty()) System.out.println("Black knight 1 can move to: " + blackKnight1.canMoveTo());
        if (!blackKnight2.canMoveTo().isEmpty()) System.out.println("Black knight 2 can move to: " + blackKnight2.canMoveTo());
        if (!blackBishop1.canMoveTo().isEmpty()) System.out.println("Black bishop 1 can move to: " + blackBishop1.canMoveTo());
        if (!blackBishop2.canMoveTo().isEmpty()) System.out.println("Black bishop 2 can move to: " + blackBishop2.canMoveTo());
        if (!blackQueen.canMoveTo().isEmpty()) System.out.println("Black queen 1 can move to: " + blackQueen.canMoveTo());
        if (!blackKing.canMoveTo().isEmpty()) System.out.println("Black king 1 can move to: " + blackQueen.canMoveTo());

        blackKnight1.setPosition("c6");

        System.out.println();
        System.out.println(chess);
        System.out.println();

        if (!whitePaw1.canMoveTo().isEmpty()) System.out.println("White pawn 1 can move to: " + whitePaw1.canMoveTo());
        if (!whitePaw2.canMoveTo().isEmpty()) System.out.println("White pawn 2 can move to: " + whitePaw2.canMoveTo());
        if (!whitePaw3.canMoveTo().isEmpty()) System.out.println("White pawn 3 can move to: " + whitePaw3.canMoveTo());
        if (!whitePaw4.canMoveTo().isEmpty()) System.out.println("White pawn 4 can move to: " + whitePaw4.canMoveTo());
        if (!whitePaw5.canMoveTo().isEmpty()) System.out.println("White pawn 5 can move to: " + whitePaw5.canMoveTo());
        if (!whitePaw6.canMoveTo().isEmpty()) System.out.println("White pawn 6 can move to: " + whitePaw6.canMoveTo());
        if (!whitePaw7.canMoveTo().isEmpty()) System.out.println("White pawn 7 can move to: " + whitePaw7.canMoveTo());
        if (!whitePaw8.canMoveTo().isEmpty()) System.out.println("White pawn 8 can move to: " + whitePaw8.canMoveTo());
        if (!whiteRook1.canMoveTo().isEmpty()) System.out.println("White rook 1 can move to: " + whiteRook1.canMoveTo());
        if (!whiteRook2.canMoveTo().isEmpty()) System.out.println("White rook 2 can move to: " + whiteRook2.canMoveTo());
        if (!whiteKnight1.canMoveTo().isEmpty()) System.out.println("White knight 1 can move to: " + whiteKnight1.canMoveTo());
        if (!whiteKnight2.canMoveTo().isEmpty()) System.out.println("White knight 2 can move to: " + whiteKnight2.canMoveTo());
        if (!whiteBishop1.canMoveTo().isEmpty()) System.out.println("White bishop 1 can move to: " + whiteBishop1.canMoveTo());
        if (!whiteBishop2.canMoveTo().isEmpty()) System.out.println("White bishop 2 can move to: " + whiteBishop2.canMoveTo());
        if (!whiteQueen.canMoveTo().isEmpty()) System.out.println("White queen 1 can move to: " + whiteQueen.canMoveTo());
        if (!whiteKing.canMoveTo().isEmpty()) System.out.println("White king 1 can move to: " + whiteQueen.canMoveTo());

        whiteQueen.setPosition("h5");

        System.out.println();
        System.out.println(chess);
        System.out.println();

        if (!blackPaw1.canMoveTo().isEmpty()) System.out.println("Black pawn 1 can move to: " + blackPaw1.canMoveTo());
        if (!blackPaw2.canMoveTo().isEmpty()) System.out.println("Black pawn 2 can move to: " + blackPaw2.canMoveTo());
        if (!blackPaw3.canMoveTo().isEmpty()) System.out.println("Black pawn 3 can move to: " + blackPaw3.canMoveTo());
        if (!blackPaw4.canMoveTo().isEmpty()) System.out.println("Black pawn 4 can move to: " + blackPaw4.canMoveTo());
        if (!blackPaw5.canMoveTo().isEmpty()) System.out.println("Black pawn 5 can move to: " + blackPaw5.canMoveTo());
        if (!blackPaw6.canMoveTo().isEmpty()) System.out.println("Black pawn 6 can move to: " + blackPaw6.canMoveTo());
        if (!blackPaw7.canMoveTo().isEmpty()) System.out.println("Black pawn 7 can move to: " + blackPaw7.canMoveTo());
        if (!blackPaw8.canMoveTo().isEmpty()) System.out.println("Black pawn 8 can move to: " + blackPaw8.canMoveTo());
        if (!blackRook1.canMoveTo().isEmpty()) System.out.println("Black rook 1 can move to: " + blackRook1.canMoveTo());
        if (!blackRook2.canMoveTo().isEmpty()) System.out.println("Black rook 2 can move to: " + blackRook2.canMoveTo());
        if (!blackKnight1.canMoveTo().isEmpty()) System.out.println("Black knight 1 can move to: " + blackKnight1.canMoveTo());
        if (!blackKnight2.canMoveTo().isEmpty()) System.out.println("Black knight 2 can move to: " + blackKnight2.canMoveTo());
        if (!blackBishop1.canMoveTo().isEmpty()) System.out.println("Black bishop 1 can move to: " + blackBishop1.canMoveTo());
        if (!blackBishop2.canMoveTo().isEmpty()) System.out.println("Black bishop 2 can move to: " + blackBishop2.canMoveTo());
        if (!blackQueen.canMoveTo().isEmpty()) System.out.println("Black queen 1 can move to: " + blackQueen.canMoveTo());
        if (!blackKing.canMoveTo().isEmpty()) System.out.println("Black king 1 can move to: " + blackQueen.canMoveTo());

        blackKnight2.setPosition("f6");

        System.out.println();
        System.out.println(chess);
        System.out.println();

        if (!whitePaw1.canMoveTo().isEmpty()) System.out.println("White pawn 1 can move to: " + whitePaw1.canMoveTo());
        if (!whitePaw2.canMoveTo().isEmpty()) System.out.println("White pawn 2 can move to: " + whitePaw2.canMoveTo());
        if (!whitePaw3.canMoveTo().isEmpty()) System.out.println("White pawn 3 can move to: " + whitePaw3.canMoveTo());
        if (!whitePaw4.canMoveTo().isEmpty()) System.out.println("White pawn 4 can move to: " + whitePaw4.canMoveTo());
        if (!whitePaw5.canMoveTo().isEmpty()) System.out.println("White pawn 5 can move to: " + whitePaw5.canMoveTo());
        if (!whitePaw6.canMoveTo().isEmpty()) System.out.println("White pawn 6 can move to: " + whitePaw6.canMoveTo());
        if (!whitePaw7.canMoveTo().isEmpty()) System.out.println("White pawn 7 can move to: " + whitePaw7.canMoveTo());
        if (!whitePaw8.canMoveTo().isEmpty()) System.out.println("White pawn 8 can move to: " + whitePaw8.canMoveTo());
        if (!whiteRook1.canMoveTo().isEmpty()) System.out.println("White rook 1 can move to: " + whiteRook1.canMoveTo());
        if (!whiteRook2.canMoveTo().isEmpty()) System.out.println("White rook 2 can move to: " + whiteRook2.canMoveTo());
        if (!whiteKnight1.canMoveTo().isEmpty()) System.out.println("White knight 1 can move to: " + whiteKnight1.canMoveTo());
        if (!whiteKnight2.canMoveTo().isEmpty()) System.out.println("White knight 2 can move to: " + whiteKnight2.canMoveTo());
        if (!whiteBishop1.canMoveTo().isEmpty()) System.out.println("White bishop 1 can move to: " + whiteBishop1.canMoveTo());
        if (!whiteBishop2.canMoveTo().isEmpty()) System.out.println("White bishop 2 can move to: " + whiteBishop2.canMoveTo());
        if (!whiteQueen.canMoveTo().isEmpty()) System.out.println("White queen 1 can move to: " + whiteQueen.canMoveTo());
        if (!whiteKing.canMoveTo().isEmpty()) System.out.println("White king 1 can move to: " + whiteQueen.canMoveTo());

        whiteQueen.setPosition("f7");

        System.out.println();
        System.out.println(chess);
    }
}

/*
Sample run:
This program will imitate small chess play

Black Black Black Black Black Black Black Black
Black Black Black Black Black Black Black Black
None  None  None  None  None  None  None  None
None  None  None  None  None  None  None  None
None  None  None  None  None  None  None  None
None  None  None  None  None  None  None  None
White White White White White White White White
White White White White White White White White


White pawn 1 can move to: [a3, a4]
White pawn 2 can move to: [b3, b4]
White pawn 3 can move to: [c3, c4]
White pawn 4 can move to: [d3, d4]
White pawn 5 can move to: [e3, e4]
White pawn 6 can move to: [f3, f4]
White pawn 7 can move to: [g3, g4]
White pawn 8 can move to: [h3, h4]
White knight 1 can move to: [c3, a3]
White knight 2 can move to: [h3, f3]

Black Black Black Black Black Black Black Black
Black Black Black Black Black Black Black Black
None  None  None  None  None  None  None  None
None  None  None  None  None  None  None  None
None  None  None  None  White None  None  None
None  None  None  None  None  None  None  None
White White White White None  White White White
White White White White White White White White


Black pawn 1 can move to: [a6, a5]
Black pawn 2 can move to: [b6, b5]
Black pawn 3 can move to: [c6, c5]
Black pawn 4 can move to: [d6, d5]
Black pawn 5 can move to: [e6, e5]
Black pawn 6 can move to: [f6, f5]
Black pawn 7 can move to: [g6, g5]
Black pawn 8 can move to: [h6, h5]

Black Black Black Black Black Black Black Black
Black Black Black Black None  Black Black Black
None  None  None  None  None  None  None  None
None  None  None  None  Black None  None  None
None  None  None  None  White None  None  None
None  None  None  None  None  None  None  None
White White White White None  White White White
White White White White White White White White


White pawn 1 can move to: [a3, a4]
White pawn 2 can move to: [b3, b4]
White pawn 3 can move to: [c3, c4]
White pawn 4 can move to: [d3, d4]
White pawn 6 can move to: [f3, f4]
White pawn 7 can move to: [g3, g4]
White pawn 8 can move to: [h3, h4]
White knight 1 can move to: [c3, a3]
White knight 2 can move to: [h3, e2, f3]
White bishop 2 can move to: [e2, d3, c4, b5, a6]
White queen 1 can move to: [e2, f3, g4, h5]
White king 1 can move to: [e2, f3, g4, h5]

Black Black Black Black Black Black Black Black
Black Black Black Black None  Black Black Black
None  None  None  None  None  None  None  None
None  None  None  None  Black None  None  None
None  None  White None  White None  None  None
None  None  None  None  None  None  None  None
White White White White None  White White White
White White White White White None  White White


Black pawn 1 can move to: [a6, a5]
Black pawn 2 can move to: [b6, b5]
Black pawn 3 can move to: [c6, c5]
Black pawn 4 can move to: [d6, d5]
Black pawn 6 can move to: [f6, f5]
Black pawn 7 can move to: [g6, g5]
Black pawn 8 can move to: [h6, h5]
Black bishop 2 can move to: [e7, d6, c5, b4, a3]
Black queen 1 can move to: [e7, f6, g5, h4]

Black None  Black Black Black Black Black Black
Black Black Black Black None  Black Black Black
None  None  Black None  None  None  None  None
None  None  None  None  Black None  None  None
None  None  White None  White None  None  None
None  None  None  None  None  None  None  None
White White White White None  White White White
White White White White White None  White White


White pawn 1 can move to: [a3, a4]
White pawn 2 can move to: [b3, b4]
White pawn 3 can move to: [c3]
White pawn 4 can move to: [d3, d4]
White pawn 6 can move to: [f3, f4]
White pawn 7 can move to: [g3, g4]
White pawn 8 can move to: [h3, h4]
White knight 1 can move to: [c3, a3]
White knight 2 can move to: [h3, e2, f3]
White bishop 2 can move to: [d5, e6, f7, b3, d3, e2, f1, b5, a6]
White queen 1 can move to: [e2, f3, g4, h5]
White king 1 can move to: [e2, f3, g4, h5]

Black None  Black Black Black Black Black Black
Black Black Black Black None  Black Black Black
None  None  Black None  None  None  None  None
None  None  None  None  Black None  None  White
None  None  White None  White None  None  None
None  None  None  None  None  None  None  None
White White White White None  White White White
White White White None  White None  White White


Black pawn 1 can move to: [a6, a5]
Black pawn 2 can move to: [b6, b5]
Black pawn 3 can move to: [c5]
Black pawn 4 can move to: [d6, d5]
Black pawn 6 can move to: [f6, f5]
Black pawn 7 can move to: [g6, g5]
Black pawn 8 can move to: [h6]
Black rook 1 can move to: [b8]
Black bishop 2 can move to: [e7, d6, c5, b4, a3]
Black queen 1 can move to: [e7, f6, g5, h4]

Black None  Black Black Black Black None  Black
Black Black Black Black None  Black Black Black
None  None  Black None  None  Black None  None
None  None  None  None  Black None  None  White
None  None  White None  White None  None  None
None  None  None  None  None  None  None  None
White White White White None  White White White
White White White None  White None  White White


White pawn 1 can move to: [a3, a4]
White pawn 2 can move to: [b3, b4]
White pawn 3 can move to: [c3]
White pawn 4 can move to: [d3, d4]
White pawn 6 can move to: [f3, f4]
White pawn 7 can move to: [g3, g4]
White pawn 8 can move to: [h3, h4]
White knight 1 can move to: [c3, a3]
White knight 2 can move to: [h3, e2, f3]
White bishop 2 can move to: [d5, e6, f7, b3, d3, e2, f1, b5, a6]
White queen 1 can move to: [h6, h7, h4, h3, g5, f5, e5, g4, f3, e2, d1, g6, f7]
White king 1 can move to: [h6, h7, h4, h3, g5, f5, e5, g4, f3, e2, d1, g6, f7]

Black None  Black Black Black Black None  Black
Black Black Black Black None  White Black Black
None  None  Black None  None  Black None  None
None  None  None  None  Black None  None  None
None  None  White None  White None  None  None
None  None  None  None  None  None  None  None
White White White White None  White White White
White White White None  White None  White White
 */