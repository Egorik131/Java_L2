package oop_hw4_gen.task2;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] stringArray = {"a", "b", "c"};

        printArray(intArray);
        printArray(stringArray);
    }

    public static <T> void printArray(T[] array) {
        System.out.print("Массив: ");
        for (T i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
