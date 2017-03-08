import java.util.Scanner;
/**
 *
 * @author vishal
 */
class TheBlockGame {
    public static void main(String arg[])
    {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i = 1; i <= n; i++)
{
   /* String str = sc.next();
    StringBuilder strb = new StringBuilder(str);
    StringBuilder strrev = strb.reverse();
   // System.out.println(strrev);
    if(strb.toString().equals(strrev.toString()))
    {
        System.out.println("wins");
    }
    else
    {
        System.out.println("losses");
    }
}*/
    String str = sc.next();
    int len = str.length();
    int k = len-1;
    int j;
    for(j = 0; j < len; j++)
    {
        if(str.charAt(j) != str.charAt(k))
        {
            break;
        }
        else
        {
       k--;
    }
    }
    if(j > k)
    {
        System.out.println("wins");
    }
    else
    {
        System.out.println("losses");
    }
    }
    }
}
