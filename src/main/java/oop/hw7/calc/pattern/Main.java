package oop.hw7.calc.pattern;

public class Main {

    public static void main(String[] args) {
        CalcMathFunc operator;
        operator = OperationFactory.createOperation('/');
        operator.value1 = 3;
        operator.value2 = 4;
        System.out.println(operator.getResult());
    }
}