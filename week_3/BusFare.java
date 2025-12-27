import java.util.Scanner;
public class BusFare {
    public static void main(String[] args) {
        double distance, time, chargeDistance,chargetime, basefare=20.0,fare, finalfare,fareinnight, lastfare;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in KM");
        distance = sc.nextDouble();
        System.out.println("Enter the time traveled");
        time = sc.nextDouble();
        chargeDistance = 30*distance;
        chargetime = 5*time;
        fare = chargeDistance+chargetime+basefare;
        double discount = fare-25;
        System.out.println("Is the customer local? yes/no");
        String ans = sc.next().toLowerCase();
        finalfare = (ans.equals("yes") && distance>5)?discount:fare;
        System.out.println("Is it night time? yes/no");
        String ans2= sc.next().toLowerCase(); 
        fareinnight = finalfare+30;
        lastfare = (ans2.equals("yes")? fareinnight: finalfare);
        System.out.printf("The final fare of this ride is :RS%.2f", lastfare);
        sc.close();
    }
}