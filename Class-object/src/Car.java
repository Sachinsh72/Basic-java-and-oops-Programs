public class Car {
    String name;
    int price;
    String color;
    public void run(){
        System.out.println("Car is running");
    }

    public void accelerate()
    {
        System.out.println("Car is accelerating");
    }

    public static void main(String[] agr){
        Car c1 =new Car();
        System.out.println(c1); //will print address of c1
    }
}
