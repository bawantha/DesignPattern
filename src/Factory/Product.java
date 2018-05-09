package Factory;

public interface Product {
    void Create();
}

class Prodcut1 implements Product{

    @Override
    public void Create() {
        System.out.println("Create Product 1");
    }
}

class Prodcut2 implements Product{

    @Override
    public void Create() {
        System.out.println("Create product 2");
    }
}

class Product3 implements Product{

    @Override
    public void Create() {
        System.out.println("Create product 3");

    }
}
