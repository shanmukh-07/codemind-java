import java.util.Scanner;
class Grade
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int a =Sc.nextInt();
int b=Sc.nextInt();
int c=Sc.nextInt();
if(a>50 & b>60 & c>100)
System.out.println("10");
else if(a>50 & b>60)
System.out.println("9");
else if(b>60 & c>100)
System.out.println("8");
else if(a>50 & c>100)
System.out.println("7");
else if(a>50 | b>60 | c>100)
System.out.println("6");
else
System.out.println("5");
}
}