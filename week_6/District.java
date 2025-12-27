import java.util.Scanner;

public class District {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, numberOfDistrict;
        String[] districts;
        System.out.println("How many district you want to enter?");
        numberOfDistrict = sc.nextInt();
        districts = new String[numberOfDistrict];
        for (int j = 0; j < numberOfDistrict; j++) {
            System.out.printf("Enter %d district: ", j+1);
            districts[j] = sc.next();
        }
        for (String district : districts) {
            System.out.println(i+". "+district);
            i++;
        }
    }
}
