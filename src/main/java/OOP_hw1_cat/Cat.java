package OOP_hw1_cat;

import java.text.MessageFormat;

public class Cat {
    private String name;
    private int age;
    private Owner ownerName;

    public Cat() {
    }

    public void setOwnerName(Owner ownerName) {
        this.ownerName = ownerName;
    }

    public Owner getOwnerName() {
        return this.ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void greet() {
        System.out.println(MessageFormat.format("Мяу! Меня зовут {0}. Мой возраст {1} год(a). Мой владелец {2}.",
                this.name, this.age, this.ownerName.getName()));
    }
}
