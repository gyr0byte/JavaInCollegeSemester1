public class smallMarks2D {
    public static void main(String[] args) {
        int i = 1;
        int[][] marks = {{56,67},{77,32}, {32,44}};
        for (int[] mark : marks) {
            System.out.printf("Student %d.", i);
            for (int m : mark) {
                System.out.print(" " +m+" ");
            }
            i++;
            System.out.println();
        }
    }
}