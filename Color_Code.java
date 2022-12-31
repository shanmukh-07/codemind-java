import java.util.Scanner;
class Shan{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        char c=Character.toLowerCase(ch);
        if(c=='v'){
            System.out.print("Violet");
        }
        else if(c=='i'){
            System.out.print("Indigo");
        }
        else if(c=='b'){
            System.out.print("Blue");
        }
        else if(c=='g'){
            System.out.print("Green");
        }
        else if(c=='y'){
            System.out.print("Yellow");
        }
        else if(c=='o'){
            System.out.print("Orange");
        }
        else if(c=='r'){
            System.out.print("Red");
        }
        else{
            System.out.print("-1");
        }
    }
}