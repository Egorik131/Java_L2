package hw3.exception;

public class DateException extends Exception {
    public DateException() {
    }

    public void dataException(String i) {
        System.out.println(String.format("Exception: Неверный формат даты: %s\n", i));
    }
}
