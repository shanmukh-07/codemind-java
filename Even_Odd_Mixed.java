import java.util.Scanner;
class Shan{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a=Integer.toString(n);
        int l=a.length();
        int e=0;
        int o=0;
        int p=0;
        while (n>0){
	        p=n%10;
	        if (p%2==0){
		        e+=1;
	        }
	        else{
		        o+=1;
	        }
	        n=n/10;
        }
        if (e==l){
	        System.out.println("Even");
        }
        else if(o==l){
	        System.out.println("Odd");
        }
        else{
	        System.out.println("Mixed");
        }
    }
}