
public class StudentInfo {
    private String name;
    private int age;
    private double gpa;

    public StudentInfo(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        if (age > 0) {
            this.age = age;
        }
        else {
            System.out.println("Invalid age. Age must be positive.");
        }
    }
    void setGpa(double gpa){
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
        else {
            System.out.println("Invalid GPA. GPA must be between 0.0 and 4.0.");
        }
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    double getGpa(){
        return gpa;
    }
}