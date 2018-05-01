package Candies;

import java.util.Objects;

/**
 * Класс ChocolateFrog
 * Описывает продукт типа "Шоколадная лягушка"
 *
 * @see Candy
 *
 * @author Natalia Litvinova
 */

public class ChocolateFrog extends Candy {
    private String collectionYear;


    public ChocolateFrog() {
        super();
        this.collectionYear = "";
    }

    public ChocolateFrog (String shortName, int price, String collectionYear) {
        super(shortName, 200, price);
        this.collectionYear = collectionYear;
    }

    public ChocolateFrog(String shortName, int weight, int price, String collectionYear) {
        super(shortName, weight, price);
        this.collectionYear = collectionYear;
    }

    public String getCollectionYear() {
        return collectionYear;
    }

    public void setCollectionYear(String collectionYear) {
        this.collectionYear = collectionYear;
    }

    @Override
    public String getFullName() {
        return Description.getChocolateFrogFullName();
    }

    @Override
    public String getDescription() {
        return Description.getChocolateFrogDescription();
    }

    @Override
    public void print() {
        System.out.println("Weight of the frog:");
        System.out.println(this.getWeight() + "g");
        System.out.println("Price of the frog:");
        System.out.println(this.getPrice() + " sickles");
        System.out.println("Contains a card of a wizard from years:");
        System.out.println(this.getCollectionYear());

        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ChocolateFrog that = (ChocolateFrog) o;
        return Objects.equals(getCollectionYear(), that.getCollectionYear());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getCollectionYear());
    }
}