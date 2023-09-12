package hw3.exception;

public class MessageError {

    public void messageError(String err) {
        switch (err) {
            case "001":
                System.out.println(String.format("Код ошибки %s: Вы ввели не все данные!\nВведите строку еще раз:", err));
                break;
            case "002":
                System.out.println(String.format("Код ошибки %s: Вы ввели избыточные данные!\nВведите строку еще раз:", err));
                break;
            default:
                System.out.println(String.format("Код ошибки %s: Нерегламентированная ошибка\n", err));
                break;
        }
    }
}