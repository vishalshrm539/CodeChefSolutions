import java.util.Scanner;
/**
 *
 * @author vishal
 */
class TanuHead {
    
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i <= t ; i++)
        {
          int n = sc.nextInt();
          String str = sc.next();
          int j;
          for(j=0; j <n ; j++)
          {
              if(str.charAt(j) == 'I')
              {
                  System.out.println("INDIAN");
                  break;
              }
              else if(str.charAt(j) == 'Y')
              {
                  System.out.println("NOT INDIAN");
                  break;
              }
          }
          if(j == n)
          {
              System.out.println("NOT SURE");
          }
    }
}
}