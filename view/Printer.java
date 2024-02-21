package javaOOPFinalTest.view;

public interface Printer {
    
    default void printRes(String arg ,String value) {
        System.out.println( "Result " + arg + "= " + value);
    }   
}
