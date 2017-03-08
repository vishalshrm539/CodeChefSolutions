
import java.util.Scanner;

/**
 *
 * @author vishal
 */
 class ChefNTwoStrings {
  
  public static void main(String arg[])
    {
 Scanner sc = new Scanner(System.in);
 int t = sc.nextInt();
 for(int i = 1; i <= t; i++)
 {
     String a = sc.next();
     String b = sc.next();
     int len = a.length();
     int minimal = 0, maximal = 0;
     for(int j = 0; j < len; j++)
     {
         if(a.charAt(j) != b.charAt(j) && a.charAt(j) != '?' && b.charAt(j) != '?')
         {
             minimal++;
         }
         if(a.charAt(j) != b.charAt(j) || a.charAt(j) == '?' && b.charAt(j) == '?')
         {
             maximal++;
         }
     }
     System.out.println(minimal +" " +maximal);
    
}
    }
 }