public class BirHospital {
    public static void main(String[] args) {
        Patient patient1 = new Patient("NP1001", "Alice Smith", 30, "Flu", "A+", "General", "Middle Income");
        Patient patient2 = new Patient("NP1002", "Bob Johnson", 72, "Diabetes", "B-", "ICU", "High Income");
        Patient patient3 = new Patient("NP1003", "Charlie Brown", 25, "Injury", "O+", "Emergency", "Low Income"); 
        System.out.println(patient1.getPatientId() + ": " + patient1.getName() +" Age: " + patient1.getAge() + ", Medical Condition: " + patient1.getMedicalCondition() +", Blood Type: " + patient1.getBloodType() + ", Ward: " + patient1.getWard() + ", Economic Status: " + patient1.getEconomicStatus());
        System.out.println("Allowed Visitors: " + patient1.getAllowedVisitors());
        System.out.println("Treatment Cost for 5 days: Rs" + patient1.calculateTreatmeentCharge(5));
        System.out.println("Eligible for Free Care: " + patient1.isEligibleForFreeCare(30));
        System.out.println();
        System.out.println(patient2.getPatientId() + ": " + patient2.getName() +" Age: " + patient2.getAge() + ", Medical Condition: " + patient2.getMedicalCondition() +", Blood Type: " + patient2.getBloodType() + ", Ward: " + patient2.getWard() + ", Economic Status: " + patient2.getEconomicStatus());
        System.out.println("Allowed Visitors: " + patient2.getAllowedVisitors());
        System.out.println("Treatment Cost for 10 days: Rs" + patient2.calculateTreatmeentCharge(10));
        System.out.println("Eligible for Free Care: " + patient2.isEligibleForFreeCare(72));
        System.out.println();
        System.out.println(patient3.getPatientId() + ": " + patient3.getName() +" Age: " + patient3.getAge() + ", Medical Condition: " + patient3.getMedicalCondition() +", Blood Type: " + patient3.getBloodType() + ", Ward: " + patient3.getWard() + ", Economic Status: " + patient3.getEconomicStatus());
        System.out.println("Allowed Visitors: " + patient3.getAllowedVisitors());
        System.out.println("Treatment Cost for 3 days: Rs" + patient3.calculateTreatmeentCharge(3));
        System.out.println("Eligible for Free Care: " + patient3.isEligibleForFreeCare(25));
    }
}