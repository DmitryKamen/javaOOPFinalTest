package javaOOPFinalTest.controller;

import javaOOPFinalTest.model.Operation;
import javaOOPFinalTest.model.operations.Addition;
import javaOOPFinalTest.model.operations.Division;
import javaOOPFinalTest.model.operations.Multiplication;
import javaOOPFinalTest.model.operations.Subtraction;



public class OperationController {

    private Operation operation;

    public String multiplicated(String val1, String val2) {
        operation = new Multiplication(val1, val2);
        return operation.operation();
    }

    public String addited(String val1, String val2) {
        operation = new Addition(val1, val2);
        return operation.operation();
    }

    public String substracted(String val1, String val2) {
        operation = new Subtraction(val1, val2);
        return operation.operation();
    }

    public String divised(String val1, String val2) {
        operation = new Division(val1, val2);
        return operation.operation();
    }
}
