package Basics;import java.util.Scanner;

public class JackedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jack[][] = new int[3][];

        jack[0]=new int[2]; // first row will have 2 cols
        jack[1]=new int[4]; // second row will have 4 cols
        jack[2]=new int[3]; // Third row will have 3 cols // This is called Jack Array

        for(int i=0;i<jack.length;i++){
            for(int j=0;j<jack[i].length;j++){
                jack[i][j]=sc.nextInt();
            }
        }

        sc.close();

        for(int i=0;i<jack.length;i++){
            for(int j=0;j<jack[i].length;j++){
                System.out.print(jack[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
