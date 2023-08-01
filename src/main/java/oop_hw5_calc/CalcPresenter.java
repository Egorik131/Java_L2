package oop_hw5_calc;

public class CalcPresenter {
    private CalcModel model = new CalcModel();
    private CalcView view = new CalcView();

    public CalcPresenter(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;
    }

    public void select() {
        double number1 = view.getUserInput();
        double number2 = view.getUserInput();
        char ch = view.chooseOperation();
        double result = 0;
        switch (ch) {
            case '+':
                result = model.sum(number1, number2);
                break;
            case '-':
                result = model.sub(number1, number2);
                break;
            case '/':
                result = model.div(number1, number2);
                break;
            case '*':
                result = model.mul(number1, number2);
                break;
            default:
                System.out.println("Введена неверная операция!");
                break;
        }
        view.displayResult(result);
    }
}
