public class Returnfactorial {
    public static void main(String[] args) {
        int n=123;
        int rem=0;
        while(n>0){
            rem=n%10;
            System.out.println(rem + "!="+findfactorial(rem));
            n=n/10;
        }
    }

    public static int findfactorial(int n){
        int fact=1;
        while(n>0){
            fact=fact*n;
            n--;
        }
        return fact;
    }

}
