package Static_and_NonStatic;

public class StaticMethod {

    static int i = 12;
    static int j = 15;

    public static void main(String[] args) {
        System.out.println("main method :" + i + " " +j);
        System.out.println(i + " " +j);
        i = 23;
        System.out.println(i + " " + j);
        text();
        System.out.println(i + " " + j);
    }

    public static void text(){
        System.out.println("Test method :" +i+" "+j);
        i=66;
        int j=45;
        System.out.println(i + " " + j);
        i = 60;
    }
}
