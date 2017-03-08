import java.util.Scanner;

/**
 *
 * @author vishal
 */
class GreddyPuppy {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i <= t; i++)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long max = Integer.MIN_VALUE;
            for(long j=1; j <=k; j++)
            {
                long left = n % j;
                if(left > max)
                {
                    max = left;
                }
            }
            System.out.println(max);
        }
    }
    
}
