import java.util.Scanner;
public class AausadhiPasal {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Name of the medicine (In नेपाली ):");
    String medNP = sc.nextLine();
    System.out.println("Enter the Name of the medicine (In English ):");
    String medEN = sc.nextLine();
    System.out.println("Enter the Price of the medicine:");
    String price = sc.nextLine();
    System.out.println("Enter the stock of the medicine:");
    String stock = sc.nextLine();
    System.out.println("Does it require a prescription? (yes/no):");
    String prescription = sc.nextLine();
    System.out.println();
    System.out.println("=========================================================Medicine Details==========================================================");
    System.out.println("\n");
    System.out.print("Name (नेपाली):\t\t");
    System.out.print("Name (English)\t\t");
    System.out.print("Price\t\t");
    System.out.print("Stock\t\t");
    System.out.print("Requires Prescription:\t\t");
    System.out.println();
    System.out.print(medNP + "\t\t");
    System.out.print(medEN + "\t\t");
    System.out.print(price + "\t\t");
    System.out.print(stock + "\t\t");
    System.out.print(prescription + "\t\t");
    System.out.println();
    sc.close();
}
}