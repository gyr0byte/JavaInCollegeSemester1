public class HandiCraftProduct extends NepaliProduct{
    String artisanName;
    String craftType;
    String culturalSignificance;
    void displayHandiCraftInfo() {
        displayInfo();
        System.out.println("Artisan Name: " + artisanName);
        System.out.println("Craft Type: " + craftType);
        System.out.println("Cultural Significance: " + culturalSignificance);
    }
    @Override
    void calculateTotalPrice() {
        System.out.println("Total Price (without VAT for Handicraft): " + price);
    }
    void isCulturalSignificant() {
        if(culturalSignificance != null && !culturalSignificance.isEmpty()) {
            System.out.println("This handicraft has cultural significance: " + culturalSignificance);
        } else {
            System.out.println("This handicraft does not have specified cultural significance.");
        }
    }
}
