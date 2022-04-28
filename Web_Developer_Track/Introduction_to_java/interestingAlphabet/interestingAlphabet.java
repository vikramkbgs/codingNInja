
import java.util.*;
public class interestingAlphabet {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        n--;
        int k = 0;
        s.close();
        for (int i = 'A' + n; i >='A'; i--) {
            for (int j = i; j <= i + k ; j++)
                System.out.print((char)(j));
            System.out.println();
            k++;
        }

    }
}
