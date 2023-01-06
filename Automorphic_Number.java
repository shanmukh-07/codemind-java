import java.util.Scanner;
class Shan{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a=Integer.toString(n);
        int l=a.length();
        int s=n*n;
        int last=s%(int)Math.pow(10,l);
        if (last==n){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not an Automorphic Number");
        }
    }
}