import java.util.*;
class Puke
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int s=0;
        while(n!=0)
        {
            int d=n%10;
            s=s*10+d;
            n=n/10;
        }
        if(m==s)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
    
}