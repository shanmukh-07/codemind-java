import java.util.Scanner;
class Fahrenheit_to_Celsius
{
    public static void main(String args[])
    {
        Scanner z=new Scanner(System.in);
        float a=z.nextFloat();
        float b=(a-32)*5/(9);
        System.out.format("%.2f",b);
    }
}