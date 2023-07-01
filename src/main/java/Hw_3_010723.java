import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Hw_3_010723 {
    public static void main(String[] args) {
        ArrayList<Integer> number_list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            number_list.add(new Random().nextInt(50));
        }
        System.out.println("Исходный список произвольных чисел.");
        System.out.println(number_list);
        System.out.println("=".repeat(number_list.size() * 4));

        for (int i = 0; i < number_list.size(); i++) {
            if (number_list.get(i) % 2 == 0) {
                number_list.remove(i);
            }
        }
        System.out.println("1. Удаление четных чисел.");
        System.out.println(number_list);
        System.out.println("=".repeat(number_list.size() * 4));

        int min_number = 0;
        int max_number = 0;
        number_list.sort(Comparator.naturalOrder());
        min_number = number_list.get(0);
        max_number = number_list.get(number_list.size() - 1);
        System.out.println("2. Минимальное значение списка без четных значений: " + min_number);
        System.out.println("=".repeat(60));
        System.out.println(("3. Максимальное значение списка без четных значений: " + max_number));
        System.out.println("=".repeat(60));

        int sum_number = 0;
        double avg_number_list = 0;
        for (int i = 0; i < number_list.size(); i++) {
            sum_number += number_list.get(i);
        }
        avg_number_list = (double) sum_number/number_list.size();
        System.out.printf("4. Среднее значение списка произвольных цифр без четных значений: %.2f\n", avg_number_list);
        System.out.println("   в т.ч.:");
        System.out.println("        Сумма значений списка: " + sum_number);
        System.out.println("        Количество значений списка: " + number_list.size());
        System.out.println("=".repeat(80));
    }
}
