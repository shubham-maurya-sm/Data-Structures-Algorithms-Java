//         Que- SquareHallowPattern


//         ******
//         *    *
//         *    *
//         *    *
//         *    *
//         ******



package Patterns;
import java.util.*;

public class SquareHallowPattern {
    
    public void SquareHallow(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0 || i==n-1 || j==n-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("\n");
        SquareHallowPattern obj=new SquareHallowPattern();

        obj.SquareHallow(n);

    }
}
