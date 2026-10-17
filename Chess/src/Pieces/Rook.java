package Pieces;

public class Rook extends Piece{
    public Rook(/*int x, int y, */boolean color, boolean deadOrAlive){
        super(/*x, y, */color, deadOrAlive);
    }


    //Remake after board is implemented
    @Override 
    public void movements(){
        System.out.println("Rook move");
    }
}
