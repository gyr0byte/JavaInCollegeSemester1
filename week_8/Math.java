import java.util.Scanner;
public class Math {
    public int add(int a, int b) {
        return a + b;
    }
    public int div(int a, int b) {
        return a / b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Math math = new Math();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + " + " + b + " = " + math.add(a, b));
        System.out.println(a + " / " + b + " = " + math.div(a, b));
        System.out.println(a + " - " + b + " = " + math.sub(a, b));
        System.out.println(a + " * " + b + " = " + math.mul(a, b));
    }
}