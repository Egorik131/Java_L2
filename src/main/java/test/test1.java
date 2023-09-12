package test;

class Answer {
    public static void arrayOutOfBoundsException() {
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

    }

    public static void divisionByZero() {
        try {
            int a = 13;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }
    }

    public static void numberFormatException() {
        try {
            String numberString = "abc";
            int number = Integer.parseInt(numberString);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}

class Print {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}


/*
class Answer {
    public static void arrayOutOfBoundsException() {
        int[] array = new int[10];
        System.out.println(array[11]); // Выход за пределы массива
    }

    public static void divisionByZero() {
        int a = 1;
        int b = 0;
        int c = a / b; // Деление на ноль
    }

    public static void numberFormatException() {
        String str = "abc";
        int num = Integer.parseInt(str); // Ошибка преобразования строки в число
    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}

 */