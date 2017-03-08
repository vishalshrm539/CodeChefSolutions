/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Vishal
 */
 class Download {

public static void main(String arg[])
{
    Scanner sc = new Scanner(System.in);
    long t = sc.nextLong();
    for(long i = 1; i <= t; i++)
    {
        long n = sc.nextLong();
        long k = sc.nextLong();
        long sum = 0;
        boolean free = true;
        for(long j = 1; j <= n; j++)
        {
            long T = sc.nextLong();
            long D = sc.nextLong();
            if(free == true)
            {
            if(T < k)
            {
                k = k - T;
            }
           else if(T > k)
            {
                T = T - k;
                k = 0;
            }
            else
            {
                k = 0;
                continue;
            }
            }
            if(k == 0)
            {
                free = false;
                sum += T * D;
            }
           
        }
        System.out.println(sum);
    }
}
}
