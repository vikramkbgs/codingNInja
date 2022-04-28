
// package NinjaCarrerCampApril.Web_Developer_Track.Introduction_to_java.compileTest;
import java.util.*;

public class starPattern {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        s.close();
        //int i , j;
    for (int i=1; i<=rows; i++) 
            { 
                // Print space in decreasing order 
                for (int j=rows; j>i; j--)
                {
                    System.out.print(" ");
                }
                // Print star in increasing order
                for (int k=1; k<=(i * 2) -1; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

    }
}
