import java.util.*;
class Solution
{
    public static int pal(int n)
    {
        int rev=0,temp=n;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        if(rev==temp)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(pal(a[i])==1)
            {
                c++;
            }
        }
        System.out.println(c);
        
    }
}