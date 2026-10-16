package Pieces;
public class Knight extends Piece{
    public Knight(int x, int y, boolean color, boolean deadOrAlive){
        super(x, y, color, deadOrAlive);
    }


    //Remake after board is implemented
    @Override 
    public void movements(){
        System.out.println("Knight move");
    }
}
