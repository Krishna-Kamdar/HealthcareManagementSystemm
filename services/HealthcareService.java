package com.example.healthcare.services;

import com.example.healthcare.models.patient;

import java.util.Scanner;

public class HealthcareService {
    private final PatientService patientService = new PatientService();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- HealthCare Management System ---");
            System.out.println("1. Register Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerPatient(scanner);
                    break;
                case 2:
                    patientService.viewAllPatients();
                    break;
                case 3:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private void registerPatient(Scanner scanner) {
        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Contact Info: ");
        String contactInfo = scanner.nextLine();

        patient patient = new patient(id, name, contactInfo);
        patientService.registerPatient(patient);
    }
}
