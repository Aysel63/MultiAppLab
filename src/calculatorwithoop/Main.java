package calculatorwithoop;

public class Main {

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println("5 + 3= "+ calculator.calculate('+',5.0,3.0));
        System.out.println("10 - 4= "+ calculator.calculate('-',10.0,4.0));
        System.out.println("6 * 2= "+ calculator.calculate('*',6.0,2.0));
        System.out.println("8 / 2= "+ calculator.calculate('/',8.0,2.0));

    }
}
