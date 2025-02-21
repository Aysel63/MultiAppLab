package CalculatorBasic;

import java.util.Scanner;



public class MainCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        Double num1=scanner.nextDouble();
        System.out.println("Enter second number");
        Double num2=scanner.nextDouble();
        System.out.println("Enter operation(+,-,*,/): ");
        char operation = scanner.next().charAt(0);

        Double result;
        switch (operation){
            case '+':
                result =Calculator.add(num1,num2);
                break;
            case '-':
                result=Calculator.subtract(num1,num2);
                break;
            case '*':
                result = Calculator.multiply(num1, num2);
                break;
            case '/':
                result = Calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        System.out.println("Result " + result);



    }
}
