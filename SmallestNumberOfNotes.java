import java.util.*;
/**
 *
 * @author vishal
 */
class SmallestNumberOfNotes {

public static void main(String arg[])
{
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 1; i <=t; i++)
    {
        int count = 0;
        int amount = sc.nextInt();
       int hundred = amount / 100;
       amount = amount - (hundred * 100);
       count += hundred;
       if(amount != 0)
       {
           int fifty = amount / 50;
           amount = amount - (fifty * 50);
           count += fifty;
           if(amount != 0)
           {
               int ten = amount / 10;
               amount = amount - (ten * 10);
               count += ten;
               if(amount != 0)
               {
                   int five = amount / 5;
                   amount = amount - (five * 5);
                   count += five;
                   if(amount != 0)
                   {
                       int two = amount / 2;
                       amount = amount - (two * 2);
                       count += two;
                       if(amount != 0)
                       {
                           int one = amount / 1;
                           count += one;
                       }
                   }
               }
           }
           
       }
       System.out.println(count);
    }
    }
}
