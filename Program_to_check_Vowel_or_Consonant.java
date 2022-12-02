import java.util.Scanner;
class Shan
{
    public static void main(String args[])
    {
        char s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine().charAt(0);
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'||s=='I'||s=='O'||s=='U')
        System.out.print("Vowel");
        else
        System.out.print("Consonant");
        sc.close();
    }
}