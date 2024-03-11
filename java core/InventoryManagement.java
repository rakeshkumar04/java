import java.util.ArrayList;
import java.util.List;


class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}

class ElectronicProduct extends Product {
    public ElectronicProduct(String name, double price) {
        super(name, price);
    }

}

class ClothingProduct extends Product {
    public ClothingProduct(String name, double price) {
        super(name, price);
    }

}

public class InventoryManagement {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new ElectronicProduct("Laptop", 1200.0));
        products.add(new ClothingProduct("T-shirt", 25.0));

        for (Product product : products) {
            System.out.println("Product: " + product.getName());
            System.out.println("Price: Rs." + product.getPrice());
            System.out.println();
        }
    }
}