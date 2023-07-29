//package OOP_less;
//
//public class Sem_1_OOP_230719 {
//
//    class People {
//
//        private static String _name;
//
//        public static String GetName() {
//            return _name;
//        }
//
//        public static void SetName(String name) {
//            _name = name;
//        }
//    }
//
//    class Car {
//        private String Name;
//        private int Speed;
//        protected int Age;
//
//        Car(String name, int speed) {
//            this.Name = name;
//            this.Speed = speed;
//        }
//
//        Car(int speed) {
//            this("Test", speed);
//        }
//
//        Car() {
//            this(0);
//        }
//
//        public int GetSpeed() {
//            return Speed;
//        }
//
//        public int GetName() {
//            return Name;
//        }
//
//        public void SetAge(int age) {
//            Age = age;
//        }
//
//        public int GetAge() {
//            return Age;
//        }
//// public String GetDriver(){
//// return People.Name;
//// }
//    }
//
//
//    public void Print(int num) {
//        System.out.println(num);
//    }
//
//    public static void main(String[] args) {
//        Car car3 = new Car();
//        Car car2 = new Car(12);
//        Car car1 = new Car("Audi", 12);
//// System.out.println(car1.Name + " " + car1.Speed);
//// System.out.println(car2.Name + " " + car2.Speed);
//// System.out.println(car3.Name + " " + car3.Speed);
//        car1.SetAge(12);
//        System.out.println(car1.Age);
//        System.out.println(car1.GetAge());
//
//// int a = car1.GetSpeed();
//// Print(a);
//// Print(car1.GetSpeed());
////People.SetName("Vlad");
////System.out.println(car1.GetDriver());
//
////System.out.println(People.Name);
//
//    }
//
//
//}
