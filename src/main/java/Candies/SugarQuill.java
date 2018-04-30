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
    /**
     * Атрибуты класса:
     * Статическая переменная fullName - полное название продукта
     * Статическая переменная description - краткое описание продукта
     * Переменная deluxe - сообщает, является ли продукт изданием Deluxe или нет
     */
    private static final String fullName = "Sugar Quill";
    private static final String description = "Delicate, spun-sugar sweets made to resemble real quills.";
    private boolean deluxe;


    /**
     * Конструктор с заданными параметрами
     *
     * @param deluxe Делюкс-продукт или нет
     */
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
     * Геттер для информации о том, является ли продукт Делюкс-изданием
     *
     * @return Делюкс-продукт или нет
     */
    public boolean isDeluxe() {
        return deluxe;
    }

    /**
     * Сеттер для информации о том, является ли продукт Делюкс-изданием
     *
     * @param deluxe Делюкс-продукт или нет
     */
    public void setDeluxe(boolean deluxe) {
        this.deluxe = deluxe;
    }

    /**
     * Метод вывода информации о продукте
     */
    @Override
    public void print() {
        // Вывод информации о весе и цене продукта
        System.out.println("Weight of the quill:");
        System.out.println(this.getWeight() + "g");
        System.out.println("Price of the quill:");
        System.out.println(this.getPrice() + " sickles");

        // Вывод информации в зависимости от того, является ли продукт Делюкс-изданием
        if (this.isDeluxe()) {
            System.out.println("Deluxe quill: you can suck it for one day");
        } else {
            System.out.println("Simple quill: lasts only for one class (an hour and a half)");
        }
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