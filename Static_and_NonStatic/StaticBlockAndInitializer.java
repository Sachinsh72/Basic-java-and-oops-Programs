package Static_and_NonStatic;

public class StaticBlockAndInitializer {
    static  int i = 20;
    static int j ;

    static {
        System.out.println("static block - 1");
        int j = 45;
        System.out.println(i+ " " +j);
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        System.out.println(i + " " +j);
    }

    static{
        i = 450;
        j = 66;
        System.out.println(i+" "+j);
        int j = 88;
        System.out.println(i+" "+j);
    }
}
