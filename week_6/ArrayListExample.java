
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Gaurav");
        list.add(1);
        list.add(true);
        for (Object element : list) {
            System.out.println(element);
        }
    }
}
