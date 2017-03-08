import java.util.*;
class SecondLargest {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(long i = 1; i <= n; i++)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            if(a > b && a < c || a < b && a > c)
            {
                System.out.println(a);
            }
            else if(b > a && b < c || b > c && b < a)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }
                
    }
}
