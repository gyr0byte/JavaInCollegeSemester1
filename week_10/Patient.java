public class Patient {
    private String patientId;
    private String name;
    private int age;
    private String medicalCondition;
    private String bloodType;
    private String ward;
    private String economicStatus;

    public Patient(String patientId, String name, int age, String medicalCondition, String bloodType, String ward, String economicStatus) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalCondition = medicalCondition;
        this.bloodType = bloodType;
        this.ward = ward;
        this.economicStatus = economicStatus;
    }

    void setPatientId(String patientId) {
        if (patientId.startsWith("NP")) {
            this.patientId = patientId;
        } else {
            System.out.println("Invalid Patient ID.");
        }
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be positive.");
        }
    }

    void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    void setBloodType(String bloodType) {
        if (bloodType.equalsIgnoreCase("A+") || bloodType.equalsIgnoreCase("A-") ||
                bloodType.equalsIgnoreCase("B+") || bloodType.equalsIgnoreCase("B-") ||
                bloodType.equalsIgnoreCase("AB+") || bloodType.equalsIgnoreCase("AB-") ||
                bloodType.equalsIgnoreCase("O+") || bloodType.equalsIgnoreCase("O-")) {
            this.bloodType = bloodType;
        } else {
            System.out.println("Invalid blood type.");
        }
    }
    void setWard(String ward) {
            if (ward.equalsIgnoreCase("General") || ward.equalsIgnoreCase("ICU") ||
                ward.equalsIgnoreCase("Emergency") || ward.equalsIgnoreCase("Maternity")) {
            this.ward = ward;
        } else {
            System.out.println("Invalid ward.");
        }
    }
    void setEconomicStatus(String economicStatus) {
        this.economicStatus = economicStatus;
    }
    String getPatientId() {
        return patientId;
    }
    String getName() {
        return name;
    }
    int getAge() {
        return age; 
    }
    String getMedicalCondition() {
        return medicalCondition;
    }
    String getBloodType() {
        return bloodType;
    }
    String getWard() {
        return ward;
    }
    String getEconomicStatus() {
        return economicStatus;
    }
    int getAllowedVisitors() {
        return switch (ward) {
            case "General" -> 2;
            case "ICU" -> 1;
            case "Emergency" -> 0;
            case "Maternity" -> 3;
            default -> 0;
        };
    }
    double calculateTreatmeentCharge(int days) {
        double dailyRate;
        dailyRate = switch (ward) {
            case "General" -> 500.0;
            case "ICU" -> 2000.0;
            case "Emergency" -> 1500.0;
            case "Maternity" -> 800.0;
            default -> 0.0;
        };
        return dailyRate * days;
    }
    boolean isEligibleForFreeCare(int age) {
        return age > 70 || economicStatus.equals("Low Income");
    }
}