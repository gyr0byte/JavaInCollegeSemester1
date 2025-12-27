import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter green,red or yellow");
        String light = sc.next().toLowerCase();
        switch (light) {
            case "red" -> System.out.println("Stop");
            case "green" -> System.out.println("Go");
            case "yellow" -> System.out.println("Wait");
            default -> System.out.println("Invalid light colour");
        }
        sc.close();
    }
}