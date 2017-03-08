import java.util.Scanner;
/**
 *
 * @author vishal
 */
class ChefNWildcard {
 
    public static void main(String arg[])
    {
 Scanner sc = new Scanner(System.in);
 int t = sc.nextInt();
 for(int i = 1; i <= t; i++)
 {
     String a = sc.next();
     String b = sc.next();
     int len = a.length();
     int j;
     for(j = 0; j < len; j++)
     {
         if(a.charAt(j) != b.charAt(j) && a.charAt(j) != '?' && b.charAt(j) != '?')
         {
             break;
         }  
}
     if( j == len)
     {
         System.out.println("Yes");
     }
     else
     {
         System.out.println("No");
    }
}
    }
}