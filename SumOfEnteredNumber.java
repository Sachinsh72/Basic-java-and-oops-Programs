import java.util.Scanner;
public class SumOfEnteredNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        int sum=0;
        do{
            sum=sum+n;
            System.out.println("Enter the number");
            n=sc.nextInt();
        }while (n>0);
        System.out.println(sum);
    }
}
