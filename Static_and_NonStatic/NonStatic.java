package Static_and_NonStatic;

public class NonStatic {

    {
        System.out.println("this is non-static block 1");
    }

    public static void main(String[] args) {
        NonStatic ns = new NonStatic();
        System.out.println("main method");
//        NonStatic ns1 = new NonStatic();
    }

    {
        System.out.println("this is non-static block 2");
    }
}
