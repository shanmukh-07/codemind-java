import java.util.Scanner;
public class Shan{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] l = new int[a];
        int cnt = 0;
        for(int i=0;i<a;i++){
            l[i] = sc.nextInt();
        }
        for(int i=0;i<l.length;i++){
            if (l[i]%b == 0){
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}