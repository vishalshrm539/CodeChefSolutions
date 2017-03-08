import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author Vishal
 */
 class BearNExtraNum {

public static void main(String arg[]) throws IOException
{
    try
    {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 1; i <= t; i++)
    {
        int N = sc.nextInt();
        long x[] = new long[N];
        for(int k = 0; k < N; k++)
        {
            x[k] = sc.nextLong();
        }
        
        Arrays.sort(x);
        
        for(int k = 0; k < N; k++)
        {
            if(x[k] == x[k+1] || x[k+1] - x[k] > 1)
            {
                if(k+1 < N-1)
                {
                System.out.println(x[k]);
                break;
                }
                System.out.println(x[k+1]);
                break;
            }
        }
        
       // x[N] = -10000000;
/*int  j,l;
        for(j = 0; j < N - 1; j++)
        {
             int count = 0;
           
            if(x[j] != -0)
            {
           
            for(l = 0; l < N; l++)
            {
                if(j != l)
                {
                if(x[j] == x[l]) 
                {
                    break;
                }
                if( Math.abs(x[j] - x[l]) == 1)
                {
                    x[l] = -0;
                    count++;
                break;       
                }
                }
            }
            
            if(x[j] == x[l] || count == 0)
            {
                System.out.println(x[j]);
                break;
            }
            }
        }
        
        if(j == N - 1)
        {
            System.out.println(x[N-1]);
        }
     */   
    }
    }
    catch(Exception e)
    {
        return;
    }
}
 }
