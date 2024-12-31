package com.example.healthcare;
import java.util.Scanner;

public class ConsoleHealthcareManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to HealthCare Management System");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter your name: ");
                String name = scanner.next();
                System.out.println("Enter your email: ");
                String email = scanner.next();
                System.out.println("Registration Successful! Welcome, " + name);
                break;
            case 2:
                System.out.println("Enter your email: ");
                String loginEmail = scanner.next();
                System.out.println("Enter your password: ");
                String password = scanner.next();
                System.out.println("Login Successful!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        scanner.close();
    }
}
