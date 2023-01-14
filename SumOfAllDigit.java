import java.util.Scanner;
public class SumOfAllDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit");
        int digit=sc.nextInt();
        int sum=0;
        while(digit>0){
            int rem=digit%10;
            sum=sum+rem;
            digit=digit/10;
        }
        System.out.println("The sum of digit is "+sum);
    }
}
