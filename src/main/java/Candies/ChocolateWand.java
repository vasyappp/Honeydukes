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

    public ChocolateWand (String shortName, int weight, String core) {
        super(shortName, weight, 10);
        this.core = core;
    }

    public ChocolateWand(String shortName, int weight, int price, String core) {
        super(shortName, weight, price);
        this.core = core;
    }

    public String getCore() {
        return core;
    }

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

    @Override
    public void print() {
        System.out.println("Weight of the wand:");
        System.out.println(this.getWeight() + "g");
        System.out.println("Price of the wand:");
        System.out.println(this.getPrice() + " sickles");
        System.out.println("Contains a magical core:");
        System.out.println(this.getCore());

        System.out.println();
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