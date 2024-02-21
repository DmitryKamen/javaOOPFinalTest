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
            String value1 = scanner.nextLine();
            System.out.println("Enter operator (+, -, *, /): ");
            char operation = scanner.nextLine().charAt(0);
            System.out.println("Enter the second number: ");
            String value2 = scanner.nextLine();
            String result;
            String operator;
            switch (operation){
                case '+':
                    result = controller.addited(value1, value2);
                    operator = "Addition ";
                    printRes(operator,result);
                    break;
                case '-':
                    result = controller.substracted(value1, value2);
                    operator = "Subtracton ";
                    printRes(operator,result);
                    break;
                case '*':
                    result = controller.multiplicated(value1, value2);
                    operator = "Multiplication ";
                    printRes(operator,result);
                    break;
                case '/':
                    result = controller.divised(value1, value2);
                    operator = "Division ";
                    printRes(operator,result);
                    break;
                default:
                    System.out.println("Not a correct character");
            }
            System.out.println("Do you want to continue? (Y/N)");
        
        }
    }
}