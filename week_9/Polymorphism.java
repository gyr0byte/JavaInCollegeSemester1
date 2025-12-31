public class Polymorphism {
    public static void main(String[] args) {
        Student student = new Student(1, "John Doe", 20, "123 Main St", "Computer Science", 3.8);
        Teacher teacher = new Teacher( "Jane Smith", 35, "456 Elm St", 1001, "Mathematics", 55000.0);
        Person[] persons = {student, teacher};
        for (Person person : persons) {
            person.displayInfo();
            person.isAdult();
            switch (person) {
                case Student s -> s.calculateHonors();
                case Teacher t -> t.calculateYearsOfService(2024, 2015);
                default -> {
                }
            }
            System.out.println();
        }
    }
}
