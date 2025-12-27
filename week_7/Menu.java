public class Menu {
    String itemName, category;
    double price;
    boolean isVegeterian, isAvailable;

    public Menu(String itemName, double price, String category, boolean isVegeterian, boolean isAvailable) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.isVegeterian = isVegeterian;
        this.isAvailable = isAvailable;
    }
    public String toString() {
        return "Item Name: " + itemName +
                "\nPrice: " + price +
                "\ncategory: " + category +
                "\nVeg food: " + (isVegeterian ? "Yes" : "No") +
                "\nAvailable status: " + (isAvailable ? "Yes" : "No");
    }
    void vegOnly() {
        if (isVegeterian) {
            System.out.println("Item Name: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Category: " + category);
            System.out.println("Available status: " + (isAvailable ? "Yes" : "No"));
            System.out.println();
        }
    }
    void nonVegOnly() {
        if (!isVegeterian){
            System.out.println("Item Name: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Category: " + category);
            System.out.println("Available status: " + (isAvailable ? "Yes" : "No"));
            System.out.println();
        }
    }
    void nonVegOver100Available() {
        if (!isVegeterian && price > 100 && isAvailable) {
            System.out.println("Item Name: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Category: " + category);
            System.out.println("Available status: " + (isAvailable ? "Yes" : "No"));
            System.out.println();
        }
    }
    void vegUnder50Available() {
        if (isVegeterian && price < 50 && isAvailable) {
            System.out.println("Item Name: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Category: " + category);
            System.out.println("Available status: " + (isAvailable ? "Yes" : "No"));
            System.out.println();
        }
    }
}