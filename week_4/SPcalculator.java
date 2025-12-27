import java.util.Scanner;

public class SPcalculator {
    public static void main(String[] args) {
        double discountAmount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marked Price");
        double mp = sc.nextDouble();
        System.out.println("Enter a category (A/B/C/D)");
        char category = sc.next().toUpperCase().charAt(0);
        switch (category) {
            case 'A' -> discountAmount = mp * 0.6;
            case 'B' -> discountAmount = mp * 0.4;
            case 'C' -> discountAmount = mp * 0.2;
            case 'D' -> discountAmount = mp * 0.1;
        }
        System.out.printf("The Selling Price of the Product is %.2f", (mp-discountAmount));
    }
}