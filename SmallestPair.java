import java.util.*;

class SmallestPair {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        for(long i = 1; i <= t; i++)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int j=0;j<n;j++)
            {
                a[j] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            int smin = Integer.MAX_VALUE;
            for(int k=0;k<n;k++)
            {
                if(a[k] < min)
                {
                    smin = min;
                    min = a[k];
                }
                else if(a[k] < smin)
                {
                    smin = a[k];
                }
            }
            System.out.println(min + smin);
        }
        
    }
}
