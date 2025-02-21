package CalculatorWithOOP;

public class OperationsClasses {
    public static class Addition implements Operations {
        @Override
        public Double apply(Double a, Double b) {
            return a + b;
        }
    }

    public static class Subtraction implements Operations {
        @Override
        public Double apply(Double a, Double b) {
            return a - b;
        }
    }

    public static class Multiplication implements Operations {
        @Override
        public Double apply(Double a, Double b) {
            return a * b;
        }
    }

    public static class Division implements Operations {
        @Override
        public Double apply(Double a, Double b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        }
    }

}
