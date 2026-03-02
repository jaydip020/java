// Parent Class
class Website {
    String websiteName = "My Online Store";

    void showWebsite() {
        System.out.println("Website Name: " + websiteName);
    }
}

// Child Class (inherits Website)
class Product extends Website {
    String productName;
    double price;

    void showProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
}

// Child Class (inherits Product)
class Order extends Product {
    int quantity;
    double totalAmount;
    double deliveryCharge;

    // Method Overriding
    @Override
    void showWebsite() {
        System.out.println("Welcome to " + websiteName + " - Best Shopping Experience!");
    }

    void calculateOrder() {
        totalAmount = price * quantity;

        if (totalAmount >= 2000) {
            deliveryCharge = 0;
        } else {
            deliveryCharge = 100;
        }
    }

    void showOrder() {
        calculateOrder();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Final Amount: " + (totalAmount + deliveryCharge));
    }
}

// Main Class
public class Q1 {
    public static void main(String[] args) {

        Order obj = new Order();

        obj.productName = "Laptop";
        obj.price = 50000;
        obj.quantity = 1;

        obj.showWebsite();
        obj.showProduct();
        obj.showOrder();
    }
}
