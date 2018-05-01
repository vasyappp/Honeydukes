package Candies;

import java.util.Objects;

/**
 * Класс SugarQuill
 * Описывает продукт типа "Сахарное перо"
 *
 * @see Candy
 *
 * @author Natalia Litvinova
 */

public class SugarQuill extends Candy {
    private boolean deluxe;


    public SugarQuill() {
        super();
        this.deluxe = false;
    }

    public SugarQuill (String shortName, boolean deluxe) {
        this.shortName = shortName;
        this.deluxe = deluxe;

        if (deluxe) {
            this.weight = 35;
            this.price = 15;
        } else {
            this.weight = 30;
            this.price = 10;
        }
    }

    public SugarQuill(String shortName, int weight, int price, boolean deluxe) {
        super(shortName, weight, price);
        this.deluxe = deluxe;
    }

    public boolean isDeluxe() {
        return deluxe;
    }

    public void setDeluxe(boolean deluxe) {
        this.deluxe = deluxe;
    }

    @Override
    public String getFullName() {
        return Description.getSugarQuillFullName();
    }

    @Override
    public String getDescription() {
        return Description.getSugarQuillDescription();
    }

    @Override
    public void print() {
        // Вывод информации о весе и цене продукта
        System.out.println("Weight of the quill:");
        System.out.println(this.getWeight() + "g");
        System.out.println("Price of the quill:");
        System.out.println(this.getPrice() + " sickles");

        // Вывод информации в зависимости от того, является ли продукт Делюкс-изданием
        if (this.isDeluxe()) {
            System.out.println("Deluxe quill: you can suck it longer");
        } else {
            System.out.println("Simple quill: lasts not for so long");
        }

        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SugarQuill quill = (SugarQuill) o;
        return isDeluxe() == quill.isDeluxe();
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), isDeluxe());
    }
}