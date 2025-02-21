package CalculatorBasic;

public class Calculator {
    public static Double add( Double a,Double b){
return a+b;
    }

    public static Double subtract( Double a,Double b){
        return a-b;

    }
    public static Double multiply(Double a,Double b){
        return a*b;

    }
    public static Double divide(Double a,Double b){
        if(b==0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a/b;

    }

}
