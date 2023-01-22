import java.sql.SQLOutput;

public class RecursionInsideMethod {
    static int count =0;

    public static void main(String[] args) {
        System.out.println("This is main method");
        test();
    }

    public static void test(){
        System.out.println(count);
        if(count<100){
            System.out.println("Test method start");
            count++;
            System.out.println(count);
            test();
        }
        System.out.println("Recursion will stop now");
    }
}
