public class RecursionReturnStatement {
    public static void main(String[] args) {
        System.out.println(print(3));
    }

    public static String print(int n){
        if(n>1){
            return n +" "+print(n-1);
        }
        else{
            return 1+" ";
        }
    }
}
