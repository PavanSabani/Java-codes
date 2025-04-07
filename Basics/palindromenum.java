package Basics;import java.util.Scanner;

public class palindromenum {

    public static int reverse(int num){
        int count=0;
        while (num!=0) {
            num/=10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        number=sc.nextInt();

        int count = reverse(number);
        System.out.println("the number of digits = "+count);
        sc.close();

    }
}

