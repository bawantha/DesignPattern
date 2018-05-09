package Factory;

public class Main {
    public static void main(String[] args) {
        Factory f=new Factory();
        Product p1=f.getProduct("product1");
        p1.Create();
    }
}
