package oop_hw4_gen;

public class Main {
    public static void main(String[] args) {
        printElement(13);
        printElement("Egor");
        printElement(13.13);
    }
    public static <T> void printElement(T element){
        System.out.println(element);
    }
}