import java.util.Scanner;
class Shan{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>12){
            System.out.print("-1");
        }
        else if(n==4||n==5||n==6){
            System.out.print("Summer");
        }
        else if(n==7||n==8||n==9||n==10){
            System.out.print("Rainy");
        }
        else if(n==11||n==12||n==1){
            System.out.print("Winter");
        }
        else{
            System.out.print("Spring");
        }
    }
}