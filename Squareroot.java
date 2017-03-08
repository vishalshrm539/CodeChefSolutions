import java.util.*;
/**
 *
 * @author vishal
 */
class Squareroot {

public static void main(String arg[])
{
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 1; i <= t; i++ )
    {
        int input = sc.nextInt();
        int result = (int)Math.sqrt(input);
        System.out.println(result);
    }
}
}
