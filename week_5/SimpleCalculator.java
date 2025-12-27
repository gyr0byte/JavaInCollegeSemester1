import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, ans=0;
        char choice;
        String user;
        boolean isCalc = true;
        while (isCalc) {
            System.out.println("Enter your 1st number: ");
            num1 = sc.nextDouble();
            System.out.println("Enter your 2nd number: ");
            num2 = sc.nextDouble();
            System.out.println("Enter the operator you want to use (+,-,*,/)");
            choice = sc.next().charAt(0);
            switch (choice) {
                case '+' -> ans = num1 + num2;
                case '-' -> ans = num1 - num2;
                case '*' -> ans = num1 * num2;
                case '/' -> ans = num1 / num2;
                default -> System.out.println("invalid operator");
            }
            System.out.printf("The %c of your number is %.2f\n",choice,ans);
            System.out.println("Do you want to continue?(yes/no)");
            user = sc.next().trim();
            if (user.equalsIgnoreCase("no")) {
                isCalc = false;
            }
        }
    }
}
