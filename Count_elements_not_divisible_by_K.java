import java.util.Scanner;
public class Shanmukh{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int c = 0;
        for(int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
            if (arr[i]%k != 0){
                c += 1;
            }
        }
        System.out.println(c);
    }
}