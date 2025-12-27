public class highestLowest {
    public static void main(String[] args) {
        int[] marks = { 40, 10, 50, 30 };
        int highestMark = marks[0];
        int lowestMark = marks[0];
        int sum = 0;
        for (int m : marks) {
            if (m > highestMark) {
                highestMark = m;
            }
            if (m < lowestMark) {
                lowestMark = m;
            }
        }
        for (int mark : marks) {
            sum+=mark;
        }
        double avg = sum / marks.length;
        System.out.println("Highest mark is " + highestMark);
        System.out.println("Lowest mark is " + lowestMark);
        System.out.println("Sum of all numbers is " + sum);
        System.out.println("Average is " +avg);
    }
}