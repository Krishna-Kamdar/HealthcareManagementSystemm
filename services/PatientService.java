package com.example.healthcare.services;

import com.example.healthcare.models.patient;

import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private List<patient> patients = new ArrayList<>();

    public void registerPatient(patient patient) {
        patients.add(patient);
        System.out.println("Patient registered successfully: " + patient.getName());
    }

    public void viewAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients registered.");
        } else {
            System.out.println("List of Patients:");
            for (patient patient : patients) {
                System.out.println(patient);
            }
        }
    }
}
