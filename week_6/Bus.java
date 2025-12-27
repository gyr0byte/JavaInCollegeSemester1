public class Bus {
    public static void main(String[] args) {
        String[][] seats = { { "Anil", "Gaurav" }, { "Girish", "Aaditya" }, { "Ronaldo", "Messi" } };
        /*
         * for (int i = 0; i < seats.length; i++) {
         * System.out.println("Seat " + (i + 1) + ": " + seats[i]);
         * }
         */
        for (String[] seat : seats) {
            for (String s : seat) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    /*  for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length;j++) {
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }  */
    }
}