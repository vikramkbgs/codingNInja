import java.util.*;
public class mirrorImage {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int x = 1;
        for(int i =1; i<= n; i++)
        {
            for(int j = 0; j < n - i; j++ )
            System.out.print(" ");
            for(int k = 0; k < i; k++)
            System.out.print(x++);
            System.out.println();
            x = 1;
        }

    }
}
