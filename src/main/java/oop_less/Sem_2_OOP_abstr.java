//package OOP_less;
//
//public class Sem_2_OOP_abstr {
//    interface Printable{
//        int list = 10;
//        default void print(){
//
//            System.out.println("Undefined printable");
//        }
//    }
//    class Book implements Printable{
//
//        String name;
//        String author;
//
//        Book(String name, String author){
//
//            this.name = name;
//            this.author = author;
//        }
//
//        public void print() {
//
//            System.out.printf("%s (%s) \n", name, author);
//        }
//    }
//    class Journal implements Printable {
//
//        private String name;
//
//        String getName(){
//            return name;
//        }
//
//        Journal(String name){
//
//            this.name = name;
//        }
//    }
//    class Main {
//        public static void main(String[] args) {
//            Printable printable = new Book("Java. Complete Reference", "H. Shildt");
//            System.out.println(printable.list);
//            printable.print(); // Java. Complete Reference (H. Shildt)
//            printable = new Journal("Foreign Policy");
//            printable.print(); // Foreign Policy
//        }
//    }
//}
