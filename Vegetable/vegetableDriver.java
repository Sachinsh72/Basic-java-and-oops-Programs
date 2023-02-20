package Vegetable;

public class vegetableDriver {
    public static void main(String[] args) {
        vegetable v1=new vegetable();
        v1.setValue("Potato",50,1.5);

        System.out.println("Name is : "+v1.name);
        System.out.println("Price is : "+v1.price);
        System.out.println("Weight is : "+v1.weight);
    }
}
