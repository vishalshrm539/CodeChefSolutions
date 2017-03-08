import java.util.Scanner;


/**
 *
 * @author Vishal
 */
class XennyNAlternating {
    static long min(long a, long b)
    {
        if(a < b)
        {
            return a;
        }
        return b;
    }

public static void main(String arg[])
{
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 1; i <= t; i++)
    {
        int N = sc.nextInt();
        long x[] = new long[N];
        for(int k = 0; k < N; k++)
        {
            x[k] = sc.nextInt();
        }
        long y[] = new long[N];
        for(int k = 0; k < N; k++)
        {
            y[k] = sc.nextInt();
        }
        long xsum = 0;
        long ysum = 0;
        int count = 0;
        for(int j = 0; j < N; j++)
        {
            if(count == N)
            {
                break;
            }
            if(j % 2 == 0)
            {
            xsum += x[j];
            ysum += y[j];
            }
            else
            {
                xsum += y[j];
                ysum += x[j];
            }
            count++;
        }
        System.out.println(min(xsum, ysum));
    }
}
}
