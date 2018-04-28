package Candies;

/**
 * Класс ChocolateWand
 * Описывает продукт типа "Шоколадная волшебная палочка"
 *
 * @see Candy
 *
 * @author Natalia Litvinova
 */

public class ChocolateWand extends Candy {
    /**
     * Атрибуты класса:
     * Статическая переменная fullName - полное название продукта
     * Статическая переменная description - краткое описание продукта
     * Переменная core - описывает начинку продукта (три опции: "Unicorn hair", "Phoenix feather",
     * "Dragon heartstring")
     */
    private static final String fullName = "Chocolate Wand";
    private static final String description = "Chocolate wand-shaped sweets with a magical substance at its core";
    private String core;


    /**
     * Конструктор с заданными параметрами
     *
     * @param weight Значение веса продукта
     * @param core Значение начинки продукта
     */
    public ChocolateWand (int weight, String core) {
        this.weight = weight;
        this.price = 10;
        this.core = core;
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
}