import java.util.*;

class LuckyFour {
    
 public static void main(String arg[])
 {
     Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 
    for(int i =1 ;i <= n; i++)
    {
        int count = 0;
       int input = sc.nextInt();
        String s = String.valueOf(input);
        int length = s.length();
        for(int j=0; j < length; j++)
        {
            if(s.charAt(j) == '4')
            {
                count++;
            }
        }
        System.out.println(count);
    }
 }
}
