public class NepaliProduct {
    int productId;
    String name;
    double price;
    String manufactureLocation;
    void displayInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Manufacture Location: " + manufactureLocation);
    }
    // price with vat
    void calculateTotalPrice() {
        double vat = price * 0.13;
        double totalPrice = price + vat;
        System.out.println("Total Price (including VAT): " + totalPrice);
    }
}
