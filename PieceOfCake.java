import java.util.Scanner;
/**
 *
 * @author vishal
 */
class PieceOfCake {
    
      public static void main(String arg[])
    {
 Scanner sc = new Scanner(System.in);
 int t = sc.nextInt();
 for(int i = 1; i <= t; i++)
 {
     String a = sc.next();
     int len = a.length();
     int j , k;
     for(j = 0; j < len-1; j++)
     {
        int count = 1;
         for(k = j+1; k < len; k++)
         {
             if(a.charAt(j) == a.charAt(k))
             {
                 count++;
             }
         }
         int rem = len - count;
         if(count == rem)
         {
             System.out.println("YES");
             break;
         }
     }
 if(j == len-1)
 {
     System.out.println("NO");
 }
}
    }
}