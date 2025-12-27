import java.util.Scanner;

public class PaperSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the paper size (A0/A1/A2/A3/A4/A5):");
        String size = sc.next().toUpperCase();
        switch (size) {
            case "A0" -> System.out.println("Dimensions of A0: 841mm x 1189mm (33.1in x 46.8in)");
            case "A1" -> System.out.println("Dimensions of A1: 594mm x 841mm (23.4in x 33.1in)");
            case "A2" -> System.out.println("Dimensions of A2: 420mm x 594mm (16.5in x 23.4in)");
            case "A3" -> System.out.println("Dimensions of A3: 297mm x 420mm (11.7in x 16.5in)");
            case "A4" -> System.out.println("Dimensions of A4: 210mm x 297mm (8.3in x 11.7in)");
            case "A5" -> System.out.println("Dimensions of A5: 148mm x 210mm (5.8in x 8.3in)");
            default -> System.out.println("Invalid paper size entered.");
        }
        sc.close();
    }
}