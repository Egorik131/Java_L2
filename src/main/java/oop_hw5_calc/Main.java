package oop_hw5_calc;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляров модели, представления и презентера
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        CalcPresenter presenter = new CalcPresenter(model, view);

        // Обработка действия пользователя
        presenter.select();
    }
}
