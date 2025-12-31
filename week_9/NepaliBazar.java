public class NepaliBazar {
    public static void main(String[] args) {
        HandiCraftProduct handiCraft = new HandiCraftProduct();
        FoodProduct foodProduct = new FoodProduct();
        NepaliProduct[] nps = {handiCraft, foodProduct};
        for (NepaliProduct np : nps) {
            switch(np) {
                case HandiCraftProduct hcp -> {
                    hcp.productId = 101;
                    hcp.name = "Traditional Thangka Painting";
                    hcp.price = 2500.0;
                    hcp.manufactureLocation = "Kathmandu";
                    hcp.artisanName = "Tashi Lama";
                    hcp.craftType = "Painting";
                    hcp.culturalSignificance = "Religious Art";
                    hcp.displayHandiCraftInfo();
                    hcp.calculateTotalPrice();
                    hcp.isCulturalSignificant();
                    System.out.println("");
                }
                case FoodProduct fp -> {
                    fp.productId = 202;
                    fp.name = "Organic Himalayan Honey";
                    fp.price = 800.0;
                    fp.manufactureLocation = "Solukhumbu";
                    fp.expirationDays = 5;
                    fp.ingredients = "100% Pure Honey";
                    fp.isOrganic = true;
                    fp.certifiedBy = "Nepal Organic Certification";
                    fp.displayInfo();
                    fp.calculateTotalPrice();
                    fp.isExpiringSoon();
                    fp.isLocallySourced();      
                }
                default -> {
                    // Default case for any other NepaliProduct types
                }
            }
        }
    }
}
