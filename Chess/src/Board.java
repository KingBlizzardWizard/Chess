import Pieces.*;

public class Board {
    int x;
    int y;
    int[][] grid = new int[x][y];


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
    public void getPieceCoords(Piece p){
        System.out.println(p.getX() + " " + p.getY());
    }

    //may need to return piece insted for reasons
    public void setPieceAtCord(int x, int y){
        Piece p = new Piece(x, y, false, false);
        System.out.println(p.getX() + " " + p.getY());
        
    }




    public void setX(int x){
        this.x = x;
    }
    
    
    //Make it delete the entire board, make all null
    public void clearBoard(){

    }

    //Sets all the pieces to their correct spots
    public void newGame(){

    }

}
