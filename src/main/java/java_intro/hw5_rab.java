package java_intro;

public class hw5_rab {


    /*
Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов.
 */


//import java.util.*;
//
//
//    public class Java_intro.Hw_5_140723 {
//
//        static Scanner scanner;
//
//        public static void main(String[] args) {
//
//            scanner = new Scanner(System.in);
//            HashMap<String, ArrayList<Integer>> tel_book = new HashMap<>();
//            while (true) {
//                System.out.println("Введите ФИО: ");
//                String fio_book = scanner.nextLine();
//                System.out.println("Введите номер телефона: ");
//                int tel_number = scanner.nextInt();
//                if (tel_book.containsKey(fio_book)) {
//                    tel_book.get(fio_book).add(tel_number);
//                } else {
//                    ArrayList<Integer> tel_list = new ArrayList<>(1);
//                    tel_list.add(tel_number);
//                    tel_book.put(fio_book, tel_list);
//                }
//                System.out.println(tel_book);
//                System.out.println("Продолжить ввод да/нет? -> \n");
//                String tmp = scanner.nextLine();
//                if (tmp.toLowerCase().contains("н")) break;
//                String flag = scanner.nextLine();
//                if (flag.toLowerCase().contains("n")) break;
//            }
//            System.out.println("Телефонная книга в исходном виде:");
//            System.out.println(tel_book);
//            System.out.println();
//
//
//            ArrayList<Integer> q_tel = new ArrayList<>();
//            if (tel_book.size() > 1) {
////            for (ArrayList<Integer> array : tel_book.values()) {
//////                System.out.println(array.size());
////                q_tel.add(array.size());
////                Collections.sort(q_tel);
////            }
//                System.out.println("Вывод телефонной книги в порядке убывания количества телефонов:");
//                tel_book
//                        .entrySet()
//                        .stream()
//                        .sorted(Map.Entry.comparingByValue((o1, o2) -> o2.size() - o1.size()))
//                        .forEach(System.out::println);
////            System.out.println(tel_book);
//
//
//
////
////            for (int i = 0; i < q_tel.size(); i++) {
////                for (ArrayList<Integer> array : tel_book.values()) {
//////                    System.out.println(array.size());
//////                    System.out.println(q_tel.get(i));
////                    if (array.size() == q_tel.get(i)) {
////                        System.out.println(tel_book.get(i));
////                        tel_book.forEach((key, value) -> System.out.println(key + " " + value));
////                    }
////                }
////            }
//
////            System.out.println();
////            System.out.println(q_tel);
//            } else {
//                System.out.println(tel_book);
//            }
//        }
//    }

}
