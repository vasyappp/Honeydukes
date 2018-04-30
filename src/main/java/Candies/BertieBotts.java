package Candies;

import java.util.Objects;

/**
 * Класс BertieBotts
 * Описывает продукт типа "Драже Берти Боттс"
 *
 * @see Candy
 *
 * @author Natalia Litvinova
 */

public class BertieBotts extends Candy {
    /**
     * Атрибуты класса:
     * Статическая переменная fullName - полное название продукта
     * Статическая переменная description - краткое описание продукта
     * Переменная flavourMix - какие вкусы содержит продукт (три опции: "Every", "Ordinary", "Eeew")
     */
    private String flavourMix;

    public BertieBotts() {
        super();
        this.flavourMix = "";
    }

    /**
     * Конструктор с заданными параметрами
     *
     * @param weight Значение веса продукта
     * @param price Значение цены продукта
     * @param flavourMix Значение набора вкусов
     */
    public BertieBotts (String shortName, int weight, int price, String flavourMix) {
        this.shortName = shortName;
        this.weight = weight;
        this.price = price;
        this.flavourMix = flavourMix;
    }

    /**
     * Геттер для набора вкусов продукта
     *
     * @return Значение набора вкусов продукта
     */
    public String getFlavourMix() {
        return flavourMix;
    }

    /**
     * Сеттер для набора вкусов продукта
     *
     * @param flavourMix Значение набора вкусов продукта
     */
    public void setFlavourMix(String flavourMix) {
        this.flavourMix = flavourMix;
    }

    @Override
    public String getFullName() {
        return Description.getBertieBottsFullName();
    }

    @Override
    public String getDescription() {
        return Description.getBertieBottsDescription();
    }

    /**
     * Метод вывода информации о продукте
     */
    @Override
    public void print() {
        // Вывод веса и цены продукта
        System.out.println("Weight of the pack:");
        System.out.println(this.getWeight() + "g");
        System.out.println("Price of the pack:");
        System.out.println(this.getPrice() + " sickles");

        // Вывод информации о наборе вкусов продукта
        System.out.println("Flavour mix:");
        switch (this.getFlavourMix()) {
            case "Every":
                System.out.println("Every flavour imaginable!");
                break;
            case "Ordinary":
                System.out.println("Only ordinary tastes: orange, chocolate, etc.");
                break;
            case "Eeew":
                System.out.println("Extreme flavours for those who likes earwax & dirty socks");
                break;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BertieBotts that = (BertieBotts) o;
        return Objects.equals(getFlavourMix(), that.getFlavourMix());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getFlavourMix());
    }
}