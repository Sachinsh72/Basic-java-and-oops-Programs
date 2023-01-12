import java.util.Scanner;
public class InputGreaterAndEndsWith {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        if(n>200){
            if(n%10==3){
                System.out.println("Greater than 200 and ends with 3");
            }
            else{
                System.out.println("Greater than 200 but not ends with 3");
            }
        }
        else {
            System.out.println("Not greater than 200");
        }
    }
}
