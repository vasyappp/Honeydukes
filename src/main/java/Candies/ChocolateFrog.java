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
    /**
     * Атрибуты класса:
     * Статическая переменная fullName - полное название продукта
     * Статическая переменная description - краткое описание продукта
     * Переменная collectionYear - карточка с волшебником какого века находится в продукте
     */
    private static final String fullName = "Chocolate Frog";
    private static final String description = "A sweet frog-shaped chocolate with a random collectible card";
    private String collectionYear;


    /**
     * Конструктор с заданными параметрами
     *
     * @param price Значение цены продукта
     * @param collectionYear Значение информации о карточке волшебника в продукте
     */
    public ChocolateFrog (String shortName, int price, String collectionYear) {
        this.shortName = shortName;
        this.weight = 200;
        this.price = price;
        this.collectionYear = collectionYear;
    }

    /**
     * Статический геттер для полного названия продукта
     *
     * @return Значение полного названия продукта
     */
    public static String getFullName() {
        return fullName;
    }

    /**
     * Статический геттер для описания продукта
     *
     * @return Значение описания продукта
     */
    public static String getDescription() {
        return description;
    }

    /**
     * Геттер для информации о карточке в продукте
     *
     * @return Значение информации о карточке в продукте
     */
    public String getCollectionYear() {
        return collectionYear;
    }

    /**
     * Сеттер для информации о карточке в продукте
     *
     * @param collectionYear Значение информации о карточке в продукте
     */
    public void setCollectionYear(String collectionYear) {
        this.collectionYear = collectionYear;
    }

    /**
     * Метод вывода информации о продукте
     */
    @Override
    public void print() {
        System.out.println("Weight of the frog:");
        System.out.println(this.getWeight() + "g");
        System.out.println("Price of the frog:");
        System.out.println(this.getPrice() + " sickles");
        System.out.println("Contains a card of a wizard from years:");
        System.out.println(this.getCollectionYear());
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