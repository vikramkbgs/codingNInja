
import java.util.*;

public class powerNumber{

    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = s.nextInt();
        int total;
        total = 1;
        while (i > 0) {
            total *= n;
            i--;
        }
        System.out.println(total);
    }
}