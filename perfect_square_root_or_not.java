import java.util.Scanner;  
class Shan{  
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);  
        int n=sc.nextInt();   
        double x=Math.sqrt(n);
        if(x==(int)x){  
            System.out.println("True");
        }  
        else{  
            System.out.println("False");  
        }  
    }  
}  