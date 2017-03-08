

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Vishal
 */
class BearNSorted {
    
    
    public  static boolean less(long a,long b)
{
    return a < b;
}
public static void exch(long arr[][],int i,int a, int b)
{
    long swap = arr[i][a];
    arr[i][a] = arr[i][b];
    arr[i][b] = swap;
}
public static void sort(long a[][],int i, int j)
{
    //int length = a.length;
    for(int r=0;r < j;r++)
    {
        int min = r;
        for(int c=r+1;c < j ;c++){
            
            if(less(a[i][c] , a[i][min]))
            {
                min = c;
            }
        }
        exch(a,i,r,min);
    }
}
    
    static boolean isSorted(long a[][],int i, int j)
    {
        for(int c = 0; c < j - 1; c++)
        {
            if(a[i][c] > a[i][c+1])
            {
                return false;
            }
        }
        return true;
    }
public static void main(String arg[]) throws IOException
{
    try
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
        long a[][] = new long[n][n];
        for(int ro = 0; ro < n; ro++)
        {
            for(int co = 0; co <n ; co++)
            {
                a[ro][co] = sc.nextLong();
            }
        }
    for(int i = 0; i < n; i++)
    {
        if(!isSorted(a,i,n))
        {
            sort(a,i,n);
        }
    }
    
          for(int ro = 0; ro < n; ro++)
        {
            for(int co = 0; co <n ; co++)
            {
                System.out.print(a[ro][co] +" ");
            }
            System.out.println();
        }
    }
    catch(Exception e)
    {
        return;
}
}
}
