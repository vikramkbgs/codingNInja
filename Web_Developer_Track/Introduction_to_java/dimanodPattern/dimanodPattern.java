
// package NinjaCarrerCampApril.Web_Developer_Track.Introduction_to_java.compileTest;
import java.util.*;

public class dimanodPattern {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        s.close();
        for (int i = 1; i <= rows; i++) {
            // Print space in decreasing order
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            // Print space in increasing order
            for (int j = rows - 1; j >= i; j--) {
                System.out.print(" ");
            }
            // Print star in decreasing order
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
