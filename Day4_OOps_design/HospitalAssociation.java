package Week2.Day4_OOps_design;

import java.util.ArrayList;
import java.util.List;

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println(name + " is consulting " + patient);
    }

    public String toString() {
        return name;
    }

    public void displayPatients() {
        System.out.println("Doctor: " + name + " Patients: " + patients);
    }
}

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void displayDoctors() {
        System.out.println("Patient: " + name + " Doctors: " + doctors);
    }

    public String toString() {
        return name;
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void displayHospitalDetails() {
        System.out.println("Hospital: " + name);
        for (Doctor doctor : doctors) {
            doctor.displayPatients();
        }
    }
}

public class HospitalAssociation {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor doctor1 = new Doctor("Dr. Smith");
        Doctor doctor2 = new Doctor("Dr. Johnson");

        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        hospital.displayHospitalDetails();
        patient1.displayDoctors();
        patient2.displayDoctors();
    }
}