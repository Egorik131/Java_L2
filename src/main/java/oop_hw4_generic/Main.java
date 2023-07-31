package oop_hw4_generic;

/*
Задача 1 : Напишите обобщенный метод printElement, который принимает один параметр типа T и выводит его на консоль.
В этом примере мы объявляем обобщенный метод printElement, который принимает один параметр типа T.
Мы просто выводим этот элемент на консоль с помощью метода System.out.println().
В методе main мы вызываем printElement с различными типами данных:
целое число (Integer), строку (String) и число с плавающей запятой (Double).
Компилятор автоматически выводит тип параметра T на основе переданных аргументов.
Таким образом, обобщенные методы позволяют нам писать код, который может работать с различными типами данных,
обеспечивая простоту и гибкость использования.
 */
public class Main {

    public static void main(String[] args) {
        Gen<Integer> integerGen = new Gen<>(13);
        integerGen.printElement();

        System.out.println("-----".repeat(10));

        Gen<String> stringGen = new Gen<>("Строчный элемент");
        stringGen.printElement();

        System.out.println("-----".repeat(10));

        Gen<Double> doubleGenGen = new Gen<>(13.13);
        doubleGenGen.printElement();
    }
}
