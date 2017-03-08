package codechef;
import java.math.BigInteger;
import java.util.*;
class factorial {
    public static void main(String arg[])
    {
        int i;
        BigInteger fact = BigInteger.valueOf(1);
  int number=100;//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fact=fact.multiply(BigInteger.valueOf(i));    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);
     /*   Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for(int i=1;i<=t;i++)
        {
            long n = sc.nextLong();
            long div = 5;
            long sum = 0;
            long d=5;
            while(d >= 1)
            {
          d = n / div;
           div = div * 5;
           sum += d;
            }
            System.out.println(sum);
        }
    //int n= 3;
    //int count = 0;
    /*for(int i=1;i<=n;i++)
    {
        if(n % i == 0)
        {
            count++;
        }
    }*/
    
//    System.out.println(fact(100));
}
   /*static long fact(long n)
    {
        if(n == 0)
        {
            return 1;
            
        }
        else
        {
        return(n * fact(n-1)); 
}
    }*/
       
   
  
}