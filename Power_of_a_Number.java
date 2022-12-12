import java.lang.Math;
import java.util.Scanner;
class Shan
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int p=(int)Math.pow(a,b);
        int d=p%c;
        System.out.print(d);
    }
}