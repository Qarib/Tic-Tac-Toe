import java.util.Arrays;
import java.util.Scanner;

public class T {
    private char[][] board;
    private boolean gameOnGoing = true;

    public T() {
        board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], ' ');
        }
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    public boolean gameActive(){
        return gameOnGoing;
    }
    public void askPlayer(char player){
        Scanner inPut = new Scanner(System.in);
        int row,col;
        do {
            System.out.printf(" Player %s plase enter a row (1-3): " ,player);
            row = inPut.nextInt();
            System.out.printf("Player %s plase enter a column (1-3): " , player);
            col = inPut.nextInt();



        }while (notValid(row,col));
        makeMove(player,row-1,col-1);
    }
    public boolean notValid(int row, int col){
        if (row>3 || row<1)
            return true;
        if (col>3 || col<1)
            return true;
        return false;
    }

    public boolean makeMove(char player, int row, int col) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2 ) {
            isEmpty(row , col);
            if (board[row][col] != ' '){
                return false;}
            else {
                board[row][col] = player;
                return true;
            }

        } else{
            return false;}

    }

    public boolean isEmpty(int row , int col){
        if (board[row][col] == ' '){
            return true;
        }
        else {
            System.out.print("That position is taken \n");
            return false;
        }
    }

    public boolean checkForWin(){
        for (int i=0;i<board.length;i++){
            if (board[i][0] == board[i][1] && board[i][1] == board [i][2] &&  board[i][0] !=' ') {
                System.out.print("The winner is :" + board[i][0]);
                gameOnGoing = false;
            }
            }
            for (int j =0;j<board[0].length;j++){
                if (board[0][j] == board[1][j] && board[1][j] == board [2][j] &&  board[0][j] !=' ') {
                    System.out.print("The winner is :" + board[0][j]);
                    gameOnGoing = false;
                }
            }
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] !=' ') {
                System.out.print("The winner is :" + board[0][0]);
                gameOnGoing = false;
            }
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[0][2] !=' ') {
            System.out.print("The winner is :" + board[1][1]);
            gameOnGoing = false;
        }
        return false;
        }

}
