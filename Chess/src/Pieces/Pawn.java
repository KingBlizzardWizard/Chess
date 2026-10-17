package Pieces;
public class Pawn extends Piece {
    
    public Pawn(/*int x, int y, */boolean color, boolean deadOrAlive){
        super(/*x, y, */color, deadOrAlive);
    }


    //Remake after board is implemented
    @Override 
    public void movements(){
        System.out.println("pawn move");
    }
}
