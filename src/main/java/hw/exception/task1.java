/*
Задание 1
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
* */

package hw.exception;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        double number = getDoubleInput("Введите дробное число: ");
        System.out.println("Вы ввели число: " + number);
    }

    public static double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите дробное число.");
            }
        }
    }

}
