import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for (int i=1;i<=b;i++)
        {
            if(i%2!=0)
            System.out.println(a+" x "+i+" = "+a*i);
        }
    }
}