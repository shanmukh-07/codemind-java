import java.util.Scanner;
public class Shanmukh{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = 0;
        int p = 1;
        int m = 0;
        while (a>0){
            m = a%10;
            s += m;
            p *= m;
            a /= 10;
        }
        if (s == p){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
    }
}