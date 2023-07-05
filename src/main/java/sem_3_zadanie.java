//Создать два списка с обобщением Integer
//Заполнить случайными числами
//Удалить из первого списка элементы кратные соответствующим по индексу элементам второго списка

import java.util.ArrayList;
import java.util.Random;

public class sem_3_zadanie {
    public static void main(String[] args) {

        ArrayList<Integer> integers10 = new ArrayList<>();
        ArrayList<Integer> integers20 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers10.add(new Random().nextInt(50)+1);
            integers20.add(new Random().nextInt(50)+1);
        }
        System.out.println(integers10);
        System.out.println(integers20);
        System.out.println("=".repeat(20));
    }

//    ArrayList<Integer> temp = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//        if (integers10.get(i) % integers20.get(i) == 0) {
//            temp.add(integers10.get(i));
//        }
//    }
//        integers1.removeAll(temp);
//        System.out.println(integers1);
//    }

}

//
//        import java.util.ArrayList;
//        import java.util.Iterator;
//        import java.util.Random;
//
//public class Program01 {
//    public static void main(String[] args) {
//        ArrayList<Integer> integers1 = new ArrayList<>();
//        ArrayList<Integer> integers2 = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            integers1.add(new Random().nextInt(50) + 1);
//            integers2.add(new Random().nextInt(3) + 1);
//        }
//        System.out.println(integers1);
//        System.out.println(integers2);
//        System.out.println("-".repeat(20));
//
//        ArrayList<Integer> temp = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            if (integers1.get(i) % integers2.get(i) == 0) {
//                temp.add(integers1.get(i));
//            }
//        }
//        integers1.removeAll(temp);
//        System.out.println(integers1);
//    }

