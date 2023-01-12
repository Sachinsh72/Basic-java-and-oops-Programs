import java.util.Scanner;
public class BiggestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the all three number");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is biggest of three number");
        }
        else if(b>c && b>a){
            System.out.println(b+" is biggest of three number");
        }
        else{
            System.out.println(c+" is a biggest of three number");
        }
    }
}
