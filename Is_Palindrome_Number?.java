import java.util.*;
class Solution
{
    private static int pal(int n)
    {
        int rev=0,temp=n;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        if(temp==rev)
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
        if(pal(n)==1)
        {
            System.out.println(2);
        }
        else
        {
            System.out.println(1);
        }
    }
}