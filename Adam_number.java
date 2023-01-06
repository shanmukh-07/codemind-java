import java.util.Scanner;
class Shan{
	static int reverseDigits(int n){
		int rev=0;
		while(n>0){
			rev=rev*10+n%10;
			n/=10;
		}
		return rev;
	}
    static int sq(int n){
		return (n*n);
	}
	static boolean checkAdamNumber(int n)
	{
		int a=sq(n);
		int b=sq(reverseDigits(n));
		if (a==reverseDigits(b)){
		    return true;
		}
		else{
		return false;
		}
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (checkAdamNumber(n))
		System.out.println("True");
		else
		System.out.println("False");
	}
}