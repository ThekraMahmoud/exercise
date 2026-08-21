import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class project1 {

//   static char[][] board = {{}};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        welcome();

        char computer = ' ';
        char player=' ';

//تكرار لعملية اختيار دور اللاعب بحيث انو ما يقبل الا فقط x or o
            do {
                try {
                player = s.next().charAt(0);
                player = Character.toUpperCase(player);
                choosePlayer(player);

                if (player == 'X') {
                    computer = 'O';
                    System.out.println("      The Computer is " + computer);
                }
                if (player == 'O') {
                    computer = 'X';
                    System.out.println("      The Computer is " + computer);
                }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
}while (player!='X'&&player!='O');

        System.out.println("   \n    choose Number Form 0-8 ");
        System.out.println("   ــــــــــــــــــــــــــ");
        char[][] board = {{'0', '1', '2'}, {'3', '4', '5'}, {'6', '7', '8'}};
        Fream(board);



        while (!isBordFull(board)) {
            choseOpitonForPlayer(board, player);
            Fream(board);
            char winner =RolesForWenner(board);
            if(winner != ' '){
                winner( winner, player, computer);
                break;
            }
            if (isBordFull(board)) {
                break;
            }
            System.out.println();

            choseOpitonForComputer(board, computer);
            Fream(board);
             winner =RolesForWenner(board);
            if(winner!=' '){
                winner( winner, player, computer);
                break;
            }

        }
    }
    static char RolesForWenner(char[][] board) {
        for (int row = 0; row < 3; row++) {
            //row
            if ((board[row][0] == 'X' || board[row][0] == 'O')
                    && (board[row][0] == board[row][1])
                    && (board[row][1] == board[row][2])) {
                return board[row][0];
            }
        }
            for (int column = 0; column < 3; column++) {
                //column
                if((board[0][column]=='X'||board[0][column]=='O')
                &&(board[0][column]==board[1][column])
                &&(board[1][column]==board[2][column])){
                    return board[0][column];
                }

            }
        //first diagonal
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }
        //second diagonal
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];

        }
return ' ';
    }


    static void welcome(){
        Scanner s=new Scanner(System.in);
        System.out.println('\n'+"  =============================");
        System.out.println("   # WELCOME TO (X | O) GAME # ");
        System.out.println("  =============================\n");
        System.out.println("          Let's Play !\nThis Is Classic A Tic-Tac-Toe Game.\nYour Goal Is To Get Three X's or O's \n In A Row ,Column,or Diagonal.\n");
        System.out.println("\n    Press ENTER to continue ......");
        s.nextLine();
        System.out.println("          START NEW");
        System.out.println("    Please Choose Your Symbol  \n" + "          (X or O)  ");
    }

    static void Fream(char[][] board){
    for (int row = 0; row <3; row++){
        for(int column = 0; column <3; column++){
            //هنا الشروط كانت فقط عشان التنسيق لاني ابغا يكون الجدول مشابه لجدول XO
            System.out.print("   "+" "+board[row][column]+" ");
            // فقط ابغاه يفصل بين القيم الي في الرو
            if(column<2)
             System.out.print("   |");
        }
         System.out.println();
        //ابغاه يفصل بين الصفوف
        if (row<=2){
        System.out.println("   ــــــــــــــــــــــــــ");}
    }
    }//End methode Frame

    static char choosePlayer(char player)throws Exception {
//    player=Character.toUpperCase(player);

            if (player == 'X' || player == 'O') {
                System.out.println("     You Are A Player " + player);
                return player;
            } else {
                throw new Exception("           " +
                        " Oops !!!" + "\n  " +
                        " This Is A Tac-Tac-Toe Game ^__^ \n " +
                        "You Have To Enter The Letter X or O");
            }

        }


    public static void choseOpitonForPlayer( char[][] board,char player ){
       Scanner s=new Scanner(System.in);
        System.out.println("            Chose Positon \n " +
                "Mst be the seme number in  tha table");
        while (true) {
            try {
                int positon = s.nextInt();
                System.out.println("Your chose positon " + positon);
                //عشان اوجد الصف
                int positonRow = (positon) / 3;
                //عشان اوجد العمود
                int positonColumn = (positon) % 3;
                if (positon < 0 || positon > 8){
                    throw new Exception("Position must be between 0 and 8");
                }
                if (board[positonRow][positonColumn] >= '0' && board[positonRow][positonColumn] <= '8') {
                    board[positonRow][positonColumn] = player;
                    break;
                }
                System.out.println("Most Select Empty positon");
                //لين هنا
            }   catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        }

    public static void choseOpitonForComputer(char[][] board ,char computer){
     Random random=new Random   ();
     while (true){
     int posione=random.nextInt(9);
         System.out.println("The Computer chose "+posione);
        int posioneRow=posione/3;
        int positonColumn=posione%3;
        //هنا نتكلم عن الحرف الي داخل المصفوفه
        if (board[posioneRow][positonColumn]>='0'&&board[posioneRow][positonColumn]<='8') {
            board[posioneRow][positonColumn] = computer;
            break;
        }
        }
        }

static boolean isBordFull(char [][] board){
    for(int row=0;row<3;row++){
        for (int column=0;column<3;column++){
            if (board[row][column]>='0'&& board[row][column]<='8'){
                return false;
            }
        }
    }return true;

}


static void array(char [][] board) {
    for (int row = 0; row < 3; row++) {
        for (int column = 0; column < 3; column++) {
        }
    }
}




static void winner(char winner,char player,char computer) {
        if (winner == player){
            System.out.println("   Player is A Winner ! @_@" );
        }else if (winner==computer){
            System.out.println("     Game Over 00 \n" +
                    "   Computer Is A Winner ");
        }



}

}













