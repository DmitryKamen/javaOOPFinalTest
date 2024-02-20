package javaOOPFinalTest.view;

public interface Printer {
    
    default void printRes(String arg ,double value) {
        System.out.println( "Result " + arg + "= " + value);
    }
    
}
