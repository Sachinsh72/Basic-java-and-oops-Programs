package mobile;

public class mobile {
    String name;
    int price;
    String brand;

    public void setValue(String n,int p, String b){
        name = n;
        price = p;
        brand = b;
    }

    public void displayMobile(){
        System.out.println("Name of mobile : "+name);
        System.out.println("Brand of mobile : "+brand);
        System.out.println("Price of mobile : "+price);
    }
}
