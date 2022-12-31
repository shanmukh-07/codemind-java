import java.util.Scanner;
class Shan{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n==1||n==2){
            System.out.format("%d",n-1);
        }
        else{
            System.out.println("2");
        }
    }
}