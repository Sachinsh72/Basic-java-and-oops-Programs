import java.util.Scanner;
public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Alphabet");
        char ch=sc.next().charAt(0);
        int n=ch;

        String r=(n>=65&&n<=90)||(n>=97&&n<=122)?"Alphabet":"Not Alphabet";
        System.out.println(r);
    }
}
