import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean another = true;

        while (another) {
            System.out.println();
            System.out.println("Enter the movie language (Nepali/Hindi/English):");
            String movieLang = sc.nextLine().trim();

            System.out.println("Enter the age group (child/adult/senior):");
            String ageGroup = sc.nextLine().trim();

            double basePrice;
            if (ageGroup.equalsIgnoreCase("child")) {
                basePrice = 150.0;
            } else if (ageGroup.equalsIgnoreCase("adult")) {
                basePrice = 250.0;
            } else if (ageGroup.equalsIgnoreCase("senior")) {
                basePrice = 200.0;
            } else {
                System.out.println("Invalid age group entered. Please enter child, adult or senior.");
                continue;
            }

            double ticketPrice = basePrice;
            if (movieLang.equalsIgnoreCase("hindi")) {
                ticketPrice += 50.0;
            } else if (movieLang.equalsIgnoreCase("english")) {
                ticketPrice += 100.0;
            } // Nepali or other -> no surcharge

            System.out.println("Does customer have a valid Student ID? (yes/no):");
            String student = sc.nextLine().trim();
            if (student.equalsIgnoreCase("yes")) {
                ticketPrice = ticketPrice * 0.8; // 20% off
            }

            System.out.println("Is it a festival day? (yes/no):");
            String festival = sc.nextLine().trim();
            if (festival.equalsIgnoreCase("yes")) {
                ticketPrice = ticketPrice * 0.85; // 15% off
            }

            System.out.printf("The final ticket price is Rs%.2f\n", ticketPrice);

            System.out.println("Calculate another ticket? (yes/no):");
            String again = sc.nextLine().trim();
            if (!again.equalsIgnoreCase("yes")) {
                another = false;
            }
        }
        sc.close();
    }
}