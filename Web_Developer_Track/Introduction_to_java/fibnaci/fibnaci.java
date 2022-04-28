import java.util.Scanner;

public class fibnaci {

   public static int fib(int n)
    {
        if(n <= 1)
        return 1;
        else
        {
            return fibnaci.fib(n-1)+fibnaci.fib(n-2);
        }
    }
    public static void main(String[] args)
    {
       Scanner s =  new Scanner(System.in);
       int n = s.nextInt();
       s.close(); 
       for(int i =0; i<=n; i++)
        System.out.println(fibnaci.fib(i));
    }
}
