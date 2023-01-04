import java.util.Scanner;
class Shan{    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0,n2=1,s=0;
        while (n>s){
            s=n1+n2;
            n1=n2;
            n2=s;
        }
        if(s==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }   
}