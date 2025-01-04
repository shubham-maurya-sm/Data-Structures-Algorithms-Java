/*          Que- Number Triangle Pattern

        1
       2 2 
      3 3 3
     4 4 4 4
    5 5 5 5 5

 */


package Patterns;

import java.util.Scanner;

public class NumberTrianglePattern {

    public void NumberTriangle(int n){
        int num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
                
            }
            System.out.println();
            num++;
        }
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.println("\n");

        NumberTrianglePattern obj=new NumberTrianglePattern();

        obj.NumberTriangle(n);

    }
}
