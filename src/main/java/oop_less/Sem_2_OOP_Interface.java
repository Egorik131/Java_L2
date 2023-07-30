//package OOP_less;
//
//public class Sem_2_OOP_Interface {
//
//    public abstract class AbstractPhone {
//        private int year;
//
//        public AbstractPhone(int year) {
//            this.year = year;
//        }
//
//        public abstract void call(int outNumber);
//
//        public abstract void ring(int inputNumber);
//
//    }
//
//    public abstract class WirelessPhone extends AbstaractPhone {
//        private int hour;
//
//        public WirelessPhone(int year, int hour) {
//            super(year);
//            this.hour = hour;
//
//        }
//    }
//
//    public class CellPhone extends WirelessPhone {
//        public CellPhone(int year, int hour) {
//            super(year, hour);
//        }
//
//        @Override
//        public void call(int outNumber) {
//            System.out.println("Вызываю номер " + outNumber);
//        }
//
//        @Override
//        public void ring(int inputNumber) {
//            System.out.println("Вам звонит абонент " + inputNumber);
//        }
//    }
//
//    public class SmartPhone extends CellPhone {
//        private String operationSystem;
//
//        public Smartphone(int year, int hour, String operationSystem) {
//            super(year, hour);
//            this.operationSystem = operationSystem;
//        }
//
//        public void install(String program) {
//            System.out.println("Устанавливаю " + program + "для" + operationSystem);
//        }
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println("Hello world!");
//    }
//
//
//}
