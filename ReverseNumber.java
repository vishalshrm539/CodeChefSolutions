import java.util.*;
/**
 *
 * @author vishal
 */
 class ReverseNumber {
    
   public static void main(String arg[])
   {
       Scanner sc = new Scanner(System.in);
       long n = sc.nextLong();
       for(long i = 1; i <= n; i++)
       {
           long num = sc.nextLong();
           String str = String.valueOf(num);
           String rev = "";
           int len = str.length();
           for(int j =len-1;j >= 0; j--)
           {
           rev = rev + str.charAt(j);
       }
           int revnum = Integer.valueOf(rev);
           System.out.println(revnum);
   }
}
}