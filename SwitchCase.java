//Switch is keyword with accepts only int, char, string value.
//Case is a keyword which is used inside switch. case takes a value that should be same as switch type value.

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Switch case Program");

        int x=3;
        switch (x){
            case 1:
                System.out.println("Number is One");
                break;
            case 2:
                System.out.println("Number is Two");
                break;
            case 3:
                System.out.println("Number is three");
                break;
            default:
                System.out.println("Please the number between 1 to 3");
        }


    }
}
