import java.util.*;
public class sumPattern {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int i = 1;
        while (i <= n) {
            int sum = 0;
            for(int k = 1; k < i; k++){
                System.out.print(k+"+");
                sum +=k;

            }
            sum += i;
            System.out.print(i + "="+sum);
            System.out.println();
            i++;
        }
    }
}
