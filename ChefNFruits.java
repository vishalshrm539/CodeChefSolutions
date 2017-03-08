
import java.util.Scanner;

/**
 *
 * @author vishal
 */
 class ChefNFruits {
    
    
  public static void main(String arg[])
    {
 Scanner sc = new Scanner(System.in);
 int t = sc.nextInt();
 for(int i = 1; i <= t; i++)
 {
     int A = sc.nextInt();
     int O = sc.nextInt();
     int G = sc.nextInt();
     int diff = Math.abs(A - O);
     if(diff == G)
     {
         System.out.println("0");
     }
     else
     {
         if(diff < G)
         {
             System.out.println("0");
         }
         else
         {
         int optimized_diff = Math.abs(diff - G);
         System.out.println(optimized_diff);
     }
     }
}
    }
 }