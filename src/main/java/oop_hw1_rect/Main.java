package oop_hw1_rect;
/*
Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height).
Класс должен обладать следующими методами:

Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
 */



public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(5);
        System.out.println(rectangle.calculateArea(rectangle));
        System.out.println(rectangle.calculatePerimeter(rectangle));
    }
}
