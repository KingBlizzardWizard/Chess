import Pieces.*;


public class Main {
    public static void main(String[] args) {
     
     Piece p = new Piece(0, 0, false, false);
     System.out.println(p.getX());
     System.out.println(p.getY());
     System.out.println(p.getColor());
     System.out.println(p.getDeadOrAlive());
    p.movements();

     Pawn pw = new Pawn(0, 0, false, false);
    pw.movements();
    // System.out.print("gaesaf");

    Board b = new Board();
    b.getX(7);
    b.getY(6);
    // System.out.print(pw);
    b.getPieceCoords(pw);
    b.setPieceAtCord(5, 5);

    Knight k = new Knight(0, 0, false, false);
    k.movements();
    }
}
