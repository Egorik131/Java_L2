package sem_2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Test textObj = new Test();
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + textObj.getNext());
        }
        System.out.println("Сброс!");
        textObj.reset();

        System.out.println("Начальное значение 100");
        textObj.setStart(100);

        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + textObj.getNext());
        }

        System.out.println("____".repeat(20));


        Test_2 textObj_2 = new Test_2();
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + textObj_2.getNext());
        }
        System.out.println("Сброс!");
        textObj_2.reset();

        System.out.println("Начальное значение 200");
        textObj_2.setStart(200);

        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + textObj_2.getNext());
        }

    }

}
