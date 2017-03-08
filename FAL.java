import java.util.*;
class FAL
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
long n = sc.nextLong();
for(long i =1; i <= n; i++)
{
long num = sc.nextLong();
long first = num % 10;
String str = String.valueOf(num);
int len = str.length();
for(int j =1; j<len ;j++)
{
    num = num / 10;
}
System.out.println(first + num);
}
}
} 