package oop_hw_3_rect_func_int;


public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(2);
        System.out.println(rectangle.calcArea(rectangle));
        System.out.println(rectangle.calcPerimeter(rectangle));
        System.out.println(rectangle.message_1());

        IFuncInt value_1;
        IFuncInt value_2;
        IFuncInt value_3;

        value_1 = (a, b) -> a - b;
        value_2 = (a, b) -> a * b;
        value_3 = (a, b) -> 2 * (a + b);

        System.out.println(value_1.getValue(rectangle.getWidth(), rectangle.getHeight()));
        System.out.println(value_2.getValue(rectangle.getWidth(), rectangle.getHeight()));
        System.out.println(value_3.getValue(rectangle.getWidth(), rectangle.getHeight()));
    }
}
