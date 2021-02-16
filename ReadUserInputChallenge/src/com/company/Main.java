package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Gather 10 numbers from the user and output the sum
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while(counter < 10){
            int order = counter + 1;
            System.out.println("Enter number #" + order);

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;
                counter++;
            }else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        System.out.println("Total of all numbers: " + sum);
        scanner.close();
    }
}
