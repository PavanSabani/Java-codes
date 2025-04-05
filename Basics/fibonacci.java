package Basics;import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();

        int[] fib = new int[num];
        fib[0]=0;
        fib[1]=1;

        for(int i=2;i<num;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }

        System.out.println("Fibonacci sequence:");

        for(int i=0;i<num;i++){
            System.out.print(fib[i]+" ");
        }

        sc.close();
        
    }
}
