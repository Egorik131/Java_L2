package oop_hw4_generic.task2;

/*
Задача 2 : Напишите обобщенный метод printArray, который принимает массив любого типа и выводит его элементы на консоль.
В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T.
Затем мы используем цикл for-each, чтобы пройти по всем элементам массива и вывести их на консоль.
В методе main мы создаем массивы типов Integer и String и вызываем printArray для каждого из них.
В результате мы получаем вывод на консоль элементов каждого массива.
Таким образом, обобщенные методы позволяют нам создавать код, который может работать с разными типами данных,
обеспечивая повторное использование и гибкость.
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
