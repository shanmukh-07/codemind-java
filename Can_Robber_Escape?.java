import java.util.Scanner;
class Shan{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        int []b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            if(b[i]%2==1){
                c++;
            }
        }
        if(c>2){
            System.out.print("NO");
        }
        else{
            System.out.print("YES");
        }
    }
}