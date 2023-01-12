import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year");
        int y= sc.nextInt();
        if(y%100!=0 && y%400==0||y%4==0){
            System.out.println("Year is leap year");
        }
        else{
            System.out.println("This is not leap year");
        }
    }
}
