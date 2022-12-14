import java.util.Scanner;
class ijk14{
public static void main(String args[]){
Scanner Sc=new Scanner(System.in);
int a=Sc.nextInt();
int b=Sc.nextInt();
int c=Sc.nextInt();
int s=0;
for (int i=a;i<=b;i++)
if ((i%c==0))
s+=1;
System.out.println(s);
}
}