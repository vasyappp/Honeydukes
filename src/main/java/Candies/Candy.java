package Candies;

import java.util.Objects;

/**
 * Абстрактный класс Конфета
 * Содержит вес и цену продукта, а также абстрактный метод вывода информации о продукте
 *
 * @author Natalia Litvinova
 */

public abstract class Candy {
    String shortName;
    int weight;
    int price;

    Candy () {
        this.shortName = "";
        this.weight = 0;
        this.price = 0;
    }

    Candy(String shortName, int weight, int price) {
        this.shortName = shortName;
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

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