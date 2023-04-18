package CalculatorApp;

import java.util.*;

public class CalApp {
    public static void main(String[] args) {
        BehindTheScene brain = new BehindTheScene();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value to calculate \n");
        int a = input.nextInt();
        System.out.println("Enter the second value to calculate \n");
        int b = input.nextInt();
        System.out.println("Select the operation you want to perform");
        System.out.println(" 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 5.Exit");
        int operation = input.nextInt();
        switch (operation) {
            case 1:
                brain.addition(a, b);
                break;
            case 2:
                brain.substraction(a, b);
                break;
            case 3:
                brain.multiplication(a, b);
                break;
            case 4:
                if (b != 0) {
                    brain.division(a, b);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            case 5:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}