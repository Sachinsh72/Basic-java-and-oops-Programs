package Static_and_NonStatic;

public class StaticKeyword {
    static int i=3;     //it can be access directly in main method
    int j=12;           // for this we have to create object

    public static void main(String[] args) {
        System.out.println(i);      //output : 3
       // System.out.println(j);  //error - java: non-static variable j cannot be referenced from a static context
    }
}
