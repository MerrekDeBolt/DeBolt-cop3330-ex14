package org.example;

/*
 *  UCF COP3330 Fall 2021 Exercise 14 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        String input, state;
        double taxRate = 0.055, tax = 0, total;
        int orderAmount;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the order amount? ");
        input = scanner.nextLine();
        orderAmount = Integer.parseInt(input);

        System.out.println("What is the state? ");
        state = scanner.nextLine();

        total = orderAmount;

        if (state.equals("WI"))
        {
            tax = orderAmount * taxRate;
            total = orderAmount + tax;
        }

        System.out.println("The tax is $" + String.format("%.2f", tax) + ".\nThe total is $" + String.format("%.2f", total) + ".");
    }
}