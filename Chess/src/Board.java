import Pieces.*;

public class Board {
    int x;
    int y;
    int[][] grid = new int[x][y];

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

    public void getPieceCoords(Piece p){
        System.out.println(p.getX() + " " + p.getY());
    }

    public void setX(int x){
        this.x = x;
    }    
}
