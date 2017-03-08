
import java.util.*;
class TheLeadGame {

public static void main(String arg[])
{
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int a[] = new int[t];
    int b[] = new int[t];
    for(int i=0;i<t;i++)
    {
        a[i] = sc.nextInt();
        b[i] = sc.nextInt();
    }
    
    int max = 0;
    int player = 0;
    for(int k = 0; k<t ;k++)
    {
        int lead = Math.abs(a[k] - b[k]);
                if(lead > max)
        {
            max = lead;
            if(a[k] > b[k])
        {
            player = 1;
        }
        else
        {
            player = 2;
        }
        }
    }
    System.out.println(player +" " +max);
}
}
