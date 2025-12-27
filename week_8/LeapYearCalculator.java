import java.util.Scanner;

public class LeapYearCalculator {
    public String isLeapYear(int yrs) {
        if ((yrs % 4 == 0 && yrs % 100 != 0) || (yrs % 400 == 0)) {
            return "It is a leap year";
        } else {
            return "It is not a leap year";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeapYearCalculator lp = new LeapYearCalculator();
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.println(lp.isLeapYear(year));
    }
}