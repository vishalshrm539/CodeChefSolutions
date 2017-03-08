import java.util.Scanner;
/**
 *
 * @author vishal
 */
 class MinNMax {
    
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =1; i <= t; i++)
        {
            int cost = 0;        
            int N = sc.nextInt();
            int a[] = new int[N];
            for(int j=0; j < N; j++)
            {
                a[j] = sc.nextInt();
            }
            for(int k=N-1; k >= 1; k--)
            {
             if(a[k] > a[k-1])
             {
              //   N--;
                 cost += a[k-1];
             }
             else
             {
                 a[k-1] = a[k];
                // N--;
                 cost += a[k];
             }
            }
            System.out.println(cost);
        
    }
}
}
