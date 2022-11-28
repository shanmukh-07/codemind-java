import java.util.Scanner;
import java.lang.Math;
class Shan
{
    public static void main(String args[])
    {
        Scanner sh=new Scanner(System.in);
        double x=sh.nextInt();
        double y=sh.nextInt();
        double z=sh.nextInt();
        double s=(x+y+z)/2;
        double ar=Math.sqrt(s*(s-x)*(s-y)*(s-z));
        System.out.format("%.2f",ar);
    }
}