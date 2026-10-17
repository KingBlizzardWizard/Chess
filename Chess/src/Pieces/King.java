package Pieces;

public class King extends Piece{
    public King(/*int x, int y, */boolean color, boolean deadOrAlive){
        super(/*x, y, */color, deadOrAlive);
    }


    //Remake after board is implemented
    @Override 
    public void movements(){
        System.out.println("King move");
    }
}
