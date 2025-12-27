class Student {
    String name;
    String studentID;
    int age;
    String course;

    public Student(String name, String studentID, int age, String course) {
        this.name = name;
        this.studentID = studentID;
        this.age = age;
        this.course = course;
    }

    public String toString() {
        return "Name: " + name +
                "\nStudent ID: " + studentID +
                "\nAge: " + age +
                "\nCourse: " + course;
    }
}