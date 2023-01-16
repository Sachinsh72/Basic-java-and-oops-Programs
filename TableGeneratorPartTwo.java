import java.util.Scanner;
public class TableGeneratorPartTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the table number from where to start");
        int a=sc.nextInt();
        System.out.println("Enter the last table number");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println("=======");
        }
    }
}
