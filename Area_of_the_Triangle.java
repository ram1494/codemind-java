import java.util.*;
class Tri
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c,s;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        double ar;
        s=(a+b+c)/2;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",ar);
    }
}