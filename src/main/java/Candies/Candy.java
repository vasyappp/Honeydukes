package Candies;

/**
 * Абстрактный класс Конфета
 * Содержит вес и цену продукта, а также абстрактный метод вывода информации о продукте
 *
 * @author Natalia Litvinova
 */

public abstract class Candy {
    /**
     * Атрибуты метода:
     * Целое число weight - вес продукта в граммах
     * Целое число price - цена продукта в сиклях
     */
    protected int weight;
    protected int price;


    /**
     * Конструктор без заданных параметров
     */
    public Candy () {
        this.weight = 0;
        this.price = 0;
    }

    /**
     * Геттер для веса продукта
     *
     * @return Целое число - вес продукта
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Сеттер для веса продукта
     *
     * @param weight Целое число - вес продукта
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Геттер для цены продукта
     *
     * @return Целое число - цена продукта
     */
    public int getPrice() {
        return price;
    }

    /**
     * Сеттер для цены продукта
     *
     * @param price Целое число - цена продукта
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Абстрактный метод для вывода информации о продукте
     * Переопределяется в наследниках
     */
    public abstract void print();
}