import java.util.*;
public class sumProduct {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = s.nextInt();
        s.close();
        switch(c)
        {
            case 1 :
            int sum = 0;
            for(int i =1; i<=n; i++)
            {
                sum += i;
            }
            System.out.println(sum);
            break;
            case 2:
            int mul = 1;
                for (int i = 1; i <= n; i++) {
                    mul *= i;
                }
                System.out.println(mul);
                break;
            default:
            System.out.println(-1);
        }
    }
}
