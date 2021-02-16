package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth; //Obviously not accurate but working on user input via scanner
            if (age >= 0 && age <= 120) {
                System.out.println("Your name is " + name + ", and your age is " + age + ".");
            } else {
                System.out.println("Age is out of range.");
            }
        } else {
            System.out.println("Please enter a valid year for your birth.");
        }


        scanner.close();
    }
}
