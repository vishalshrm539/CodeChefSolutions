import java.util.*;
/**
 *
 * @author vishal
 */
class CatsNDogs {
    
 public static void main(String arg[])
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input");
    long t = sc.nextLong();
    for(int i = 1; i <= t; i++)
    {
    long c = sc.nextLong();
    long d = sc.nextLong();
    long l = sc.nextLong();
    long max ;
    if(c <= d || c <= d*2)
    {
        max = (c+d) * 4;
        long min = d * 4;
        if(l <= max && l >= min )
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        
    }
    else
    {
        max = (c+d) * 4;
       long rem = c - (d*2) ;
        long min = (d * 4) + (rem * 4);
        if(l <= max && l >= min )
        {
            System.out.println("yes");
    }
        else
        {
            System.out.println("no");
}
    }
 }
}
}

