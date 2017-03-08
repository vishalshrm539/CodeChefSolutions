package codechef;

/**
 *
 * @author vishal
 */

import java.util.*;
class Atm
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
double balance;
int withdraw;
double b_charge=0.50;
withdraw=sc.nextInt();
balance=sc.nextDouble();
if(withdraw<=2000 && withdraw%5==0 && withdraw<balance+b_charge && balance<=2000)
{
balance=(balance-withdraw)-b_charge;
System.out.printf("%.2f",balance);
}
else
{
System.out.printf("%.2f",balance);
}
}
}      
 

    

