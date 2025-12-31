public class Teacher extends Person {
    int employeeID;
    String subject;
    double salary;
    public Teacher(String name, int age, String address, int employeeID, String subject, double salary) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.subject = subject;
        this.salary = salary;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
    void calculateYearsOfService(int currentYear, int hireYear) {
        int yearsOfService = currentYear - hireYear;
        System.out.println(name + " has " + yearsOfService + " years of service.");
    }
}
