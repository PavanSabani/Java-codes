package Basics;import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        String ans =(num%2==0) ? "even" : "odd";
        System.out.println(ans);
        sc.close();

    }
}
