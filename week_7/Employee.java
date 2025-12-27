class Employe{
    int employeeID;
    String address;
    String name;
    public Employe(int ID, String add, String n){
        this.employeeID = ID;
        this.address = add;
        this.name = n;
    }
}
public class Employee {
    public static void main(String[] args) {
        Employe em1 = new Employe(1, "Belbari", "Gaurav");
        System.out.println(em1.employeeID);
        System.out.println(em1.address);
        System.out.println(em1.name);
    }
}
