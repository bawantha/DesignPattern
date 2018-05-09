package Factory;

public class Factory {
    public Product getProduct(String type){
        if(type=="product1"){
            return new Prodcut1();
        }else if (type=="prodcut2"){
            return new Prodcut2();
        }else if(type=="product3"){
            return new Product3();
        }else{
            return null;
        }
    }
}
