import java.util.Scanner;
/**
 *
 * @author vishal
 */
 class ChefNApartment {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++)
        {
            int N = sc.nextInt();
            long a[] = new long[N];
            int start = 0;
            int sum = 0;
            for(int j = 0; j < N; j++)
            {
                a[j] = sc.nextInt();
                if(a[j] == 0)
                {
                    sum += 1100;
                }
                else
                {
                   
                for(int k = start; k < j; k++)
                {
                    if(a[k] == 0)
                    {
                     //   start = k+1;
                        a[k] = 1;
                        sum += 100;
                        a[j] = 0;
                        start = j;
                        break;
                        
                    }
                }
                 
            }
               
            }
                System.out.println(sum);
        
    }
    
}
 }