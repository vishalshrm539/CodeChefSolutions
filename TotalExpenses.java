import java.util.Scanner;
/**
 *
 * @author vishal
 */
class TotalExpenses {
    
      public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i <=t; i++)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            double expenses;
            if(a > 1000)
            {
               double expenses_withoutdiscount = a * b;
                expenses = expenses_withoutdiscount * 0.9;
            }
            else
            {
                expenses = a * b;
            }
    System.out.printf("%.6f",expenses);
    System.out.println("");
   // tem.out.printf("%.2f",balance);
    
}
    }
}