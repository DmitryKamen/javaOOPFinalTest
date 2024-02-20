package javaOOPFinalTest.model.operations;

import javaOOPFinalTest.model.ComplexNum;
import javaOOPFinalTest.model.Operation;

public class Division extends Operation {

    public Division(ComplexNum value1, ComplexNum value2) {
        super(value1, value2);
    }

    @Override
    public ComplexNum operation() {
        if (value2.getReal() == 0 && value1.getImaginary() == 0) {
            throw new RuntimeException(" Делить на ноль нельзя");
        }

        double denominator = value2.getReal() * value2.getReal() + value2.getImaginary() * value2.getImaginary();
        double realPart = (value1.getReal() * value2.getReal() + value1.getImaginary() * value2.getImaginary()) / denominator;
        double imagPart = (value1.getImaginary() * value2.getReal() - value1.getReal() * value2.getImaginary()) / denominator;
        return new ComplexNum(realPart, imagPart);
    }
    }

    // @Override
    // public double operation() {
    //     if (value2 == 0) {
    //         System.out.println(" Division is not possible ");
    //         throw new RuntimeException(" Делить на ноль нельзя");
    //     }
    //     return(value1 / value2);
    // }

    
    

