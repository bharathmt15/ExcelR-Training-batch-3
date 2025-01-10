import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public void setDetails(String name, double price) {
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

class ProductManager {
    private Product product1 = new Product();
    private Product product2 = new Product();

    public void addProduct(String name1, double price1, String name2, double price2) {
        product1.setDetails(name1, price1);
        product2.setDetails(name2, price2);
    }

    public void displayProducts() {
        double total = product1.getPrice() + product2.getPrice();
        System.out.println("Product: " + product1.getName() + ", Price: " + product1.getPrice());
        System.out.println("Product: " + product2.getName() + ", Price: " + product2.getPrice());
        System.out.println("Total Amount: " + total);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager manager = new ProductManager();

        System.out.println("Enter first product name:");
        String name1 = sc.nextLine();
        System.out.println("Enter first product price:");
        double price1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter second product name:");
        String name2 = sc.nextLine();
        System.out.println("Enter second product price:");
        double price2 = sc.nextDouble();
        sc.nextLine();

        manager.addProduct(name1, price1, name2, price2);
        manager.displayProducts();
        sc.close();
    }
}
