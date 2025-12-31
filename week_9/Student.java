public class Student extends Person {
    int studentID;
    String course;
    double gpa;
    Student(int studentID, String name, int age, String address, String course, double gpa) {
        super(name, age, address);
        this.studentID = studentID;
        this.course = course;
        this.gpa = gpa;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("GPA: " + gpa);
    }
    void calculateHonors() {
        if (gpa > 3.5) {
            System.out.println(name + " is on the honors list.");
        } else {
            System.out.println(name + " is not on the honors list.");
        }
    }
}
