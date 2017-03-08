import java.util.Scanner;
/**
 *
 * @author vishal
 */
class CuttingRecipies {
    
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++)
            {
                a[j] = sc.nextInt();
                if(a[j] < min)
                {
                    min = a[j];
                }
            }
            int k , l;
            int hcf=1;
            for(k = 1; k <= min; k++)
            {
                for(l = 0; l <n ; l++)
                {
                    if(a[l] % k != 0)
                    {
                        break;
                    }
                }
                if(l == n)
                {
                   hcf = k;
                }
            }
            for(k = 0; k < n ;k++)
            {
                a[k] = a[k] / hcf;
                System.out.print(a[k] +" ");
            }
            System.out.println("");
        }
    }
}
