import java.util.Scanner;
class SumOfDigits {

public static void main(String arg[])
{
    Scanner sc = new Scanner(System.in);
    long t = sc.nextLong();
    for(long i=1; i <= t; i++)
    {
 long num = sc.nextLong();
 long digit;
 long sum = 0;
 while(num > 0)
 {
    digit = num % 10;
    sum += digit;
    num /= 10;
 }
 System.out.println(sum);
}
}
}
