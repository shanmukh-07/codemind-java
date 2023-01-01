import java.util.Scanner;
class Shan{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        for(int i=0;i<t;i++){
            int a=Sc.nextInt();
            int f=1;
            for(int j=1;j<=a;j++){
                f=f*j;
            }
            System.out.println(f);
        }
    }
}