package oop_sem5_calc;

public class Main {
    public static void main(String[] args) {
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        CalcController controller = new CalcController(model,view);
        controller.select();
    }
}
