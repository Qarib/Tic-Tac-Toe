public class M {
    public static void main (String[]args){
        T t=new T();
        t.printBoard();
        int cunter = 1;
        while (t.gameActive()&& cunter <10){
            if (cunter % 2 ==0) {
                t.askPlayer('O');
            }
            else {
                t.askPlayer('X');
                cunter++;
            }

                System.out.println("\n");
                t.printBoard();
                t.checkForWin();

            if (cunter == 10){
                System.out.print("We have no wins !\n");
            }
        }

    }
}
