import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            System.out.println(a+b);
        }
    }
}