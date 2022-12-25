import java.util.Scanner;
class Rev
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
String s=Sc.nextLine();
String r="";
int l=s.length();
for(int i =l-1;i>=0;i--)
{
r=r+s.charAt(i);
}
System.out.println(r);
}
}