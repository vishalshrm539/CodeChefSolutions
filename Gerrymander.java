import java.util.Scanner;
 class Gerrymander {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
      //  System.out.println(t);
       
        int win1 = 0, win0 = 0;
        for(int test = 1; test <= t; test++)
        {
            
             int i = 0;
            int o1 = sc.nextInt();
            int o2 = sc.nextInt();
            int N = o1 * o2;
            
            boolean part = false;
            int a[] = new int[N+1];
            for(i = 0; i < N; i++)
            {
                a[i] = sc.nextInt();
            }
            a[N] = 5;
            if(o2 == 1 || o1 == 1)
            {
             for(int p = 0; p < N; p++)
            {
                if(a[p] == 1)
                {
                    win1++;
                }
                else
                {
                    win0++;
                }
            }
             if(win1 > win0)
             {
                 System.out.println("1");
                 
             }
             else
             {
                 System.out.println("0");
                 
             }
            }
            
            else
            {
             //   System.out.println("traversed");
            int dis0 = 0, dis1 = 0;
            win1 = 0;
            win0 = 0;
            int left = 0;
            int temp = o2;
            int l = 1000000000;
            int j = 0;
            
            for(int k = 0; k < N; k++)
            {

                o2 = temp;
                if(a[k] != a[k+1] || part == true)
                {
                    if(part == false)
                    {
                        left = k;
                    }
                    dis1 = 0;
                    dis0 = 0;
                    part = true;
                    for(j = k; j < k + o2 && j < l  ; j++)
                    {
                       
                        if(j == N)
                        {
                       //     j = 0;
                            if(j == left)
                            {
                                break;
                            }
                            l = left;
                            N = left;
                          int m = j - k;
                          k = o2 - m - 1 ;
                          o2 = 1;
                          j = 0;
                        }
                     if(a[j] == 1)
                    {
                     dis1++;   
                    }
                    if(a[j] == 0)
                    {
                        dis0++;
                    }
                    
                    
                    }
              
                if(dis1 > dis0)
                {
                    win1++;
                }
                else
                {
                    win0++;
                }
                k = k + o2 - 1;
                
                }
                
            }
            if(win1 > win0)
            {
            System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }
        }
        }
    }
    
}
