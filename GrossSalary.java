import java.util.Scanner;
/**
 *
 * @author vishal
 */
public class GrossSalary {
    
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double HRA, DA;
        for(int i=1; i <= t; i++)
        {
            long salary = sc.nextLong();
            if(salary < 1500)
            {
                HRA = 0.1 * salary;
                DA = 0.9 * salary;
        }
            else
            {
                HRA = 500;
                DA = 0.98 * salary;
            }
            double gs = salary + HRA + DA;
            if(gs % 10 == 0)
            {
                int res = (int)gs;
                System.out.print(gs);
                return;
            }
            System.out.printf("%.1f",gs);
            System.out.println("");
}
    }
}