import java.util.*;

public class triangleOfNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n;
        n  = s.nextInt();
        s.close();
        int x = 1;
        int original = n;
       while (n > 0) 
       {
           // for space 
           int m = n-1;
           int num = original - m;
           while(m > 0) 
           {
               System.out.print(" ");
               m--;
           }
           
           // print number
           while (num > 1) {
               System.out.print(x);
               x++;
               num--;
           }
           System.out.println();
           n--;
       }
    }
}