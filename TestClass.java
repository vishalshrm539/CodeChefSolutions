
import java.util.*;

class TestClass {
    
     public static int max(int a, int b)
        {
            if(a > b)
            {
                return a;
            }
            else
            {
                return b;
            }
        }
       
    public static void main(String args[] ){
        
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int att[] = new int[N];
        int pos[] = new int[N];
        int sum = 0;
        int diff;

        for (int i = 0; i < N; i++) {
           att[i] = s.nextInt();
           pos[i] = s.nextInt();
           
        }
        for(int j=0;j<N-1;j++)
        {
            for(int k=j+1;k<N;k++)
            {
                diff = Math.abs(pos[k] - pos[j]);
                sum = sum + diff * max(att[k], att[j]);
            }
        }
        System.out.print(sum);
        
        
            }
}

