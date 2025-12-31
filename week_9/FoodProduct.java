public class FoodProduct extends NepaliProduct{
    int expirationDays;
    String ingredients;
    boolean isOrganic;
    String certifiedBy;
    void isExpiringSoon() {
        if(expirationDays <= 7) {
            System.out.println("This food product is expiring soon in " + expirationDays + " days.");
        } else {
            System.out.println("This food product is not expiring soon. Days left: " + expirationDays);
        }
    }
    void isLocallySourced() {
        if(manufactureLocation != null && manufactureLocation.equalsIgnoreCase("Nepal")) {
            System.out.println("This food product is locally sourced from Nepal.");
        } else {
            System.out.println("This food product is not locally sourced from Nepal.");
        }
    }
}
