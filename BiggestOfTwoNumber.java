import java.util.Scanner;
public class BiggestOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        System.out.println("a = ");
        int a=sc.nextInt();
        System.out.println("b = ");
        int b=sc.nextInt();

        int r=a>b?a:b;         //ternary operator

        if(r==a){              //If-Else statement
            System.out.println("The biggest of a and b is a = "+a);
        }
        else {
            System.out.println("The biggest of a and b is b = "+b);
        }
    }
}
