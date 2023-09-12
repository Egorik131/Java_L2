package hw3.exception;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println(String.format("Exception: Неверно указан пол (только \"f\" или \"m\"): %s\n", i));
    }
}
