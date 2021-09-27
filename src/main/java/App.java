/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        Scanner scanner = new Scanner(System.in);
        int gender = scanner.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        int ounces = scanner.nextInt();

        System.out.print("What is your weight, in pounds? ");
        int pounds = scanner.nextInt();

        System.out.print("How many hours has it been since your last drink? ");

        int hours = scanner.nextInt();

        double BAC = 1;

        if(gender==1)
        {
            BAC = ((ounces * 5.14 / pounds * 0.73) - (.015 * hours));
            System.out.printf("Your BAC is %.6f\n", BAC);
        }
        else if(gender==2)
        {
            BAC = ((ounces * 5.14 / pounds * 0.66) - (.015 * hours));
            System.out.printf("Your BAC is %.6f\n", BAC);
        }

        if(BAC <= 0.08)
        {
            System.out.print("It is legal for you to drive.");
        }
        else
        {
            System.out.print("It is not legal for you to drive.");
        }

        scanner.close();
    }
}