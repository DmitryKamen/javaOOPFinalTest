package javaOOPFinalTest.view;

public interface Printer {
    
    default void printRes(double value) {
        System.out.println( "Result = " + value);
    }
    
}
