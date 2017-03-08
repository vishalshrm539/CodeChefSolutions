import java.util.Scanner;
/**
 *
 * @author vishal
 */
class GradeTheSteel {
  
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++)
        {
            int hardness = sc.nextInt();
            double carbon = sc.nextDouble();
            int strength = sc.nextInt();
            if(hardness > 50 && carbon < 0.7 && strength > 5600)
            {
                System.out.println("10");
            }
            else if(hardness > 50 && carbon < 0.7)
            {
                System.out.println("9");
            }
            else if(carbon < 0.7 && strength > 5600)
            {
                System.out.println("8");
            
        }
            else if(hardness > 50 && strength > 5600)
            {
                System.out.println("7");
    }
            else if(hardness > 50 || carbon < 0.7 || strength > 5600)
            {
                System.out.println("6");
            }
            else
            {
                System.out.println("5");
            }
        }
    }
}