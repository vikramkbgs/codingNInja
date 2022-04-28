import java.util.*;

public class oddSum {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int i  = 0;
        Vector<Int> vec = new Vector<>();
        int k = 1;
        for (int j = 0; j <n; j++) {
            vec.addElement(k);
            k = k + 2;
        }
        while(i < n){

            for(int p = i; p<n; p++ )
            {
                System.out.println(vec[p]);
            }
            
            i++;
        }
    }
}
