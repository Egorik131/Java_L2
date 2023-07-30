package java_intro;

import java.util.Random;
import java.util.Scanner;

public class Sem_1_java {
    int gh = 5;


    public static void main(String[] args) {

        int[] ints = new int[5]; // одномерный массив  ints - ссылка в памяти
        ints[3] = 2;
        int[] tmp = new int[ints.length+1];
        ints = tmp;

        if (true) {

        }else {
        }
        int a = 0;
        for (int i=0 ; i<10; i++) {
            a += i;
        }
        System.out.println(a);

        int b = 0;
        for (int i=0 ; i<10; i++, b+= i);
        System.out.println(b);

        while (a>0) {
            a--;
        }

        do {
            a--;
        } while (a<-7);


        Integer integer = 5;
        System.out.println(Integer.toBinaryString(2));
// возвращает строку

        byte aByte = 2;
        short aShort = 67;
        char aChat = 'f';
        int aInt = 5;
        float aFloat = .47f;
        long aLong = 12;
        double aDouble = 0.125;

        aShort = aByte;
//        aByte = (byte) aShort; // так плохо!)
//        aInt = (int) Float;





        String str = "Hello";
        System.out.println("!".repeat(12));  // "!" - Это объект. Срока.;
        System.out.printf("%s", str + "\n");
        System.out.println(new Random().nextInt(1000));


        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        String s = scanner.nextLine();

    }
}

