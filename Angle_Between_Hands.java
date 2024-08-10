import java.util.Scanner;
public class shanmukh{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int hr = Integer.parseInt(s.substring(0,2));
        int mn = Integer.parseInt(s.substring(3));
        double mn_ang = 6*mn;
        double hr_ang = 30*hr + 0.5*mn;
        double ang = Math.abs(mn_ang-hr_ang);
        System.out.println(Math.min(ang,360-ang));
    }
}