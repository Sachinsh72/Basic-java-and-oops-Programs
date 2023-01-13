import java.util.Scanner;
public class EvenUptoHundred {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the initial number");
        int i=sc.nextInt();
        while (i<=100){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
