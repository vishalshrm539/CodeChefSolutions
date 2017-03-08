import java.util.Scanner;

/**
 *
 * @author vishal
 */
 class Palindrome {
     public static void main(String arg[])
     {
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i <= t; i++)
         {
             long a = sc.nextLong();
             long b = sc.nextLong();
             long sum = 0;
             for(long j = a; j <= b; j++)
             {
                 String str = String.valueOf(j);
                 StringBuilder sb = new StringBuilder(str);
                 StringBuilder sbr = sb.reverse();
                 String rev = String.valueOf(sbr);
                 //sb.append(str);
                 //sbr = sb.reverse();
                 if(str.equals(rev))
                 {
                     sum += j;
                 }
             }
                System.out.println(sum);     
         }
     }
    
}
