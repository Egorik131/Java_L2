// Задание 2

package hw.exception;

public class task2 {

    public static void main(String[] args) {

        int[] intArray = {1, 5, 3, 5, 6, 7, 8,8,4,3,6};

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}




