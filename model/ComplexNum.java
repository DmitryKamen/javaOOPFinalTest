package javaOOPFinalTest.model;

public class ComplexNum {

    private double realNum;
    private double imag;

    public ComplexNum(double realNum, double imag) {
        this.realNum = realNum;
        this.imag = imag;
    }

    public double getReal() {
        return realNum;
    }

    public double getImaginary() {
        return imag;
    }

    @Override
    public String toString() {if (imag >= 0) {
        return realNum + " + " + imag + "i";
    } else {
        return realNum + " - " + (-imag) + "i";
    }
}
    
}
