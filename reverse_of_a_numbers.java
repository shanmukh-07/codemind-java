import java.util.Scanner;
class Rev123
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int a=Sc.nextInt();
int r=0;
int p=0;
while (a>0)
{
p=a%10;
r=(r*10)+p;
a=a/10;
}
System.out.println(r);
}
}