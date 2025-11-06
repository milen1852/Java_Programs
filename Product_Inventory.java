import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Product class
class Product {
    private int prod_id;
    private String prod_name;
    private double prod_price;
    private int prod_quantity;

    public Product(int prod_id, String prod_name, double prod_price, int prod_quantity) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.prod_price = prod_price;
        this.prod_quantity = prod_quantity;
    }

    public void display() {
        System.out.println("ID: " + prod_id + " | Name: " + prod_name +
                " | Price: " + prod_price + " | Quantity: " + prod_quantity);
    }
}

// Inventory System class
class InventorySystem {
    Scanner sc = new Scanner(System.in);
    public void addProduct(ArrayList<Product> inventory) {
        while (true) {
            try {
                System.out.print("Enter Product ID: ");
                int prod_id = sc.nextInt();
                sc.nextLine(); // consume newline

                System.out.print("Enter Product Name: ");
                String prod_name = sc.nextLine();

                System.out.print("Enter Product Price: ");
                double prod_price = sc.nextDouble();

                System.out.print("Enter Product Quantity: ");
                int prod_quantity = sc.nextInt();

                Product p = new Product(prod_id, prod_name, prod_price, prod_quantity);
                inventory.add(p);

                System.out.println("\n✅ Product added successfully!\n");
                break; // exit loop once done

            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Please try again.");
                sc.nextLine(); // clear buffer
            }
        }
    }

    public void displayProducts(ArrayList<Product> inventory) {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            System.out.println("\n===== Product List =====");
            for (Product p : inventory) {
                p.display();
            }
            System.out.println("========================\n");
        }
    }
}

// Main class
public class Product_Inventory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> inventory = new ArrayList<>();
        InventorySystem inv = new InventorySystem();

        int choice = 0;
        do {
            System.out.println("===== PRODUCT INVENTORY SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Reduce Stock");
            System.out.println("4. Add Pending Order");
            System.out.println("5. Process Next Order");
            System.out.println("6. Calculate Total Inventory Value");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        inv.addProduct(inventory);
                        break;
                    case 2:
                        inv.displayProducts(inventory);
                        break;
                    case 3:
                        System.out.println("Reduce Stock feature coming soon...");
                        break;
                    case 4:
                        System.out.println("Add Pending Order feature coming soon...");
                        break;
                    case 5:
                        System.out.println("Process Next Order feature coming soon...");
                        break;
                    case 6:
                        System.out.println("Calculate Inventory Value feature coming soon...");
                        break;
                    case 7:
                        System.out.println("Exiting Program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number from 1–7.");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Enter a number between 1–7.");
                sc.nextLine(); // clear invalid input
            }
        } while (choice != 7);
        sc.close();
    }
}
