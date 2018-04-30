package Candies;

import java.util.Objects;

/**
 * Класс ChocolateWand
 * Описывает продукт типа "Шоколадная волшебная палочка"
 *
 * @see Candy
 *
 * @author Natalia Litvinova
 */

public class ChocolateWand extends Candy {
    private String core;


    public ChocolateWand() {
        super();
        this.core = "";
    }

    /**
     * Конструктор с заданными параметрами
     *
     * @param weight Значение веса продукта
     * @param core Значение начинки продукта
     */
    public ChocolateWand (String shortName, int weight, String core) {
        this.shortName = shortName;
        this.weight = weight;
        this.price = 10;
        this.core = core;
    }

    /**
     * Геттер для начинки продукта
     *
     * @return Значение начинки продукта
     */
    public String getCore() {
        return core;
    }

    /**
     * Сеттер для начинки продукта
     *
     * @param core Значение начинки продукта
     */
    public void setCore(String core) {
        this.core = core;
    }

    @Override
    public String getFullName() {
        return Description.getChocolateWandFullName();
    }

    @Override
    public String getDescription() {
        return Description.getChocolateWandDescription();
    }

    /**
     * Метод вывода информации о продукте
     */
    @Override
    public void print() {
        System.out.println("Weight of the wand:");
        System.out.println(this.getWeight() + "g");
        System.out.println("Price of the wand:");
        System.out.println(this.getPrice() + " sickles");
        System.out.println("Contains a magical core:");
        System.out.println(this.getCore());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ChocolateWand wand = (ChocolateWand) o;
        return Objects.equals(getCore(), wand.getCore());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getCore());
    }
}