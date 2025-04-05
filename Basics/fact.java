package Basics;import java.util.Scanner;

public class fact {
    public  static int fact1(int num){

        if(num==1||num==0){
            return num;
        }
        else{
            return num*fact1(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int ans = fact1(num);

        for(int i=num;i>=2;i--){
            System.out.print(i+" X ");
        }
        System.out.print("1 = " +ans);
        sc.close();
    }
}
