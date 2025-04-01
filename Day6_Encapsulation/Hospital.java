abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public abstract double calculateBill();
}

class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}

interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

class PatientRecord implements MedicalRecord {
    private String diagnosis;
    private String medicalHistory;

    public PatientRecord(String diagnosis, String medicalHistory) {
        this.diagnosis = diagnosis;
        this.medicalHistory = medicalHistory;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory += "; " + record;
    }

    @Override
    public String viewRecords() {
        return "Diagnosis: " + diagnosis + ", History: " + medicalHistory;
    }
}

public class Hospital {
    public static void main(String[] args) {
        Patient inPatient = new InPatient(1, "John Doe", 45, 5, 2000);
        Patient outPatient = new OutPatient(2, "Jane Smith", 30, 500);

        System.out.println(inPatient.getPatientDetails());
        System.out.println("Bill: " + inPatient.calculateBill());

        System.out.println(outPatient.getPatientDetails());
        System.out.println("Bill: " + outPatient.calculateBill());

        MedicalRecord record = new PatientRecord("Flu", "No prior history");
        System.out.println(record.viewRecords());
        record.addRecord("Follow-up required");
        System.out.println(record.viewRecords());
    }
}