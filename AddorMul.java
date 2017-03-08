import java.util.*;
/**
 *
 * @author Vishal
 */
 class AddorMul {
    public static void main(String arg[])
    {
Scanner sc = new Scanner(System.in);
long t = sc.nextLong();
for(int i = 1; i <= t; i++)
{
    int n = sc.nextInt();
    String str = sc.next();
    long a[] = new long[n];
    for(int j = 0; j < n; j++)
    {
        a[j] = sc.nextLong();
    }
    if(t == 1)
    {
        if(a[0] % 2 == 0)
        {
            
        System.out.println("chef");
        return;
        }
        System.out.println("chefu");
        return;
    }
    
    if(t % 2 == 0)
    {
        
    }
    
}
    }
    
}
