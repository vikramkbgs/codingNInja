// package NinjaCarrerCampApril.Web_Developer_Track.Introduction_to_java.compileTest;
import java.util.*;
public class alphaPattern {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for (int i = 'A'; i <'A'+ n; i++) {
            for (int j = 'A'+0; j <= i; j++)
                System.out.print((char)i);
            System.out.println();
        }

    }
}
