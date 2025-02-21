package CalculatorWithOOP;

import java.util.HashMap;
import java.util.Map;


public class Calculator {

    private final Map<Character, Operations> operationsMap;


    public Calculator() {
        operationsMap = new HashMap<>();
        operationsMap.put('+', new OperationsClasses.Addition());
        operationsMap.put('-', new OperationsClasses.Subtraction());
        operationsMap.put('*', new OperationsClasses.Multiplication());
        operationsMap.put('/', new OperationsClasses.Division());

    }

    public Double calculate(char operator, Double a, Double b) {
        Operations operation = operationsMap.get(operator);
        if (operation == null) {
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }
        return operation.apply(a, b);
    }
}

