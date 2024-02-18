package javaOOPFinalTest.controller;



import java.util.concurrent.Flow.Subscription;

import javaOOPFinalTest.model.Operation;
import javaOOPFinalTest.model.operations.Addition;
import javaOOPFinalTest.model.operations.Division;
import javaOOPFinalTest.model.operations.Multiplication;
import javaOOPFinalTest.model.operations.Subtraction;



public class OperationController {

    private Operation operation;

    public double multiplicated(double val1, double val2) {
        operation = new Multiplication(val1, val2);
        return operation.operation();
    }

    public double addited(double val1, double val2) {
        operation = new Addition(val1, val2);
        return operation.operation();
    }

    public double substracted(double val1, double val2) {
        operation = new Subtraction(val1, val2);
        return operation.operation();
    }

    public double divised(double val1, double val2) {
        operation = new Division(val1, val2);
        return operation.operation();
    }
}
