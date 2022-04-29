import java.util.*;
public class revNum {
 public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     s.close();
     int rev = 0;
     while(n>0)
     {
         int rem = n%10;
         rev = 10*rev + rem;
         n /= 10;
     }
     System.out.println(rev);
        
    }
}
