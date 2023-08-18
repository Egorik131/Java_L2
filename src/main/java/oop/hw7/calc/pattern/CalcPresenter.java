package oop.hw7.calc.pattern;


public class CalcPresenter {
    private CalcMathFunc model = new CalcMathFunc();
    private CalcView view = new CalcView();

    public CalcPresenter(CalcMathFunc model, CalcView view) {
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
