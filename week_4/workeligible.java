import java.util.Scanner;

public class workeligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age:");
        age = sc.nextInt();
        if (age < 18 && age >= 1) {
            System.out.println("You are a Minor!");
        }
        else if (age >= 18 && age<40) {
            System.out.println("You can work");
        }
        else if (age > 40){
            System.out.println("Too old to work");
        }
        else{
            System.out.println("Invalid age");
        }
        sc.close();
    }
}