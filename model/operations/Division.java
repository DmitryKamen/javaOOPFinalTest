package javaOOPFinalTest.model.operations;

import javaOOPFinalTest.model.Operation;

public class Division extends Operation {

    public Division(double value1, double value2) {
        super(value1, value2);
    }

    @Override
    public double operation() {
        if (value2 == 0) {
            System.out.println(" Division is not possible ");
            return -1;
        }
        return(value1 / value2);
    }
    
}
