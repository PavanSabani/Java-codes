package Basics;
import java.util.Scanner;

public class bubblesort {
    public static void sort(int[] array){
        int temp;
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array=new int[5];
        System.out.println("Enter array elements:");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        sort(array);
        
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}