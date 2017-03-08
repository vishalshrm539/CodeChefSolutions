package codechef;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        int same, count=0,k,l;
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<m;j++)
                {
                a[i][j] = sc.nextInt();
            }
        }
        for(k =0;k<n;k++)
            {
            same = 0;
            for(l=0;l<m;l++)
                {
                if(a[k][l] == a[k+1][l])
                    {
                    same++;
                    if(same >= n/2)
                        {
                        break;
                    }
                    if(same == m)
                        {
                        System.out.println(same);
                    }
                }
                if(l == m)
                    {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
}
