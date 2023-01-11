import java.util.Scanner;
public class EndWithThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        if(n%10==3){
            System.out.println("Last digit is 3");
        }
        else{
            System.out.println("Not ends with 3");
        }
    }
}
