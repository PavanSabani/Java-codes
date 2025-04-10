package Basics;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
        public static void bin(int[] arr, int key) {

            Arrays.sort(arr);
            int low = 0, high = arr.length - 1;

            while (low <= high) {

                int mid = (high + low) / 2;

                if (arr[mid] == key) {
                    System.out.println(key+" IS FOUND");
                    return;
                } else if (arr[mid] > key) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            
            System.out.println(key+" Is NOT FOUND");
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in Array:");
        int n = sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the element:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key to search:");
        int key = sc.nextInt();

        bin(arr,key);
        sc.close();
    }
}
