import Pieces.*;

public class Board2 {
    //Make modular size later
    Square[][] boxes = new Square[8][8];

    public Board2()
    {
        this.resetBoard();
        // this.clearBoard();
    }

    public Square getBox(int x, int y){
        return boxes[x][y];
    }

    // public void setBox(){
    //     boxes[0][0] = new Square(0, 0, new Pawn(false,false));
    // }


    public void clearBoard(){
         for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boxes[i][j] = new Square(i, j);
            }
        }
    }

    public void resetBoard()
    {
       //White pawns
        boxes[6][0] = new Square(6, 0, new Pawn(false, false));
        boxes[6][1] = new Square(6, 1, new Pawn(false, false));
        boxes[6][2] = new Square(6, 2, new Pawn(false, false));
        boxes[6][3] = new Square(6, 3, new Pawn(false, false));
        boxes[6][4] = new Square(6, 4, new Pawn(false, false));
        boxes[6][5] = new Square(6, 5, new Pawn(false, false));
        boxes[6][6] = new Square(6, 6, new Pawn(false, false));
        boxes[6][7] = new Square(6, 7, new Pawn(false, false));

        //White non-pawns
        boxes[7][0] = new Square(7, 0, new Rook(false, false));
        boxes[7][1] = new Square(7, 1, new Knight(false, false));
        boxes[7][2] = new Square(7, 2, new Bishop(false, false));
        boxes[7][3] = new Square(7, 3, new Queen(false, false));
        boxes[7][4] = new Square(7, 4, new King(false, false));
        boxes[7][5] = new Square(7, 5, new Bishop(false, false));
        boxes[7][6] = new Square(7, 6, new Knight(false, false));
        boxes[7][7] = new Square(7, 7, new Rook(false, false));


        //Black pawns
        boxes[1][0] = new Square(6, 0, new Pawn(true, false));
        boxes[1][1] = new Square(6, 1, new Pawn(true, false));
        boxes[1][2] = new Square(6, 2, new Pawn(true, false));
        boxes[1][3] = new Square(6, 3, new Pawn(true, false));
        boxes[1][4] = new Square(6, 4, new Pawn(true, false));
        boxes[1][5] = new Square(6, 5, new Pawn(true, false));
        boxes[1][6] = new Square(6, 6, new Pawn(true, false));
        boxes[1][7] = new Square(6, 7, new Pawn(true, false));

        
        //Black non-pawns
        boxes[0][0] = new Square(0, 0, new Rook(true, false));
        boxes[0][1] = new Square(0, 1, new Knight(true, false));
        boxes[0][2] = new Square(0, 1, new Bishop(true, false));
        boxes[0][3] = new Square(0, 1, new Queen(true, false));
        boxes[0][4] = new Square(0, 1, new King(true, false));
        boxes[0][5] = new Square(0, 1, new Bishop(true, false));
        boxes[0][6] = new Square(0, 6, new Knight(true, false));
        boxes[0][7] = new Square(0, 7, new Rook(true, false));




        // initialize remaining boxes without any piece
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                boxes[i][j] = new Square(i, j);
            }
        }
        // System.out.print("Rendezvous");
        // for(int i = 0; i<8;i++){
        //     for(int j = 0; j<8; j++){
        //         // boxes[i][j] = new Square(i, j);
        //         if(this.getBox(j, i).getPiece() !=null){
        //         System.out.print(i + "," + j);
        //         System.out.println(this.getBox(i, j).getPiece().getColor());
        //         }else{
        //         System.out.print(i + "," + j);
        //         System.out.println(this.getBox(i, j).getPiece());
        //         }

        //     }
        // }
    }
}