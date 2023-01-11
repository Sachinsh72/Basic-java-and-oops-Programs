import java.util.Scanner;
public class LastThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Last three digit
        System.out.println("Enter the Digit");
        int digit=sc.nextInt();

        int num=digit%1000;
            System.out.println("last three digit is " +num);


    }
}
