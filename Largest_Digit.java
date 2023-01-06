import java.util.Scanner;  
class Shan{  
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);  
        int n=sc.nextInt();   
        int m=0,d;
        while(n>0){
            d=n%10;
            if(m<d){
                m=d;
            }
            n=n/10;
        }
        System.out.print(m);
    }
}