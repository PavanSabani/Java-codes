package Basics;
import java.util.Scanner;

public class Dowhilegame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Player 1 enter choose a number:");
        int input = sc.nextInt();

        int guess;
        int count=0;
        boolean got = false;

        do{
            System.out.println("player 2 Guess The number:");
            guess = sc.nextInt();
            count++;

            if(guess==input){
                System.out.println("You win");
                got=true;
            }
            else if(guess >input){
                System.out.println( "Guess lower");
            }
            else{
                System.out.println("Guess higher");
            }

        }while(got!=true);

        System.out.println("You guessed in :"+ count +" guesses");

        sc.close();
    }
}
