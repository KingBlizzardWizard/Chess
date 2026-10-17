import Pieces.Piece;

public class Square {
    private int x;
    private int y;
    private Piece piece;

        public Square(int x, int y){
        this.x = x;
        this.y = y;
        // this.piece = p;
    }

    public Square(int x, int y, Piece p){
        this.x = x;
        this.y = y;
        this.piece = p;
    }

        public Piece getPiece()
    {
        return this.piece;
    }

    public void setPiece(Piece p)
    {
        this.piece = p;
    }
    
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
}
