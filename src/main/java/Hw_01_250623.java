import java.util.Random;
import java.util.Scanner;

/**
 * 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
 * 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
 * 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
 * 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
 * <p>
 * Пункты реализовать в методе main
 * *Пункты реализовать в разных методах
 * <p>
 * int i = new Random().nextInt(k); //это кидалка случайных чисел!)
 */


public class Hw_01_250623 {

    public static Integer random_num() {
        return new Random().nextInt(2000);
    }

    public static Integer high_bit(int i) {
        return Integer.highestOneBit(i);
    }


    public static void main(String[] args) {


        int i = random_num();
        System.out.println("1. Случайное число в интервале от 0 до 2000: " + i);

        int n = high_bit(i);
        System.out.println("2. Номер старшего значащего бита выпавшего числа i: " + n);


        int count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) count++;
        }
        System.out.println("3. Длинная массива m1 (кол-во кратных числе): " + count);

        int[] m1 = new int[count];
        count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[count] = j;
                count++;
            }
        }

        count = 0;
        for (int j = i; j > Short.MIN_VALUE; j--) {
            if (j % n != 0) count++;
        }
        System.out.println("4. Длинная массива m2 (кол-во не кратных числе): " + count);

        int[] m2 = new int[count];
        count = 0;
        for (int j = i; j > Short.MIN_VALUE; j--) {
            if (j % n != 0) {
                m2[count] = j;
                count++;
            }
        }

    }
}
