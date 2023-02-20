package fruit;

public class fruitDriver {

//    public static void main(String[] args) {
//        fruit f1 = new fruit();
//        f1.setValue("Apple",120,3.4);
//    }

    public static void main(String[] args) {
        fruit f1 = new fruit();
        f1.name = "mango";
        f1.price = 120;
        f1.weight = 3.4;
        System.out.println("Fruit name is : " + f1.name);
        System.out.println("Price of fruit is : " + f1.price);
        System.out.println("Weight is : " +f1.weight);
        f1.test();
    }
}
