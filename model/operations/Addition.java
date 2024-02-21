package javaOOPFinalTest.model.operations;

import javaOOPFinalTest.model.ForHelpSerch;
import javaOOPFinalTest.model.Operation;

public class Addition extends Operation implements ForHelpSerch{
    
    public Addition(String value1, String value2) {
        super(value1, value2);
    }

    @Override
    public String operation() {
        double res;
        if(isComplex(value1) == true && isComplex(value2) == true) {
            res = replaseDouble(value1) + replaseDouble(value2);
            return res + "i";
        }
        else if (isComplex(value1) == true && isComplex(value2) == false)
        return replaseDouble(value2) + " + " + value1;
        else if (isComplex(value1) == false && isComplex(value2) == true)
        return replaseDouble(value1) + " + " + value2;
        else if (isComplex(value1) == false && isComplex(value2) == false){
            res = replaseDouble(value1) + replaseDouble(value2);
            return res + "";
        }
        else return null;
    }
}