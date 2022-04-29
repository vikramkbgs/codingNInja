import java.util.*;
public class apTerm {
    public static void main ( String [] args)
    {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        s.close();
        int i = 1, q = 1;
        while(i <= x)
        {
            int sum = 3*q+2;
            if(sum % 4 != 0)
            {
                System.out.print(sum+" ");
                i++;
            }
            q++;
        }
    }
}
