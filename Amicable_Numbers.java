import java.util.Scanner;
class Shan{
	public static void main(String args[]){
		Scanner Sc=new Scanner(System.in);
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		int pfa=0;
		int pfb=0;
		for (int i=1;i<a;i++){
			if (a%i==0){
				pfa+=i;
			}
		}
		for (int i=1;i<b;i++){
			if (b%i==0){
				pfb+=i;
			}
		}
		if (pfa==b && pfb==a){
		    System.out.println("Amicable");
		}
		else{
		    System.out.println("Not Amicable");
		}
	}
}