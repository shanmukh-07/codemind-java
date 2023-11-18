import java.util.Scanner;
import java.lang.Math;
public class Shanmukh{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int a = n/2;
        int s1 = 0;
        int s2 = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<(arr.length/2);i++){
            s1 += arr[i];
        }
        for(int i = a;i<arr.length;i++){
            s2 += arr[i];
        }
        int ab = Math.abs(s1-s2);
        if (ab%4 == 0){
            System.out.println("X");
        }
        else{
            System.out.println("Y");
        }
    }
}