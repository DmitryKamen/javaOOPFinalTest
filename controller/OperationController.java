package javaOOPFinalTest.controller;



import java.util.concurrent.Flow.Subscription;

import javaOOPFinalTest.model.ComplexNum;
import javaOOPFinalTest.model.Operation;
import javaOOPFinalTest.model.operations.Addition;
import javaOOPFinalTest.model.operations.Division;
import javaOOPFinalTest.model.operations.Multiplication;
import javaOOPFinalTest.model.operations.Subtraction;



public class OperationController {

    private Operation operation;

    public ComplexNum multiplicated(ComplexNum val1, ComplexNum val2) {
        operation = new Multiplication(val1, val2);
        return operation.operation();
    }

    public ComplexNum addited(ComplexNum val1, ComplexNum val2) {
        operation = new Addition(val1, val2);
        return operation.operation();
    }

    public ComplexNum substracted(ComplexNum val1, ComplexNum val2) {
        operation = new Subtraction(val1, val2);
        return operation.operation();
    }

    public ComplexNum divised(ComplexNum val1, ComplexNum val2) {
        operation = new Division(val1, val2);
        return operation.operation();
    }
}
