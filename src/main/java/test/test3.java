package test;

import java.util.Arrays;

class Answr {
    public int[] divArrays(int[] a, int[] b) {
        int[] c = new int[a.length];
        if (a.length != b.length) {
            c = new int[1];
            c[0] = 0;
        } else {
            for (int i = 0; i < c.length; i++) {
                if (b[i] != 0) {
                    c[i] = a[i] / b[i];
                } else {
                    c[i] = 0; // or handle division by zero error
                }
            }
        }
        return c;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Prntr {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2,-1};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answr ans = new Answr();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}

/*
import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b){
        if(a == null || b == null || a.length != b.length){
            return new int[1]; // нулевой массив длины 1 будет означать различие в длине массивов
        }
        else{
            int[] c = new int[a.length];
            for(int i = 0; i < a.length; i++){
                if (b[i] == 0) throw new RuntimeException("Division by 0");
                else c[i] = a[i] / b[i];
            }
            return c;
        }
    }
}

public class Printer{
    public static void main(String[] args) {
      int[] a = {};
      int[] b = {};

      if (args.length == 0) {
        a = new int[]{12, 8, 16};
        b = new int[]{4, 2, 4};
      }
      else{
        a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
      }

      Answer ans = new Answer();
      String itresume_res = Arrays.toString(ans.divArrays(a, b));
      System.out.println(itresume_res);
    }
}
 */