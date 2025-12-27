public class MinorChecker {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Adult");
        } else if (age <= 0) {
            System.out.println("Age can't be negative or zero");
        } else {
            System.out.println("Minor");
        }
    }
}