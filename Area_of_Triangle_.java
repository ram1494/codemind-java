import java.util.*;
class ar
{
    public static void main(String args [])
    {
        Scanner sc= new Scanner(System.in);
        float a,b,c;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        double s,ar;
        s=(a+b+c)/2;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",ar);
    }
}