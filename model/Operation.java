package javaOOPFinalTest.model;

public abstract class Operation {
    // protected double value1;
    // protected double value2;
    protected ComplexNum value1;
    protected ComplexNum value2;


    // protected Operation(double value1, double value2) {
    //     this.value1 = value1;
    //     this.value2 = value2;
    // }

    protected Operation(ComplexNum value1, ComplexNum value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public abstract ComplexNum operation();

    
}
