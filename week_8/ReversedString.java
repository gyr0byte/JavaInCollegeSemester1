import java.util.Scanner;
public class ReversedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reversed = "";
        System.out.println("Enter a string to reverse:");
        String input = sc.nextLine();
        for (int i = input.length()-1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}