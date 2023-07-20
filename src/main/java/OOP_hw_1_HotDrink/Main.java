package OOP_hw_1_HotDrink;

/*
Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
реализовать перегруженный метод getProduct(int name, int volume, int temperature),
выдающий продукт соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
воспроизвести логику, заложенную в программе
 Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
        */
public class Main {
    public static void main(String[] args) {
        HotDrinks tea1 = new HotDrinks("BlackTea", 250, 95);
        HotDrinks tea2 = new HotDrinks("GreenTea", 200, 85);
        HotDrinks coffe = new HotDrinks("Americano", 150, 90);
        HotDrinksVendingMachine machine1 = new HotDrinksVendingMachine("Vnukovo", 100);
        HotDrinksVendingMachine machine2 = new HotDrinksVendingMachine("Moskovskiy", 150);

        System.out.println(tea1);
        System.out.println(tea2);
        System.out.println(coffe);
        System.out.println(machine1);
        System.out.println(machine2);
    }
}
