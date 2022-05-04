import java.util.*;
public class squreroot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int i = 1;
        int result = 0;
        while(result <= n)
        {
            result = i*i;
            if(result > n)
            {
                break;
            }
            i++;
        }
        System.out.println(--i);
    }
}
