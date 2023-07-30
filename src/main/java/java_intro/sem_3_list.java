package java_intro;

import java.util.*;
import java.util.List;

public class sem_3_list {
    public static void main(String[] args) {

        Object object = new Object();
        ArrayList<String> list = new ArrayList<>();// практический лист из пайтен
        ArrayList<String> list2 = new ArrayList<>();
        list.add("HI!"); //добавляет в конец списка индекс 0
        list.add("Как дела"); // индекс 1
        list.add(0, "xxx"); //вставить на 0, и весь массив сдвигается
        System.out.println(list);
        //ссылка на массив весит 4 байта
        list2.addAll(list); // добавляется в конец
        list2.addAll(2, list); // c какого индекса добавить
        System.out.println(list.get(1));
        list.size(); // количество элементов
//        list.clear(); // почистить список
        list.remove(1); //удаление по индексу
        list.remove("Привет!"); //если объект найден, то будет удален
        list.set(1, "New"); //не смещает массив, только изменяет
        list.indexOf("Hi");//ищет индекс элемента
        list.lastIndexOf("Hi");//ищет индекс элемента с конца
        if (!list.contains("hi")) {
            list.add("New");
        }
        ; // возвращает истину если найдено
        System.out.println(list.subList(1, list2.size() / 2)); //индексы элементов делаем подстроку

        list.ensureCapacity(123); //если емкость массива меньше 123 элементов можно его вызвать
        list.trimToSize();//обрезает массив до минимально используемого объема.
        list.isEmpty(); // можно проверить size==0;

//        ArrayList<Integer> ilist = new ArrayList<>(); // нет автоинициализации, те сразу ввести цифры
        List<Integer> iList = List.of(1, 2, 3, 5, 2);
//        ArrayList<Integer> integers = Arrays.asList(1, 2, 3, 4);

        ArrayList<Integer> integers1 = new ArrayList<>();
        ArrayList<Integer> integers2 = new ArrayList<>();


        System.out.println();
        for (int i = 0; i < 10; i++) {
            integers1.add(new Random().nextInt(50));
            integers2.add(new Random().nextInt(50));
        }
        System.out.println(integers1);
        System.out.println(integers2);
        System.out.println("-".repeat(16));

        integers1.removeAll(integers2);//из первого списка удаляет все элементы
//        integers1.retainAll(integers2);
        integers1.addAll(integers2);
        System.out.println(integers1);

        integers1.sort(Comparator.naturalOrder());//в порядке увеличения
        System.out.println(integers1);
        integers1.sort(Comparator.reverseOrder());//в обратном порядке
        System.out.println(integers1);

        integers1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                if (o1 % 3 !=0) return 1;
//                if (o2 % 2 !=0) return -2;
//                return 0; // три строчки придуманы наугад, сортировка фиг знает какая ;-)
                return o2 - o1; // если от 1 -2 то по увеличению, можно сюда закладывать свои условия
            }
        });
        System.out.println(integers1);


        integers1.sort((o1, o2) -> { //лямбда выражение соращенная запись через стрелку что делаем
            if (o1 == 1) return 0;
            return o2 - o1;
        });
        System.out.println(integers1);

        integers2.sort(Comparator.naturalOrder());
        System.out.println(integers2);

//        for (int i = 0; i < integers1.size(); i++) {
//            integers1.get(i);
//        }
//
//        for (int i : integers1) { // пробегаемся по списку
//            System.out.println(i);
//
//            Iterator<Integer> iterator = integers1.iterator();
//            while (iterator.hasNext()) {//проверяем следующией элемент
//                int i = iterator.next(); // если есть следующий элемет ести
//                iterator.remove(); //удалить элемент не только из итератора, а из эжлемента оснвного
//                // итератор это маассив ссылкок
//            }

//            ListIterator<Integer> iterator2 = integers1.ListIterator(integers1):
//            while (iterator.hasPrevios()) {
//                int i = iterator2.previous();
//                int index = iterator2.previousIndex();
//                iterator2.remove();
//                iterator2.add(4);
//                iterator2.set(2);
//            }
//            integers1.forEach(n -> System.out.println(n)); //пробегает по всем элементам, только читает
//        }
    }
}
