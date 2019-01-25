import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner inPut = new Scanner(System.in);
        Game game = new Game();
        game.initializeBoard();
        System.out.println("Tic Tac Toe");
        do {
            game.PrintBoard();
            int row;
            int col;

            do {
                System.out.println("Player"  );
                row= inPut.nextInt();
                col= inPut.nextInt();
            }
            while (!game.place(row,col));
            game.changePlayer();

        }while (!game.checkForWin()&& !game.boardFull());
        if (!game.boardFull()&& game.checkForWin()){
            System.out.println("We have a winner");

            game.PrintBoard();
            game.changePlayer();
            System.out.println(Character.toUpperCase(game.player)+ "Wins");
        }else {
            System.out.println("We have a draw");
        }



    }
}
