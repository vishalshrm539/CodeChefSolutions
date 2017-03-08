import java.util.*;
/**
 *
 * @author vishal
 */
 class FindRemainder {
    
public static void main(String arg[])
{
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 1; i <=t; i++)
    {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a % b);
    }
}
}
