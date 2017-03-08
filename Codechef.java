//package codechef;
import java.util.*;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int result = 0;
        for(int i=1;i<=t;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a != 0 && b !=0)
            {
            result = result ^ (a ^ b);
        }
        System.out.println(result);
    }
    }
}
