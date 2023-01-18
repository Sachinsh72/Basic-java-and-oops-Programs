public class NoArgumentMethod {
    public static void test(){
        System.out.println("Test method begins");
        System.out.println("Inside test method");
        demo();
        System.out.println("Test method ends");
    }
    public static void main(String[] args) {
        System.out.println("Main method begins");
        test();
        System.out.println("Main method ends");
        demo();
    }

    public static void demo(){
        System.out.println("This is Demo method");
    }
}
