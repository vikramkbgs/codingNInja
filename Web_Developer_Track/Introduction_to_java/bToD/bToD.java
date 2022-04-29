import java.util.*;
public class bToD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int sum = 0;
        int index = 0;
        while(n > 0)
        {
            sum += n%10*(1<<index);
            index++;
            n /= 10;
        }
        System.out.println(sum);
    }
}
