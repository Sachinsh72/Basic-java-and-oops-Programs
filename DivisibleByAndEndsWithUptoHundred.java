import java.util.Scanner;
public class DivisibleByAndEndsWithUptoHundred {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int i=sc.nextInt();
        while(i<=100){
            if(i%7==0&&i%10==7){
                System.out.println(i);
            }
            i++;
        }
    }
}
