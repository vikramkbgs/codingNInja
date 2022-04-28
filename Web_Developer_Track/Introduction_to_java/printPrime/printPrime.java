import java.util.*;
public class printPrime {

    public static void prime(int n)
    {
        for(int j = 2; j <= n; j++)
        {
            int i;
            for(i = 2; i<=Math.sqrt(n); i++)
            {
                if(j%i == 0)
                break;
            }
            if(i > Math.sqrt(j))
            System.out.println(j);
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        printPrime.prime(n);
    }
}
