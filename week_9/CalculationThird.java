public class CalculationThird extends CalculationSecond {
    void division(int a, int b) {
        if (b != 0) {
            System.out.println("Quotient: " + (a / b));
        } else {
            System.out.println("Error: Division by zero");
        }
    }
}