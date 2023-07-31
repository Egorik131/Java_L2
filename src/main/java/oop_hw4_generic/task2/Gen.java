package oop_hw4_generic.task2;

public class Gen<T> {
    public T element;

    public Gen(T element) {
        this.element = element;
    }

    void printElement() {
        System.out.println("Величина составляет: " + element);
    }
}
