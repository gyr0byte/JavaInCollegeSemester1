public class Switch {
    public static void main(String[] args) {
        int option = 2;
        switch (option) {
            case 1 -> System.out.println("Hello1");
            case 2 -> System.out.println("Hello2");
            case 3 -> System.out.println("Hello3");
            case 4 -> System.out.println("Hello4");
            default -> System.out.println("Error");
        }
    }
}