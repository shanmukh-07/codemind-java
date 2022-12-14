import java.util.Scanner;
class Celsius_to_Fahrenheit
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        float a=s.nextInt();
        float b=(a*9)/5+(32);
        System.out.format("%.2f",b);
    }
}