import java.util.*;
public class parallelogramPattern {
   public static void main (String[] args)
   {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       s.close();
       int i =1;
       while(i <= n)
       {
           for(int j = 0; j < i-1; j++)
           {
               System.out.print(" ");
           }
           for(int k =0; k<n; k++)
           System.out.print("*");
           System.out.println();
           i++;
       }
   }
}
