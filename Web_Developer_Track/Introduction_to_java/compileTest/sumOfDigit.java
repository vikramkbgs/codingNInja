
import java.util.*;

public class sumOfDigit {

    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int oddsum, evensum;
        oddsum = evensum = 0;
        while (n > 0) {
            if(n%2 == 0)
            evensum += n%10;
            else
            oddsum += n%10;

            n /= 10;
        }

        System.out.println(evensum+" "+oddsum);

    }
}