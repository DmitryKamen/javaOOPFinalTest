package javaOOPFinalTest.controller;



import javaOOPFinalTest.model.Operation;
import javaOOPFinalTest.model.operations.Multiplication;



public class OperationController {

    public void multiplicated(double val1, double val2) {
        operation = new Multiplication(val1, val2);
        operation.operation();
    }

    
}
