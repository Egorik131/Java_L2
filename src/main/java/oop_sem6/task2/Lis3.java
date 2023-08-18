//package oop_sem6.task2;
//
//public class Lis3 {
//    class Shape {
//        // Общие свойства и методы для всех фигур
//        // ...
//
//        public double getArea() {
//            return 0.0;
//        }
//    }
//
//    class Rectangle extends Shape {
//        private double width;
//        private double height;
//
//        // Конструктор, геттеры и сеттеры
//        // ...
//
//        @Override
//        public double getArea() {
//            return width * height;
//        }
//    }
//
//    class Square extends Shape {
//        private double side;
//
//        // Конструктор, геттеры и сеттеры
//        // ...
//
//        @Override
//        public double getArea() {
//            return side * side;
//        }
//    }
//
//    class Circle extends Shape {
//        private double radius;
//
//        // Конструктор, геттеры и сеттеры
//        // ...
//
//        @Override
//        public double getArea() {
//            return Math.PI * radius * radius;
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Shape rectangle = new Rectangle(5, 10);
//        Shape square = new Square(5);
//        Shape circle = new Circle(3);
//
//        printArea(rectangle);
//        printArea(square);
//        printArea(circle);
//    }
//
//    public static void printArea(Shape shape) {
//        System.out.println("Area: " + shape.getArea());
//    }
//}