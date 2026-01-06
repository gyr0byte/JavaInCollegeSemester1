class Student{
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.grade = 0;
    }
    void displayInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.grade);
    }
    public boolean isAdult(int age){
        return age >= 18;
    }
    void updateGrade(){
        this.grade += 1;
        System.out.println(this.grade);
    }
    @Override
    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nGrade: " + grade;
    }
}

public class StudentTester {
    public static void main(String[] args) {
        Student student1 = new Student("Gaurav", 19, 3.5);
        Student student2 = new Student("Girish", 19, 3.8);
        Student student3 = new Student("Aaditya", 17, 3.2);
        Student student4 = new Student("Rebika", 16);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println();

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
        System.out.println();

        System.out.println(student1.isAdult(student1.age));
        System.out.println(student2.isAdult(student2.age));
        System.out.println(student3.isAdult(student3.age));
        System.out.println(student4.isAdult(student4.age));
        System.out.println();

        System.out.println("updated grade");
        student1.updateGrade();
        student2.updateGrade();
        student3.updateGrade();
        student4.updateGrade();
    }
}