package javaOOPFinalTest.model.operations;

import javaOOPFinalTest.model.ForHelpSerch;
import javaOOPFinalTest.model.Operation;

public class Division extends Operation implements ForHelpSerch {

    public Division(String value1, String value2) {
        super(value1, value2);
    }

    @Override
    public String operation() {
        double res;
        if (replaseDouble(value2) == 0) 
            throw new RuntimeException(" Делить на ноль нельзя ");


        else if(isComplex(value1) == true && isComplex(value2) == true) {
            res = replaseDouble(value1) / replaseDouble(value2);
            return "" + res;
        }
        else if (isComplex(value1) == true && isComplex(value2) == false){
            res = replaseDouble(value1) / replaseDouble(value2);
            return res + "i";
        }
        else if (isComplex(value1) == false && isComplex(value2) == true){
            res = replaseDouble(value1) / replaseDouble(value2);
            return "-" + res + "i";
        }
        else if (isComplex(value1) == false && isComplex(value2) == false) {
            res = replaseDouble(value1) / replaseDouble(value2);
            return res + "";
        }
        else return null;
    } 
}


    
    

