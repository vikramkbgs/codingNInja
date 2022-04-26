// package NinjaCarrerCampApril.Web_Developer_Track.Introduction_to_java.compileTest;
import java.util.*;
public class invertedTriangle {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for (int i = n; i >= 0; i--) {

            for (int k = 0; k < i; k++)
                System.out.print(i);
            System.out.println();
        }

    }
}
