
public class Student {
    public static void main(String[] args) {
        StudentInfo st1 = new StudentInfo("Gaurav", 19, 3.64);
        st1.setName("Gauravvv");
        st1.setAge(21);
        st1.setGpa(3.91);
        System.out.println(st1.getName());
        System.out.println(st1.getAge());
        System.out.println(st1.getGpa());
    }
}