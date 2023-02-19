public class Bus {
    static String brand;
    String name;
    String color;

    public static void run() {
        System.out.println("Bus is running");
    }
    public void accelerate(){
        System.out.println("accelerating");
    }

    public static void main(String[] args) {
        System.out.println(brand);
        Bus b1 = new Bus();
        System.out.println(b1.name);
        run();

    }
}
