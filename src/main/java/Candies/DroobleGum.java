package Candies;

import java.util.Objects;

/**
 * Класс DroobleGum
 * Описывает продукт типа "Жвачка Друбла"
 *
 * @see Candy
 *
 * @author Natalia Litvinova
 */

public class DroobleGum extends Candy {
    private String flavour;


    public DroobleGum() {
        super();
        this.flavour = "";
    }

    public DroobleGum (String shortName, int weight, int price, String flavour) {
        this.shortName = shortName;
        this.weight = weight;
        this.price = price;
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String getFullName() {
        return Description.getDroobleGumFullName();
    }

    @Override
    public String getDescription() {
        return Description.getDroobleGumDescription();
    }

    @Override
    public void print() {
        System.out.println("Weight of the gum:");
        System.out.println(this.getWeight() + "g");
        System.out.println("Price of the gum:");
        System.out.println(this.getPrice() + " sickles");
        System.out.println("Gum's flavour:");
        System.out.println(this.getFlavour());

        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DroobleGum that = (DroobleGum) o;
        return Objects.equals(getFlavour(), that.getFlavour());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getFlavour());
    }
}