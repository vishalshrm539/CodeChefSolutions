import java.util.Scanner;
/**
 *
 * @author Vishal
 */
class CookieMilk {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
;        int t = sc.nextInt();
        for(int i = 1; i  <= t; i++)
        {
            int n = sc.nextInt();
            String a[] = new String[n+1];
            a[n] = "hello";
            for(int j = 0; j < n; j++)
            {
                a[j] = sc.next();
            }
            int k = 0;
            if(n == 1 && a[0].equals("cookie"))
            {
                //System.out.println("traversed");
                System.out.println("NO");
                
            }
            else if(a[n-1].equals("cookie"))
            {
                System.out.println("NO");
              
            }
                else
            {
            for( k = 0; k < n; k++)
            {
                if(a[k].equals(a[k+1]) && a[k].equals("cookie"))
                {
                    break;
                }
            }
            if(k < n - 1)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
            }
        }
    }
    
}
