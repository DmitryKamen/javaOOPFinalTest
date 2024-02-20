package javaOOPFinalTest.model.operations;

import javaOOPFinalTest.model.ComplexNum;
import javaOOPFinalTest.model.Operation;

public class Addition extends Operation{
    
    public Addition(ComplexNum value1, ComplexNum value2) {
        super(value1, value2);
    }

    @Override
    public ComplexNum operation() {
        double realPart = value1.getReal() + value2.getReal();
        double imagPart = value1.getImaginary() + value2.getImaginary();
        return new ComplexNum(realPart, imagPart);
    }
    
    // public Addition(double value1, double value2) {
    //     super(value1, value2);
    // }

    // @Override
    // public double operation() {
    //     return (value1 + value2);
    // }
    
}
