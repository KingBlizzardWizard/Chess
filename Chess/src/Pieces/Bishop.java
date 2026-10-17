package Pieces;

public class Bishop extends Piece{
    public Bishop(/*int x, int y, */boolean color, boolean deadOrAlive){
        super(/*x, y, */color, deadOrAlive);
    }


    //Remake after board is implemented
    @Override 
    public void movements(){
        System.out.println("Bishop move");
    }
}
