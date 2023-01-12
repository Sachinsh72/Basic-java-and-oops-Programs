import java.util.Scanner;
public class TrinagleOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the all sides of triangle a,b,c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println(a+b>c && b+c>a && c+a>b?"a,b,c, is a triangle":"a,b,c is not a triangle");

    }
}
