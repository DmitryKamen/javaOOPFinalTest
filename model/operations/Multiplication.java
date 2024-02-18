package javaOOPFinalTest.model.operations;

import javaOOPFinalTest.model.Operation;

public class Multiplication extends Operation {

    public Multiplication(double value1, double value2) {
        super(value1, value2);
    }

    @Override
    public double operation() {
        return (value1 * value2);  
    }
}
