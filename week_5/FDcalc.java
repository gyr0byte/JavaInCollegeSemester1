import java.util.Scanner;

public class FDcalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean choiceFD = true;
        while (choiceFD) {
            System.out.println("Enter the principle amount (min 1000):");
            double principal = sc.nextDouble();
            if (principal < 1000) {
                System.out.println("Principal must be at least Rs. 1000.");
                continue;
            }
            System.out.println("Enter the interest rate (8-12)%");
            double rate = sc.nextDouble();
            if (rate < 8 || rate > 12) {
                System.out.println("Rate should be in the range of (8-12)");
                continue;
            }
            System.out.println("Enter duration in years (max 5): ");
            int years = sc.nextInt();
            if (years < 1 || years > 5) {
                System.out.println("Duration must be between 1 and 5 years.");
                continue;
            }
            double processingFee = principal * 0.005;
            double netPrincipal = principal - processingFee;
            double amount = netPrincipal * Math.pow(1+ (rate / 100) / 12 , (double)(12*years));
            System.out.printf("Processing Fee: Rs. %.2f\n", processingFee);
            System.out.printf("Deposited Amount after Fee: Rs. %.2f\n", netPrincipal);
            System.out.printf("Maturity Amount after %d years: Rs. %.2f\n", years, amount);
            System.out.printf("Total Interest Earned: Rs. %.2f\n", amount - netPrincipal);
            System.out.println();
            System.out.println("Do you want to calculate another FD (yes/no)");
            String choice = sc.next().trim();
            if (choice.equalsIgnoreCase("no")) {
                choiceFD = false;
            }
        }
        sc.close();
    }
}