import java.util.*;
public class DtoB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Stack<Integer>st = new Stack<Integer>();
        s.close();
        while(n > 0)
        {
            st.push(n%2);
            // System.out.println(n % 2);
            n /= 2;
           
        }

        while(!st.empty())
        {
            System.out.print(st.peek());
            st.pop();
        }
    }
}
