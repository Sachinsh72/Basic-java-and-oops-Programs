import java.util.Scanner;
public class CountNumberOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println("The total digit of number is " +count);
    }
}
