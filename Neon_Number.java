import java.util.Scanner;
class Neon
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int a=Sc.nextInt();
int b=a*a;
int p=0;
int sum=0;
while (b>0)
{
p=b%10;
b=b/10;
sum=sum+p;
}
if (sum==a)
System.out.println("Neon Number");
else
System.out.println("Not Neon Number");
}
}