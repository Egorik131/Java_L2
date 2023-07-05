/*
Организовать ввод и хранение данных пользователей. ФИО возраст, пол и выход из режима ввода информации
вывод в формате Фамилия И.О. возраст пол
добавить возможность выхода или вывода списка отсортированного по возрасту!)
*реализовать сортировку по возрасту с использованием индексов
*реализовать сортировку по возрасту и полу с использованием индексов
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Hw_4_050723 {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ArrayList<String> col_lname = new ArrayList<>();
        ArrayList<String> col_fname = new ArrayList<>();
        ArrayList<String> col_patr = new ArrayList<>();
        ArrayList<Integer> col_age = new ArrayList<>();
        ArrayList<Boolean> col_gen = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();
        while (true) {
//            System.out.println("Введите фамилию -> ");
            col_lname.add(scanner.nextLine());
//            System.out.println("Введите имя -> ");
            col_fname.add(scanner.nextLine());
//            System.out.println("Введите отчество -> ");
            col_patr.add(scanner.nextLine());
//            System.out.println("Введите возраст -> ");
            col_age.add(Integer.valueOf(scanner.nextLine()));
//            System.out.println("Введите пол -> ");
            col_gen.add(scanner.nextLine().toLowerCase().contains("ж"));
            id.add(col_age.size() - 1);
            System.out.println("Продолжить ввод да/нет? -> \n");
            String tmp = scanner.nextLine();
            if (tmp.toLowerCase().contains("нет")) break;
        }
        System.out.println("Исходный список:");
        for (int i = 0; i < col_lname.size(); i++) {
            System.out.println(col_lname.get(i) + " " + col_fname.get(i).toUpperCase().charAt(0) + "."
                    + col_patr.get(i).toUpperCase().charAt(0) + "." + " " + col_age.get(i) + " "
                    + (col_gen.get(i) ? "Ж" : "М"));
        }
        System.out.println("Сортировать по возрасту да/нет? -> \n");
        String tmp_1 = scanner.nextLine();
        if (tmp_1.toLowerCase().contains("да")) {
            id.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return col_age.get(o1) - col_age.get(o2);
                }
            });
            System.out.println("Сортировать дополнительно по полу да/нет? -> \n");
            String tmp_2 = scanner.nextLine();
            if (tmp_2.toLowerCase().contains("да")) {
                System.out.println("Список отсортированный по возрасту и полу:");
                for (int i = 0; i < col_gen.size(); i++) {
                    if (!col_gen.get(id.get(i))) {
                        System.out.println(col_lname.get(id.get(i)) + " "
                                + col_fname.get(id.get(i)).toUpperCase().charAt(0) + "."
                                + col_patr.get(id.get(i)).toUpperCase().charAt(0) + "." + " "
                                + col_age.get(id.get(i)) + " "
                                + (col_gen.get(id.get(i)) ? "Ж" : "М"));
                    }
                }
                for (int i = 0; i < col_gen.size(); i++) {
                    if (col_gen.get(id.get(i))) {
                        System.out.println(col_lname.get(id.get(i)) + " "
                                + col_fname.get(id.get(i)).toUpperCase().charAt(0) + "."
                                + col_patr.get(id.get(i)).toUpperCase().charAt(0) + "." + " "
                                + col_age.get(id.get(i)) + " "
                                + (col_gen.get(id.get(i)) ? "Ж" : "М"));
                    }
                }
            } else {
                System.out.println("Список отсортированный по возрасту:");
                for (int i = 0; i < id.size(); i++) {
                    System.out.println(col_lname.get(id.get(i)) + " "
                            + col_fname.get(id.get(i)).toUpperCase().charAt(0) + "."
                            + col_patr.get(id.get(i)).toUpperCase().charAt(0) + "." + " "
                            + col_age.get(id.get(i)) + " "
                            + (col_gen.get(id.get(i)) ? "Ж" : "М"));
                }
            }
        }
    }
}
