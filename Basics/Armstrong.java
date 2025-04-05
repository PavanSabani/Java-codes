package Basics;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int num=sc.nextInt();
        int temp = num;
        int temp2 = num;

        int count=0;
        while (num!=0) {
            num/=10;
            count++;
        }
        
        int org = temp;
        int sum2=0;

        while (temp2!=0) {
            int rem=temp2%10;
            double pow = Math.pow(rem,count);
            sum2+=pow;
            temp2/=10; 
        }

        if(org==sum2){
            System.out.println("The number is armstrong number");
        }
        else{
            System.out.println("Not a armstrong number ");
        }
        sc.close();
        
    }
}
