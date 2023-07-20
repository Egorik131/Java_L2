package Java_intro;

import java.util.ArrayList;

public class Sem_6_hashSet {


    public static void main(String[] args) {
        MyMap<Integer> myMap = new MyMap<>();
        System.out.println(myMap.add(4165));
        System.out.println(myMap.add(4165));
        System.out.println(myMap.add(null));
        System.out.println(myMap.add(41655));
        myMap.print();
        System.out.println(myMap.remove(null));
        System.out.println(myMap.remove(4165));
        myMap.print();
    }
}

class MyMap<Integer> {

    ArrayList<Integer> val = new ArrayList<>();

    public boolean add(Integer value) {
        if (val.contains(value)) return false;
        val.add(value);
        return true;
    }

    public boolean remove(Integer value) {
        if (val.contains(value)) {
            val.remove(value);
            return true;
        }
        return true;
    }

    public void print(){
        System.out.println(val.toString());
    }

}