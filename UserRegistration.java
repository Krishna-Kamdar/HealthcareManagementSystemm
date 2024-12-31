package com.example.healthcare;
import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Input - Name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty. Please enter a valid name.");
            return; // Exit the program if invalid input
        }

        // User Input - Age
        System.out.println("Enter your age: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Age must be a valid integer.");
            scanner.next(); // Consume the invalid input
        }
        int age = scanner.nextInt();
        if (age < 0 || age > 120) {
            System.out.println("Age should be between 0 and 120. Please enter a valid age.");
            return; // Exit the program if invalid input
        }

        // User Input - Email
        System.out.println("Enter your email: ");
        String email = scanner.next();
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Invalid email format. Please enter a valid email.");
            return; // Exit the program if invalid email
        }

        // Display confirmation message
        System.out.println("\nRegistration successful!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}
