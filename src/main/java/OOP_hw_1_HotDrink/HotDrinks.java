package OOP_hw_1_HotDrink;

public class HotDrinks extends HotDrinksVendingMachine implements VendingMachine {

    private int temperature;

    public HotDrinks(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    private String getProduct(String name, int volume, int temperature) {
        super.name = name;
        super.volume = volume;
        this.temperature = temperature;
        return String.format("Наименование: %s; Объем: %d мл.; Температура напитка: %d", name, volume, temperature);
    }

    @Override
    public String toString() {
        return getProduct(name, volume, temperature);
    }
}
