import java.util.Scanner;
class Shan
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=a*b*c*1024;
        System.out.println(d);
    }
}