import java.util.Scanner;
class Diagonal
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=a*(a-3)/2;
        System.out.print(b);
    }
}