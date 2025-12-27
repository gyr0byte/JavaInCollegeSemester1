public class MinySeating {
    public static void main(String[] args) {
        String[][] seats = {{"[Taken seat]", "[Taken seat]", "[Taken seat]"}, {"[Empty]", "[Empty]", "[Empty]"}};
        for (String[] seat : seats) {
            for (String s : seat) {
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
