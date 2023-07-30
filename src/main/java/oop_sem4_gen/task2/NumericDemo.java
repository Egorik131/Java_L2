package oop_sem4_gen.task2;

public class NumericDemo {
    public static void main(String[] args) {
        Numeric<Integer> iObj = new Numeric<>(5);
        System.out.println("Обратная величина iOb: " + iObj.reciprocal());
        System.out.println("Дробная часть iOb: " + iObj.ftact());
        System.out.println("-----".repeat(10));

        Numeric<Double> dObj = new Numeric<>(5.25);
        System.out.println("Обратная величина dOb: " + dObj.reciprocal());
        System.out.println("Дробная часть dOb: " + dObj.ftact());

//        Numeric<String> sObj = new Numeric<>("text"); // так нельзя, т.к. нумерик

    }
}
