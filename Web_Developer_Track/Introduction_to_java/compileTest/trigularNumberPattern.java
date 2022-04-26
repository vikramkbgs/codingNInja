// package NinjaCarrerCampApril.Web_Developer_Track.Introduction_to_java.compileTest;
import java.util.*;
public class trigularNumberPattern {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(i+1);
            System.out.println();
        }

    }
}
