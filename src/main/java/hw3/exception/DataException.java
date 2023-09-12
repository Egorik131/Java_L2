package hw3.exception;

public class DataException extends Exception {
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println(String.format("Exception: Неверный формат данных: %s\n", i));
    }
}
