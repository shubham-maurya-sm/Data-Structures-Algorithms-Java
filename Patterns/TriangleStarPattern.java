/*  Que- Triangle star pattern

        *
       * *
      * * *
     * * * *
    * * * * * 
   * * * * * *
 


 */

package Patterns;

import java.util.Scanner;

public class TriangleStarPattern {
    public void TriangleStar(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.println("\n");

        TriangleStarPattern obj=new TriangleStarPattern();

        obj.TriangleStar(n);

    }
}
