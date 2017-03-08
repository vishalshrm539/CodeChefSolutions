import java.util.*;
/**
 *
 * @author vishal
 */
class ChefAndRemissness {

public static void main(String arg[])
{
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 1; i <= t; i++)
    {
        int a = sc.nextInt();
        int b = sc.nextInt();
       int min = Math.max(a , b);
       int max = a + b;
        System.out.println(min +" " +max);
    }
    
}
}
