import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attendance, attitude;
        double gpa;
        System.out.println("Enter you GPA: ");
        gpa = sc.nextDouble();
        System.out.println("Enter your attendance percentage:");
        attendance = sc.nextInt();
        System.out.println("Enter your Attitude Score: ");
        attitude = sc.nextInt();
        if (gpa > 0 && gpa <= 4.0 && attendance > 0 && attendance <= 100 && attitude > 1 && attitude <= 10) {
            if (gpa >= 3.2 && attendance > 80 && attitude < 5) {
                System.out.println("The student is eligible for the scholarship!");
            }
            else {
                System.out.println("The student is not eligible for the scholarship!");
            }
        }
        else{
            System.out.println("Invalid data input");
        }
    }
}