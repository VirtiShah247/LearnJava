interface Product {
    public String getName();

    public double getPrice();
}

abstract class ShoppingCart{
    protected int Product[] products;
    protected int count = 0;
    int capacity;
    public ShoppingCart(int capacity){
        products = new Product[capacity];
        count=0;
    }
    public void addProduct(Product product) throws CustomException{

    }
    }

class Book implements product {
    String name;
    double price;

    Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName(String name) {

    }

    double getPrice(double price) {

    }
}

class Elect implements product {
    String name;
    double price;

    Elect(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName(String name) {

    }

    double getPrice(double price) {

    }
}

public class ProdConsMain {
    public static void main(String[] args) {

    }
}
