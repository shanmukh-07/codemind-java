import java.util.Scanner;
class Shan
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double s=0;
        for(int i=1;i<=a;i++)
        {
            s=1.0/i+s;
        }
        System.out.format("%.2f",s);
    }
}