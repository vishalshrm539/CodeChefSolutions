import java.util.Scanner;

/**
 *
 * @author vishal
 */
class Mahasena {
    
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n];
            int odd = 0;
            int even = 0;
            for(int j = 0; j < n; j++)
            {
                a[j] = sc.nextInt();
                if(a[j] % 2 == 0)
                {
                    even++;
            }
                else
                {
                    odd++;
        }
    }
            if(even > odd)
            {
                System.out.println("READY FOR BATTLE");
            }
            else
            {
                System.out.println("NOT READY");
            }
    }
}
