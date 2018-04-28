package Candies;

/**
 * Класс БертиБоттс
 * Описывает продукт вида "Драже Берти Боттс"
 */

public class BertieBotts extends Candy {
    /**
     * Атрибуты класса:
     * Статическая переменная String fullName - полное название продукта
     * Статическая переменная String description - краткое описание продукта
     * Переменная String flavourMix - какие вкусы содержит продукт (три опции: "Every", "Ordinary", "Eeew")
     */
    private static final String fullName = "Bertie Bott's Every Flavour Beans";
    private static final String description = "Jelly beans with every flavor imaginable";
    private String flavourMix;


    /**
     * Конструктор с заданными параметрами
     *
     * @param weight Целочисленное значение веса продукта
     * @param price Целочисленное значение цены продукта
     * @param flavourMix Строковое значение набора вкусов
     */
    public BertieBotts (int weight, int price, String flavourMix) {
        this.weight = weight;
        this.price = price;
        this.flavourMix = flavourMix;
    }

    /**
     *
     * @return
     */
    public static String getFullName() {
        return fullName;
    }

    /**
     *
     * @return
     */
    public static String getDescription() {
        return description;
    }

    /**
     *
     * @return
     */
    public String getFlavourMix() {
        return flavourMix;
    }

    /**
     *
     * @param flavourMix
     */
    public void setFlavourMix(String flavourMix) {
        this.flavourMix = flavourMix;
    }

    /**
     *
     */
    @Override
    public void print() {
        //
        System.out.println("Weight of the pack:");
        System.out.println(this.getWeight() + "g");
        System.out.println("Price of the pack:");
        System.out.println(this.getPrice() + " sickles");

        //
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
        };
    }
}