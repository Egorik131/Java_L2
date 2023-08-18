package oop.hw7.calc.pattern;

import java.util.Scanner;


public class CalcView {
    Scanner scanner = new Scanner(System.in);

    public double getUserInput() {

        System.out.print("Введите число: ");
        double input = scanner.nextDouble();
        return input;
    }

    public void displayResult(double value) {
        System.out.println("Результат: " + value);
    }

    public char chooseOperation() {
        System.out.println("Введите операцию (+, -, /, *): ");
        return scanner.next().charAt(0); //
    }
}
