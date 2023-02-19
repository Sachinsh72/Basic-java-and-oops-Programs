// A non-static method can be used to initialize the members of an object.
// A non-static method loads inside the objects from where it can initialize the members of the object.
public class fruit1 {
    String name;
    int price;
    double weight;

    public void setValue(String n, int p, double w){
        name =n;
        price =p;
        weight =w;
    }

    public static void main(String[] args) {
        fruit1 f1 = new fruit1();
        f1.setValue("Apple",120,3.4);
    }
}
