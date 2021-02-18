package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;
        int maxCounter = 10;
        int currentCounter = 0;
        while(currentCounter < maxCounter) {
            System.out.println("Enter Number: ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                if(first){
                    first = false;
                    min = number;
                    max = number;
                }
                if(number > max){
                    max = number;
                }

                if(number < min){
                    min = number;
                }


            }else {
               break;
            }
            ++currentCounter;
            scanner.nextLine();
        }

        System.out.println("min = " + min + ", max = " + max);
        scanner.close();
    }
}
