import java.util.Scanner;
public class PrimeNumber {
    public String isPrime(int num) {
        if (num <= 1) {
            return "Number is not a prime";
        } 
        for (int i = 2; i < num ; i++) {
            if (num % i == 0) return "Number is not a prime";
        }
            return "Number is a prime.";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeNumber pn = new PrimeNumber();
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(pn.isPrime(number));
    }
}
