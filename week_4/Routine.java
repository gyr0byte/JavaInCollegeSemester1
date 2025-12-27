import java.util.Scanner;

public class Routine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day in a week.");
        String day = sc.next().toLowerCase();
        switch (day) {
            case "monday" -> System.out.println("Learn something new");
            case "tuesday" -> System.out.println("Finish all notes");
            case "wednesday" -> System.out.println("Give time in college projects");
            case "thursday" -> System.out.println("hangout with friends");
            case "friday" -> System.out.println("Dive deeper into some niche topics");
            case "saturday" -> System.out.println("Gardening");
            case "sunday" -> System.out.println("Reset or Rest day");
            default -> System.out.println("Invalid input");
        }
        sc.close();
    }
}