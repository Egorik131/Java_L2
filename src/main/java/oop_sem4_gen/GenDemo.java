package oop_sem4_gen;

public class GenDemo {
    public static void main(String[] args) {
//        Gen<Integer> integerGen;
//        integerGen = new Gen<Integer>(88);
//        integerGen.showType();
//        int v = integerGen.getOb();
//        System.out.println("Значение: " + v);
//        System.out.println("-----".repeat(20));
//
//        Gen<String> stringGen;
//        stringGen = new Gen<String>("Сообщение");
//        stringGen.showType();
//        String str = stringGen.getOb();
//        System.out.println("Значение: " + str);
    Gen<Integer,String> myObj = new Gen<>(88, "Обобщение!.");
    myObj.showType();
    int v = myObj.getOb();
    System.out.println("Значение: " + v);
    String str = myObj.getOb2();
    System.out.println("Значение: " + str);



    }
}
