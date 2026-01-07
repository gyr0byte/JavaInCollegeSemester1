public class Patient {
    private int patientId;
    private String name;
    private int age;
    private String medicalCondition;
    private String bloodType;
    private String ward;
    public Patient(int patientId, String name, int age, String medicalCondition, String bloodType, String ward) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalCondition = medicalCondition;
        this.bloodType = bloodType;
        this.ward = ward;
    }
    public int getPatientId() {
        return patientId;
    }
}