package javaOOPFinalTest.model;

public abstract class Operation {
    protected String value1;
    protected String value2;

    protected Operation(String value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public abstract String operation();

    
}
