public class RecursionMethodCall {

    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        System.out.println(sum(sum(sum(sum(20,30),40),50),60));
    }

    //method call is only possible if - method will be parametrized and have return type.
}
