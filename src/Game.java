public class Game {
    private char [][] board;
    public char player;

    public Game(){
        board = new char[3][3];
    }
    public void initializeBoard(){
        for (int i = 0 ; i<3 ; i++){
            for (int j = 0 ; j<3 ; j++){
                board [i][j]= ' ';
            }
        }
    }
    public void PrintBoard(){
        System.out.println("-------------");
        for (int i = 0;i<3;i++){
            System.out.print("| ");
            for (int j =0 ; j<3;j++){
                System.out.print(board [i][j]+" | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    public boolean boardFull(){
        boolean full = true;
        for (int i = 0 ; i<3;i++){
            for (int j =0;j<3;j++){
                if (board[i][j]==' '){
                    full=false;
                }
            }
        }
        return full;
    }
    public boolean checkForWin(){
        return(checkRowsForWin() || checkColumnsForWin()|| checkDiagonnalsForWin());
    }
    private boolean checkRowsForWin(){
        for (int i = 0 ; i<3 ;i++){
            if (checkRowCol(board[i][0],board[i][1],board[i][2])==true){
                return true;
            }
        }
      return false;
    }
    private boolean checkColumnsForWin(){
        for (int i = 0 ; i<3;i++){
            if (checkRowCol (board[0][i],board[1][i],board[2][i])==true){
                return true;
            }
        }
        return false;
    }
    private boolean checkDiagonnalsForWin(){
       return (checkRowCol (board[0][0],board[1][1],board[2][2])==true || checkRowCol ( board[0][2],board[1][1],board[2][0])==true);
    }
    private boolean checkRowCol(char a,char b, char c){
        return ((a != ' ') && (a==b) && (b==c));
    }
    public void changePlayer(){
        if (player == 'X'){
            player = 'O';

        }else {
            player = 'X';
        }
    }
    public boolean place(int row , int col){
        if ((row >= 0) && (row <3)){
            if((col >= 0) && (col <3)){
                if (board [row][col]==' '){
                    board [row][col]=player;
                    return true;
                }

            }
        }
        return false;
    }


}
