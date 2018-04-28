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
     * weight - вес продукта в граммах
     * price - цена продукта в сиклях
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
     * @return Значение веса продукта
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Сеттер для веса продукта
     *
     * @param weight Значение веса продукта
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Геттер для цены продукта
     *
     * @return Значение цены продукта
     */
    public int getPrice() {
        return price;
    }

    /**
     * Сеттер для цены продукта
     *
     * @param price Значение цены продукта
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