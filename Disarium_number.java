import java.util.Scanner;
class Shan{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n,d=0,sum=0;
        String s=Integer.toString(n);  
        int len=s.length();  
        while(c>0){
            d=c%10;  
            sum=sum+(int)Math.pow(d,len);
            len--;
            c=c/10;
        }
        if(sum==n)
            System.out.println("True");
        else
            System.out.println("False");
    }
}