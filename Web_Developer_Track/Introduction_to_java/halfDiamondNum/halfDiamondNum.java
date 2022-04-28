import java.util.*;
public class halfDiamondNum {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        System.out.println("*");
        for(int i =1; i<n+1; i++)
        {
            System.out.print("*");
            for(int j = 1; j<i+1; j++)
            {
                System.out.print(j);
            }
            for(int j = i - 1; j>0; j--)
            {
                System.out.print(j);
            }
            System.out.print("*");
            System.out.println();
        }

        for(int i = n-1; i>0;  i--)
        {
            System.out.print("*");
            for(int j = 1; j<i+1; j++)
            {
                System.out.print(j);
            }

            for(int j = i - 1; j>0; j--)
            {
                System.out.print(j);
            }
            System.out.print("*");
            System.out.println(); 
        }
        System.out.print("*");
    }
}
