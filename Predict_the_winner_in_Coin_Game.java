import java.util.Scanner;
class Predict
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a%2==0||b%2==0)
        System.out.println("Player 1");
        else
        System.out.println("Player 2");
    }
}