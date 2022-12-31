import java.util.Scanner;
class Shan{
public static void main(String args[]){
Scanner Sc=new Scanner(System.in);
int a=Sc.nextInt();
int s=0;
int prod=1;
int p=0;
while(a>0){
p=a%10;
prod=prod*p;
s=s+p;
a=a/10;
}
System.out.println(prod-s);
}
}