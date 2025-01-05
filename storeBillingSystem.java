import java.util.Scanner;

// Product Class to represent items or services in the bill
class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate the total price for the product (price * quantity)
    public double getTotalPrice() {
        return price * quantity;
    }

    // To display product information
    public void displayProduct() {
        System.out.println(name + " | Price: " + price + " | Quantity: " + quantity + " | Total: " + getTotalPrice());
    }
}

// store Class to represent the billing system
class store {
    private Product[] products; // Array to store products in the bill
    private int productCount; // Number of products added
    private double totalAmount;
    private double discount;
    private double tax;
    private double totalPayableAmount;

    // Constructor to initialize product array with a maximum size of 10 (for example)
    public store(int maxProducts) {
        this.products = new Product[maxProducts];
        this.productCount = 0;
        this.totalAmount = 0;
        this.discount = 0;
        this.tax = 0;
        this.totalPayableAmount = 0;
    }

    // Method to add product to the bill
    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
            totalAmount += product.getTotalPrice();
           
        } else {
            System.out.println("Cannot add more products. The bill can only hold " + products.length + " products.");
        }
    }

    // Method to apply discount
    public void applyDiscount(double discountPercentage) {
        this.discount = (totalAmount * discountPercentage) / 100;
        totalPayableAmount = totalAmount - discount;
    }

    // Method to apply tax
    public void applyTax(double taxPercentage) {
        this.tax = (totalAmount * taxPercentage) / 100;
        totalPayableAmount += tax;
    }

    // Method to generate the final store
    public void generatestore() {
        System.out.println("----- Over all bill -----");
        for (int i = 0; i < productCount; i++) {
            products[i].displayProduct();
        }
        System.out.println("Total Amount: " + totalAmount);
        if (discount > 0) {
            System.out.println("Discount: " + discount);
        }
        if (tax > 0) {
            System.out.println("Tax: " + tax);
        }
        System.out.println("Total Payable Amount: " + totalPayableAmount);
        System.out.println("-------------------");
    }
}

// Main Class to run the program
public class storeBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Max number of products in the bill
        int maxProducts = 10;
        
        // Create a new store object with a limit on the number of products
        store store = new store(maxProducts);
        
        System.out.println("Enter the number of products:");
        int numProducts = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        
        // Ensure numProducts does not exceed maxProducts
        if (numProducts > maxProducts) {
            System.out.println("You can only add up to " + maxProducts + " products.");
            return;
        }
        
        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter product " + (i + 1) + " name:");
            String name = scanner.nextLine();
            System.out.println("Enter price for " + name + ":");
            double price = scanner.nextDouble();
            System.out.println("Enter quantity for " + name + ":");
            int quantity = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            
            Product product = new Product(name, price, quantity);
            store.addProduct(product);
        }

        // Apply discount if any
        System.out.println("Enter discount percentage (if any, else enter 0):");
        double discountPercentage = scanner.nextDouble();
        if (discountPercentage > 0) {
            store.applyDiscount(discountPercentage);
        }
        
        // Apply tax if any
        System.out.println("Enter tax percentage (if any, else enter 0):");
        double taxPercentage = scanner.nextDouble();
        if (taxPercentage > 0) {
            store.applyTax(taxPercentage);
        }

        // Generate and display the final store
        store.generatestore();

        scanner.close();
    }
}