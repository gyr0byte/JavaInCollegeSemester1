import java.util.Scanner;

public class gradecaclulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your GPA");
        double gpa = sc.nextDouble();
        if (gpa > 0.0 && gpa <= 4.0) {
            if (gpa <= 4.0 && gpa > 3.6){
                System.out.println("A+");
            } 
            else if (gpa <= 3.6 && gpa > 3.2) {
                System.out.println("A");
            } 
            else if (gpa <= 3.2 && gpa > 2.8) {
                System.out.println("B+");
            } 
            else if (gpa <= 2.8 && gpa > 2.4) {
                System.out.println("B");
            } 
            else if (gpa <= 2.4 && gpa > 2.0) {
                System.out.println("C+");
            } 
            else if (gpa <= 2.0 && gpa > 1.6) {
                System.out.println("C");
            } 
            else {
                System.out.println("Fail");
            }
        } 
        else {
            System.out.println("Invalid GPA");
        }
    }
}