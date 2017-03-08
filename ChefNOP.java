import java.util.Scanner;
/**
 *
 * @author vishal
 */
class ChefNOP {
    public static void main(String arg[])
    {
        
          Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i <=t; i++)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if( a > b)
            {
                System.out.println(">");
            }
            else if(a < b)
            {
                System.out.println("<");
            }
            else
            {
                System.out.println("=");
            }
  
        }
}
}