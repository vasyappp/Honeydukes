package Candies;

import java.util.Objects;

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
    String shortName;
    int weight;
    int price;

    /**
     * Конструктор без заданных параметров
     */
    Candy () {
        this.shortName = "";
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public abstract String getFullName();

    public abstract String getDescription();

    /**
     * Абстрактный метод для вывода информации о продукте
     * Переопределяется в наследниках
     */
    public abstract void print();

    public void printHeader() {
        System.out.println("Name of product:");
        System.out.println(this.getFullName());
        System.out.println("Description of product:");
        System.out.println(this.getDescription());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candy candy = (Candy) o;
        return getWeight() == candy.getWeight() &&
                getPrice() == candy.getPrice() &&
                Objects.equals(getShortName(), candy.getShortName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getShortName(), getWeight(), getPrice());
    }
}