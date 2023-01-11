import java.sql.SQLOutput;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(n%2==0?"Even":"Odd");        //Conditional or ternary operator directly

        String r=n%2==0?"Even":"Odd";                   //Conditional or ternary operator store
        System.out.println(r);

        if(n%2==0){                                     //if-else
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
