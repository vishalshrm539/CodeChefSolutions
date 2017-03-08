import java.util.Scanner;
/**
 *
 * @author vishal
 */
class GCDNLCM {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i <=t; i++)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long gcd = 1;
            long min;
            if(a < b)
            {
                min = a;
            }
            else
            {
                min = b;
            }
            for(long j = 2; j <= min; j++)
            {
                if(a % j == 0 && b % j == 0)
                {
                    gcd = j;
                }
            }
            long lcm = a * b;
            System.out.print(gcd +" " +lcm);
            System.out.println("");
        }
    }
    
}
