/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */
package org.example;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();

        app.processInterest(scanner);
    }

    private void processInterest(Scanner scanner) {
        float principle;
        float interest;
        int years;
        float total;

        System.out.println("Enter the principal:");
        principle = Float.parseFloat(scanner.nextLine());

        System.out.println("Enter the rate of interest:");
        interest = Float.parseFloat(scanner.nextLine());

        System.out.println("Enter the number of years:");
        years = Integer.parseInt(scanner.nextLine());

        total = (principle * (1 + years * interest * 0.01f));
        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f.", years, interest, total);

    }
}
