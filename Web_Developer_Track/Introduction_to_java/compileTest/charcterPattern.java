// package NinjaCarrerCampApril.Web_Developer_Track.Introduction_to_java.compileTest;
import java.util.*;
public class charcterPattern {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = 0;
        s.close();
        for (int i = 'A' + 0; i <'A'+n; i++) {
            for (int j = i; j <= i + k ; j++)
                System.out.print((char)(j));
            System.out.println();
            k++;
        }

    }
}
