import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Vishal
 */
class BandwidthOfAMatrix {
    static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
    static int max(int a, int b)
    {
        if(a > b)
        {
            return a;
        }
        return b;
    }

    public static void main(String arg[]) throws IOException
{
    try
    {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 1; i <= t; i++)
    {
  int n = sc.nextInt();
  int a[][] = new int[n][n];
    for(int r = 0; r < n; r++)
    {
        for(int c = 0; c < n; c++)
        {
            a[r][c] = sc.nextInt();
        }
    }
    int min = 0;
    int c = 0;
    for(int r = 0; r < n; r++)
    {
        for(c = r + 1; c < n; c++)
        {
            if(a[r][c] == 0 && a[c][r] == 0)
            {
             
            }
            else
            {
                if(a[r][c] != 0 && a[c][r] == 0)
                {
                    for(int k = 0; k < max(r,c); k++)
                    {
                        if(a[k][k] == 0)
                        {
                            int temp = a[k][k];
                            a[k][k] = a[r][c];
                            a[r][c] = temp;
                            break;
                        }
                    }
                }
                else if(a[c][r] != 0 && a[r][c] == 0)
                {
                    for(int k = 0; k <= max(r,c); k++)
                    {
                        if(a[k][k] == 0)
                        {
                             int temp = a[k][k];
                            a[k][k] = a[c][r];
                            a[c][r] = temp;
                            break;
                        }
                    }
                }
                else
                {
                    for(int k = 0; k < max(r,c); k++)
                    {
                        if(a[k][k] == 0)
                        {
                            int temp = a[k][k];
                            a[k][k] = a[r][c];
                            a[r][c] = temp;
                            break;
                        }
                    }
                    
                      for(int k = 0; k <= max(r,c); k++)
                    {
                        if(a[k][k] == 0)
                        {
                             int temp = a[k][k];
                            a[k][k] = a[c][r];
                            a[c][r] = temp;
                            break;
                        }
                    }
                    
                    
                }
            }
                    if(a[r][c] != 0 || a[c][r] != 0)
                {
                    min++;
                    r++;
                }
        
        }
            
        
    }
    
    System.out.println(min);
}
    }
    catch(Exception e)
    {
        return;
    }
}
}
