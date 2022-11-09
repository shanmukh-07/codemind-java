import java.util.Scanner;
import java.lang.Math;
class Area10
{
    public static void main(String args[])
    {
        double a,b,c,d,area;
        Scanner Sc=new Scanner(System.in);
        a=Sc.nextInt();
        b=Sc.nextInt();
        c=Sc.nextInt();
        d=(a+b+c)/2;
        area=Math.sqrt((d)*(d-a)*(d-b)*(d-c));
        System.out.format("%.2f",area);
        Sc.close();
    }
}