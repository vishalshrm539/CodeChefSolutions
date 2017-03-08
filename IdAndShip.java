import java.util.Scanner;
/**
 *
 * @author vishal
 */
class IdAndShip {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i <= t; i++)
        {
            String str = sc.next();
            if(str.charAt(0) == 'b' || str.charAt(0) == 'B')
            {
                System.out.println("BattleShip");
            }
            else if(str.charAt(0) == 'c' || str.charAt(0) == 'C')
            {
                System.out.println("Cruiser");
            }
            else if(str.charAt(0) == 'd' || str.charAt(0) == 'D')
            {
                System.out.println("Destroyer");
            }
            else
            {
                System.out.println("Frigate");
            }
        }
    }
    
}
