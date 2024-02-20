package javaOOPFinalTest.model.operations;

import javaOOPFinalTest.model.ComplexNum;
import javaOOPFinalTest.model.Operation;

public class Multiplication extends Operation {

    public Multiplication(ComplexNum value1, ComplexNum value2) {
        super(value1, value2);
    }
    @Override
    public ComplexNum operation() {
        double realPart = value1.getReal() * value2.getReal() - value1.getImaginary() * value2.getImaginary();
        double imagPart = value1.getReal() * value2.getImaginary() + value1.getImaginary() * value2.getReal();
        return new ComplexNum(realPart, imagPart);
    }


    // public Multiplication(double value1, double value2) {
    //     super(value1, value2);
    // }

    // @Override
    // public double operation() {
    //     return (value1 * value2);  
    // }
}
