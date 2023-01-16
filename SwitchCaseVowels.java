import java.util.Scanner;
public class SwitchCaseVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the small alphabet");
        char ch=sc.next().charAt(0);

        switch (ch){
            case 'a':
                System.out.println("Vowels");
                break;

            case 'e':
                System.out.println("Vowels");
                break;
            case 'o':
                System.out.println("Vowels");
                break;
            case 'u':
                System.out.println("Vowels");
                break;
            case 'i':
                System.out.println("Vowels");
                break;
            default:
                System.out.println(" Constant");

        }

        //or

        System.out.println("Enter the any alphabet");
        char x=sc.next().charAt(0);

        switch (x){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Vowels");
                break;
            default:
                System.out.println("Constant");


        }
    }
}
