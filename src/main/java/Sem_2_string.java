import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;

public class Sem_2_string {
    public static void main(String[] args) {

        char[] chars = null;
        try {
            File file = new File("file");
            if (!file.exists()) {
                String s = "HI World!";
                FileWriter writer = new FileWriter(file);
                writer.write(s);
                writer.append("!@/n");
                writer.close();
            } else {
                FileReader reader = new FileReader(file);
                chars = new char[(int) file.length()];
                reader.read(chars);
            }
        } catch (IOException e) {
            System.out.println("There is an exception!)");
        }
//        System.out.println(Array.toString(chars)); // непонятная строка.

        String s = "Hi!";
//        System.out.printf("%s!", s);

//        if (s.contains("T")); // что содержит в сторке
//        System.out.println(s.repeat(7));
//        System.out.println(s+(1+4)+("1"+"4"));

        s = "Ivanov., Semen, Ivanovish";
        System.out.println("-----------" + s.toLowerCase().charAt(0));
//        System.out.println(s.substring(0, s.length()/2));  //возвращает подстраку если знаем индекс
//        if (s.equals("h"));
//        System.out.println(s.indexOf("v")); // находит первое вхождение
//        System.out.println(s.lastIndexOf("v")); // находит первое вхождение с конца, если что то в середине, то можно обрезать сабстингом
//        s = s.replace(",", "");
//        s = s.replace(".,", "");
        s = s.replaceAll("[.,]", "");
        System.out.println(s);
        String[] a = s.split(" "); //сплит возвращает массив
        System.out.println(a);
        System.out.println(a[0]+ " "+ a[1].toUpperCase().charAt(0)+"."+ a[2].toUpperCase().charAt(0)+".");

        StringBuilder builder = new StringBuilder(); // можно создать нужного размера
        builder.append("!");
        builder.indexOf("v", 6);
        builder.reverse(); // разворот строки
        builder.replace(1,7,"f"); // реплейс лучше делать стрингом а не стринг билдер

        s = builder.toString();
    // у стринга исходная строка не меняется, у стрингбилдера меняется.
        String s1 = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            s1 += Character.getName(i);
        }
        System.out.println("String time" + (System.currentTimeMillis()- start));


        StringBuilder builder1 = new StringBuilder("");
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            builder1.append(Character.getName(i));
        }
        System.out.println("String time" + (System.currentTimeMillis()- start));

    }
}


