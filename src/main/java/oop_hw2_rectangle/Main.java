package oop_hw2_rectangle;
/*
Добавить пять интерфейсов к классам из ДЗ 1, включающих все концепции, упомянутые на семинаре. включающих:
- интерфейсы,
- константы,
- default методы,
- перегрузки и переопределения методов.
Вы можете выбрать любой класс из ДЗ 1 и добавить к нему интерфейсы.
Вам также предоставляется возможность добавить новые методы или использовать уже существующие методы в классе.

Уточнить, какой именно класс выбрали для задачи 1, если решаете ее.
 */

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(2);
        System.out.println(rectangle.calcArea(rectangle));
        System.out.println(rectangle.calcPerimeter(rectangle));
        System.out.println(rectangle.message_1());
    }
}
