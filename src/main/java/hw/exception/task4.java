/* Задание 4
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
* */

package hw.exception;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        try {
            String input = stringInput("Введите строку: ");
            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя!");
            }
            System.out.println("Вы ввели следующую строку: " + input);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Перезапустите программу и попробуйте еще раз :-)");
        }
    }

    public static String stringInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
}
