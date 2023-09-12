package hw3.exception;

import java.util.Scanner;

public class InputData extends MessageError {
    public String[] inputData() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите латиницей в строку данные, разделенные пробелом (ФИО, дата рождения, номер телефона, пол (f или m):\n" +
                "Пример ввода: Ivanov Ivan Ivanovich 12.12.2000 4951112233 m");
        while (true) {
            String data = iScanner.nextLine();
            String[] arrInfo = data.split(" ");
            if (arrInfo.length == 6) {
                return arrInfo;
            } else if (arrInfo.length < 6) {
                String err = "001";
                messageError(err);
            } else {
                String err = "002";
                messageError(err);
            }
        }
    }
}
