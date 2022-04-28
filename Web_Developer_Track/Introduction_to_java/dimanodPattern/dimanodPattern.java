
// package NinjaCarrerCampApril.Web_Developer_Track.Introduction_to_java.compileTest;
import java.util.*;

public class dimanodPattern {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        
        int i = 1;
        while(i <= (n+1)/2)
        {
            // for space
            for(int j = 0; j<(n+1)/2-i; j++)
            {
                System.out.print(" ");
            }
            // for star
            for (int k = 0; k < 2*i-1 && n >= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        i = 1;
        while(i < (n+1)/2)
        {
            // second half

            for (int j = (n + 1) / 2; j > (n + 1) / 2 - i; j--) {
                System.out.print(" ");
            }
            // for star
            for (int k = 0; k <= (n + 1) / 2 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}
