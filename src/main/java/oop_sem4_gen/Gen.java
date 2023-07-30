package oop_sem4_gen;

public class Gen <T, V> { // <> чтобы сделать класс обобщенным
    private T ob; // объявить объект типа Т
    private V ob2; // объявить объект типа V

    public Gen(T ob, V ob2) {
        this.ob = ob;
        this.ob2 = ob2;
    }

    public T getOb() {
        return ob;
    }

    public V getOb2() {
        return ob2;
    }

    void showType(){
        System.out.println("Тип T это " + ob.getClass().getName());
        System.out.println("Тип V это " + ob2.getClass().getName());
    }
}
