package Pieces;
public class Piece {
    int x;
    int y;
    boolean color; //true = white, false = black
    boolean deadOrAlive; //True = alive, false = dead

    public Piece(int x, int y, boolean color, boolean deadOrAlive){
        this.x = x;
        this.y = y;
        this.color = color;
        this.deadOrAlive = deadOrAlive;
        //may want to switch the booleans to struings
    }

    //Setters and getters
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }    
    public int getY(){
        return y;
    }    
    public void setY(int y){
        this.y = y;
    }
    public boolean getColor(){
        return color;
    }
    public void setColor(boolean color){
        this.color = color;
    }
    public boolean getDeadOrAlive(){
        return deadOrAlive;
    }
    public void setDeadOrAlive(boolean deadOrAlive){
        this.deadOrAlive = deadOrAlive;
    }

//This just has to exist
    public void movements(){
        //System.out.println("piece move");
    }
}
