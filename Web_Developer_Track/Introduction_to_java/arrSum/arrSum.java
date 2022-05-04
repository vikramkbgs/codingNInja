import java.util.*;
public class arrSum {

    public static void solve()
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        for(int i =1; i<=n; i++)
        {
            int temp = s.nextInt();
            sum +=temp;
        }
        s.close();
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int i = 1;
        while(i <= t)
        {
            arrSum.solve();
            i++;
        }
        s.close();
    }
}
