package Pieces;

public class Queen extends Piece{
    public Queen(/*int x, int y, */boolean color, boolean deadOrAlive){
        super(/*x, y, */color, deadOrAlive);
    }


    //Remake after board is implemented
    @Override 
    public void movements(){
        System.out.println("Queen move");
    }
}
