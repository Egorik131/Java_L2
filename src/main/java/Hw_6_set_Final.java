/*
Разработать программу, имитирующую поведение коллекции HashSet.
В программе создать
- метод add добавляющий элемент,
- метод toString возвращающий строку с элементами множества
*и
- метод позволяющий читать элементы по индексу.
*Реализовать все методы из семинара.
Формат данных Integer.
 */

import java.util.*;

public class Hw_6_set_Final {

    public static void main(String[] args) {

        MyHashSet<Integer> myHashSet = new MyHashSet<>();

        System.out.println(myHashSet.add(23123));
        System.out.println(myHashSet.add(23123));
        System.out.println(myHashSet.add(312));
        System.out.println(myHashSet.add(null));
        System.out.println(myHashSet.add(123123));
        System.out.println(myHashSet);
        System.out.println(myHashSet.remove(null));
        System.out.println(myHashSet.remove(23123));
        System.out.println(myHashSet);

        Iterator<Integer> myIter = myHashSet.iterator();
        while (myIter.hasNext()) {
            System.out.printf("%d ", myIter.next());
        }
        int ans = myHashSet.index();
        if (ans == -1) {
            System.out.println("Запрошенный элемент отсутствует");
        }else{
            System.out.printf("Элемент %d соответствует запрошенному индексу",  ans);
        }
    }
}

class MyHashSet<T> {

    private HashMap<T, Object> map = new HashMap<>();
    private static final Object myObj = new Object();

    public boolean add(T value) {
        return map.put(value, myObj) == null;
    }

    public boolean remove(T value) {
        return map.remove(value) == myObj;
    }

    public String toString() {
        return map.keySet().toString();
    }

    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }

    public Scanner scanner;

    public Integer index() {
        scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите индекс элемента: ");
        int myIndex = scanner.nextInt();
        int result = -1;
        ArrayList<Integer> myKey = new ArrayList<Integer>((Collection<? extends Integer>) map.keySet());
        for (int i = 0; i < myKey.size(); i++) {
            if (myIndex == i)
                result = myKey.get(i);
        }
        return result;
   }
}