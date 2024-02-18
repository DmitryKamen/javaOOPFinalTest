package javaOOPFinalTest.view;

import java.util.Scanner;

import javaOOPFinalTest.controller.OperationController;


public class VievProgram implements Printer{

    private Scanner scanner;
    private OperationController controller;

    public VievProgram() {
        scanner = new Scanner(System.in);
        controller = new OperationController();
    }


    public void run() {
        
        while (true){
            System.out.println("Enter the first number: ");
            double value1 = scanner.nextDouble();
            System.out.println("Enter operator (+, -, *, /): ");
            char operation = scanner.next().charAt(0);
            System.out.println("Enter the second number: ");
            double value2 = scanner.nextDouble();
            double result;
            switch (operation){
                case '+':
                    result = controller.addited(value1, value2);
                    System.out.println( " Result Addition = " + result );
                    printRes(result);
                    break;
                case '-':
                    result = controller.substracted(value1, value2);
                    System.out.println( " Result Subtracton = " + result );
                    printRes(result);
                    break;
                case '*':
                    result = controller.multiplicated(value1, value2);
                    System.out.println( " Result Multiplication = " + result );
                    printRes(result);
                    break;
                case '/':
                    result = controller.divised(value1, value2);
                    System.out.println( " Result Division = " + result );
                    printRes(result);
                    break;
                default:
                    System.out.println("Not a correct character");
            }
            System.out.println("Do you want to continue? (Y/N)");
        
        }
    }
}