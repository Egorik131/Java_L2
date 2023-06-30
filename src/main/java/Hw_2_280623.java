/**
 * 1) Дана строка sql-запроса "select * from students where ".
 * Сформируйте часть WHERE этого запроса, используя StringBuilder или String.
 * Данные для фильтрации приведены ниже в виде json-строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * <p>
 * Замечания преподавателя:
 * Из строк вынуть куски и собрать новую строку.
 * Дана строка Дано начало строки, сформировать конец, должен соответствовать запросу скобочки, равно, и сложить строки
 * <p>
 * *
 * 2) Дана json-строка (можно сохранить в файл и читать из файла)
 * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
 * Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
 * Пример вывода:
 * Студент Иванов получил 5 по предмету Математика.
 * Студент Петрова получил 4 по предмету Информатика.
 * Студент Краснов получил 5 по предмету Физика.
 * <p>
 * Замечания преподавателя:
 * Дана строка которую можно читать из файла и нужно распилить на кусочки и сложить в определенном виде, убрать мусор и распределить.
 */

public class Hw_2_280623 {
    public static void main(String[] args) {

        System.out.println("Задача №1");

        String sql_1 = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        StringBuilder result = new StringBuilder();

        sql_1 = sql_1.replaceAll("[{},\"]", "");
        sql_1 = sql_1.replace(":", " ");
        String[] sql_array = sql_1.split(" ");

        for (int i = 1; i < sql_array.length; i += 2) {
            if (!sql_array[i].toLowerCase().contains("null")) {
                result.append(sql_array[i - 1] + "\":\"" + sql_array[i] + "\", \"");
            }
        }

        String final_string = result.toString();
        System.out.println("Результат запроса WHERE: " + "{\"" + final_string.substring(0, final_string.length() - 4) + "\"}");
        System.out.println();



        System.out.println("Задача №2");

        String sql_2 = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        StringBuilder result_2 = new StringBuilder();

        sql_2 = sql_2.replace("\"", "");
        sql_2 = sql_2.replace("[", "");
        sql_2 = sql_2.replace("]", "");
        sql_2 = sql_2.replaceAll("[{}]", "");
        sql_2 = sql_2.replaceAll("[:,]", " ");

        String[] sql_array_2 = sql_2.split(" ");

        int count_items = 0;
        int count_field = 0;
        for (int i = 0; i < sql_array_2.length; i ++) {
            if (sql_array_2[i].toLowerCase().contains("фамилия")) {
                count_items++;
            }
        }
        count_field = sql_array_2.length/count_items;

        for (int i = 0; i < count_items; i++) {
            result_2.append("Студент " + sql_array_2[count_field*i+1] +
                    " получил " + sql_array_2[count_field*i+3] +
                    " по предмету " + sql_array_2[count_field*i+5] + ".\n");
        }
        System.out.println(result_2);
    }

}
