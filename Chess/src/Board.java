import Pieces.*;

public class Board {
    int x;
    int y;
    Square[][] grid = new Square[x][y];


    //Figure out if this is even needed
    public Board(/*int[][] grid*/){
        // this.grid = grid;
    }

    public int getX(int x){
        for(int i = 0; i!=x; i++){
            System.out.println(i);
        }
        System.out.println("x is " + x);
        return x;
    }

    public int getY(int y){
        for(int i = x; i<x; i++){
            for(int j = 0; j!= y; j++){
                System.out.println(j);
            }     
        }
        System.out.println("x is " + x + "\ny is " + y);
        return y;
    }

    //Perhaps change so this gets the piece at a coordnate rather then it printing the pieces coordinate
    public Piece getPieceCoords(int x, int y){
        // System.out.println(p.getX() + " " + p.getY());

        return Piece.getX;
    }

    //may need to return piece insted for reasons
    public void setPieceAtCord(int x, int y, Piece piece){
        // Piece p = new Piece(x, y, false, false);
        System.out.println(p.getX() + " " + p.getY());
        
    }
    
    // public void setPieceAtCord(int x, int y){
    //     Piece p = new Piece(x, y, false, false);
    //     System.out.println(p.getX() + " " + p.getY());
        
    // }




    public void setX(int x){
        this.x = x;
    }
    
    public void occupied(int x, int y){
        if (grid[x][y]) {
            
        }
    }
    
    //Make it delete the entire board, make all null
    public void clearBoard(){
        //Don't hard code 8?
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){

            }
        }
    }

    //Sets all the pieces to their correct spots
    public void resetBoard(){
        //White pawns
        Pawn Wp1 = new Pawn(0, 6, false, false);
        Pawn Wp2 = new Pawn(1, 6, false, false);
        Pawn Wp3 = new Pawn(2, 6, false, false);
        Pawn Wp4 = new Pawn(3, 6, false, false);
        Pawn Wp5 = new Pawn(4, 6, false, false);
        Pawn Wp6 = new Pawn(5, 6, false, false);
        Pawn Wp7 = new Pawn(6, 6, false, false);
        Pawn Wp8 = new Pawn(7, 6, false, false);

        //White non-pawns
        Rook Wr1 = new Rook(0, 7, false, false);
        Knight Wh1 = new Knight(1, 7, false, false);
        Bishop Wb1 = new Bishop(2, 7, false, false);
        Queen Wq1 = new Queen(3, 7, false, false);
        King Wk1 = new King(4, 7, false, false);
        Bishop Wb2 = new Bishop(5, 7, false, false);
        Knight Wh2 = new Knight(6, 7, false, false); 
        Rook Wr2 = new Rook(7, 7, false, false);

        //Black pawns
        Pawn Bp1 = new Pawn(0, 1, true, false);
        Pawn Bp2 = new Pawn(1, 1, true, false);
        Pawn Bp3 = new Pawn(2, 1, true, false);
        Pawn Bp4 = new Pawn(3, 1, true, false);
        Pawn Bp5 = new Pawn(4, 1, true, false);
        Pawn Bp6 = new Pawn(5, 1, true, false);
        Pawn Bp7 = new Pawn(6, 1, true, false);
        Pawn Bp8 = new Pawn(7, 1, true, false);
        
        //Black non-pawns
        Rook Br1 = new Rook(0, 0, true, false);
        Knight Bh1 = new Knight(1, 0, true, false);
        Bishop Bb1 = new Bishop(2, 0, true, false);
        Queen Bq1 = new Queen(3, 0, true, false);
        King Bk1 = new King(4, 0, true, false);
        Bishop Bb2 = new Bishop(5, 0, true, false);
        Knight Bh2 = new Knight(6, 0, true, false); 
        Rook Br2 = new Rook(7, 0, true, false);
    }

}
