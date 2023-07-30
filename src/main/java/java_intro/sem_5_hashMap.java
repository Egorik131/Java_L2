package java_intro;/*
Создать мапу, обобщение целое число и строка.
1)Заполнить 10 значениями, ключ случайное число от 0 до 1000 а значение, название буквы этого случайного числа.
2) вывести в порядке ввода (вместо hashmap linkedhashmap)
3) вывести в порядке соритровки значений
4) еще одну мапу и из первой мапой удалить ключ значения у которых совпадают ключи есть во второй
 */

import java.util.*;

public class sem_5_hashMap {

    public static HashMap<Integer,String> getNewMap(int size){
        HashMap<Integer,String> newMap = new HashMap<>();

        Object[] iChars = new Object[size];

        for (int i = 0; i < size; i++) {
            int temp = new Random().nextInt(101);
            newMap.put(temp,Character.getName(temp));
        }
        iChars = newMap.values().toArray();
        Arrays.sort(iChars);
        System.out.println(Arrays.toString(iChars));
        for (int i = 0; i < iChars.length; i++) {
            for (Integer j:newMap.keySet()) {
                if(newMap.get(j).equals(iChars[i])){
                    System.out.println(j + " = " + iChars[i]);
                }
            }
        }
        return newMap;
    }

    public static HashMap<Integer,String> compareHashMap(HashMap<Integer,String> map1,HashMap<Integer,String> map2){
        for (int iKey: map2.keySet()) {
            if(map1.containsKey(iKey)){
                map1.remove(iKey);
            }
        }
        return map1;
    }

    public static void main(String[] args) {

        HashMap<Integer,String> map2 = getNewMap(10);

        HashMap<Integer, String> map1 = new HashMap<>(10);
        for (int i = 0; i < 10; i++) {
            int key_map = new Random().nextInt(101);
            map1.put(key_map, Character.getName(key_map));
        }

        map1
                .entrySet()  //при переносе перед точкой, можно добавлять коментарий Заходим внутрь
                .stream() // превращаем в поток
                .sorted(Map.Entry.comparingByValue()) // сортируем по значению
                .forEach(System.out::println); // вывод каждую пару, лямбда выражнеие
//        System.out.println(map1);
//        System.out.println(map2);
//        System.out.println(Character.toString(346));
//        compareHashMap(map1,map2);
//        System.out.println(map1);
    }
}
