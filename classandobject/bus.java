package classandobject;

public class bus {
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
        bus b1 = new bus();
        System.out.println(b1.name);
        run();

    }
}

