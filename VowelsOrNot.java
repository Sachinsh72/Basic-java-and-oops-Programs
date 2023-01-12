import java.util.Scanner;
public class VowelsOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch+" is Vowels ");
        }
        else {
            System.out.println(ch+" is constant");
        }
    }
}
