import java.util.Scanner;
class Gym {
    String memberName;
    String membershipType;
    String joinDate;
    double monthlyFee;

    public Gym(String memberName, String membershipType, String joinDate, double monthlyFee) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.joinDate = joinDate;
        this.monthlyFee = monthlyFee;
    }
    public static double calculateAnnualFee(double monthlyFee) {
        return monthlyFee * 12;
    }
    public static double getDiscountedFee(double monthlyFee) {
        System.out.println("Is the member senior citizen? (yes/no)");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            return monthlyFee * 0.9; // 10% discount
        }
        System.out.println("Is the member a student? (yes/no)");
        String response2 = scanner.nextLine();
        if (response2.equalsIgnoreCase("yes")) {
            return monthlyFee * 0.85; // 15% discount
        } else {
            return monthlyFee;
        }
    }
    public static boolean isEligibleForDiscount(String joinDate) {
        int currentYear = 2025;
        String yearPart = joinDate.substring(0, 4);
        int joinYear = Integer.parseInt(yearPart);
        return (currentYear - joinYear) >= 1;
    }
    void displayMemberInfo() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Join Date: " + joinDate);
        System.out.println("Monthly Fee: " + monthlyFee);
        double discountedFee = getDiscountedFee(monthlyFee);
        System.out.println("Discounted Monthly Fee: " + discountedFee);
        double annualFee = calculateAnnualFee(discountedFee);
        System.out.println("Annual Fee: " + annualFee);
        if (isEligibleForDiscount(joinDate)) {
            System.out.println("Member is eligible for loyalty discount.");
        } else {
            System.out.println("Member is not eligible for loyalty discount.");
        }
        System.out.println("-------------------------------");
    }
}

public class GymMemberNepal {
    public static void main(String[] args) {
        Gym m1 = new Gym("Gaurav", "Monthly", "2025-07-15", 2500.0);
        Gym m2 = new Gym("Sita", "Quaterly", "2025-02-10", 7000.0);
        Gym m3 = new Gym("Ram", "Yearly", "2025-08-05", 3000.0);
        Gym m4 = new Gym("Anita", "Monthly", "2025-04-20", 5000.0); 
        m1.displayMemberInfo();
        m2.displayMemberInfo();
        m3.displayMemberInfo();
        m4.displayMemberInfo();
    }
}