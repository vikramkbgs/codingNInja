import java.util.*;

public class triangleOfNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n;
        n  = s.nextInt();
        s.close();
        int i = 1;
        while(i <= n)
        {
            // print space
            for(int j = 0; j<n-i; j++)
            {
                System.out.print(" ");
            }
            // print number
            int k = i;
            for (k = i; k < 2*i; k++) {
                System.out.print(k);
            }
            for ( k = k-2; k >= i; k--) {
                System.out.print(k);
            }
            System.out.println();
            i++;
        }
    }
}