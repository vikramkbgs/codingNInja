import java.util.Scanner;
import java.lang.Math;
public class Main {
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int bs;
        bs = s.nextInt();
        char g;
        g= s.next().charAt(0);
        
        int allow = 0;
        if(g == 'A')
            allow = 1700;
        else if(g == 'B')
            allow = 1500;
        else
            allow = 1300;
        
        System.out.println(Math.round(bs+.2*bs+.5*bs-.11*bs+allow));
	}
}
