import java.util.Scanner;
public class DivisibleBy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        //ternary operator
        System.out.println(n%5==0&&n%11==0?"Divisible by 5 & 11":"Not divisible by 5 & 11");

        // with simple storing above same code
        int a=n%5;
        int b=n%11;
        String p=a==0&&b==0?"Divisible by 5 & 11":"Not divisible by 5 & 11";
        System.out.println(p);

    }
}
