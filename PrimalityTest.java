import java.util.Scanner;
/**
 *
 * @author vishal
 */
class PrimalityTest {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i <=t ;i++)
        {
            int num = sc.nextInt();
            if(num > 2 && num %2 == 0)
            {
                System.out.println("no");
            }
            else
            {
            int j;
            for(j = 2; j <= num / 2; j++)
            {
                if(num % j == 0)
                {
                    System.out.println("no");
                    break;
                }
            }
         if(j > num / 2)
         {
             System.out.println("yes");
         }
    }
        }
}
}

