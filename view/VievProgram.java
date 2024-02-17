package javaOOPFinalTest.view;

import java.util.Scanner;

import javaOOPFinalTest.controller.OperationController;
import javaOOPFinalTest.model.Operation;

public class VievProgram {

    private final OperationController controller;

    public VievProgram(OperationController controller) {
        this.controller = controller;
    }

    Scanner scanner = new Scanner(System.in);
    // Calculator calculator = new Calculator(2);
    // System.out.println("Enter the first number: ");
    double value1 = scanner.nextDouble();
    // System.out.println("Enter operator (+, -, *, /): ");
    char operation = scanner.next().charAt(0);
    // System.out.println("Enter the second number: ");
    double value2 = scanner.nextDouble();
    
    while (true){
        switch (operation){
            case '+':
                
                break;
            case '-':
                
                break;
            case '*':
                controller.multiplicated(value1, value2);
                break;
            case '/':
                
                break;
            default:
                System.out.println("Not a correct character");
        }
        System.out.println("Do you want to continue? (Y/N)");
    
    }
}
