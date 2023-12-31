package oop.hw6.calc.solid;

public class Main {

    public static void main(String[] args) {
        // Создание экземпляров модели, представления и презентера

        CalcMathFunc model = new CalcMathFunc();
        CalcView view = new CalcView();
        CalcPresenter presenter = new CalcPresenter(model, view);

        // Обработка действия пользователя
        presenter.select();
    }
}
