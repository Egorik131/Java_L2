package OOP_hw_1_HotDrink;


public class HotDrinksVendingMachine implements VendingMachine {


    protected String name;
    protected int volume;

    public HotDrinksVendingMachine(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String getProduct() {
        return null;
    }

    private String getProduct(String name, int volume) {
        this.name = name;
        this.volume = volume;
        return String.format("Местонахождение: %s; Объем аппарата: %d кружек", name, volume);
    }

    @Override
    public String toString() {
        return getProduct(name, volume);
    }
}
