package javaOOPFinalTest.model;

public interface ForHelpSerch {

    default double replaseDouble(String value) {
        return (Double.parseDouble(value.replace("i", "")));
    }

    default boolean isComplex(String value) {
        return value.indexOf('i') > -1;
    }
}