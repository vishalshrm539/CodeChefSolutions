package codechef;
import java.util.*;

public class RandomNumber {
public static void main(String arg[])
{
    Random rand = new Random();
   int value = rand.nextInt(50);
   System.out.println(value);
}
}
