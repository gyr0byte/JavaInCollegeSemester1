public class MiniKitab {
    public static void main(String[] args) {
        String[] categories = { "Fiction", "Nepali" };
        String[][] titles = { { "The Great Gatsby" }, { "Muna Madan" } };
        double[][] prices = { { 10.99 }, { 8.99 } };
        for (String category : categories)
            System.out.print(category + " ");
        System.out.println();
        for (String[] title : titles) {
            for (String t : title)
                System.out.print(t + " ");
        }
        System.out.println();
        for (double[] price : prices) {
            for (double p : price)
                System.out.printf("%.2f ", p);
        }
        System.out.printf("\nTotal: %.2f", prices[0][0] + prices[1][0]);
    }
}