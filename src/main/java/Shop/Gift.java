package Shop;

import Candies.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Класс Gift
 * Описывает сформированный подарок
 *
 * @see Candies
 *
 * @author Natalia Litvinova
 */

public class Gift {
    private static String fullName;
    private static String description;
    private HashMap<Candy, Integer> gift;
    private int totalPrice;
    private int totalWeight;


    /**
     * Конструктор без параметров
     */
    public Gift() {
        this.gift = new HashMap<>();
        this.totalPrice = 0;
        this.totalWeight = 0;
    }

    public Gift(HashMap<Candy, Integer> gift) {
        this.gift = gift;
        this.setTotalPrice();
        this.setTotalWeight();
    }

    public static String getFullName() {
        return fullName;
    }

    public static void setFullName(String fullName) {
        Gift.fullName = fullName;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Gift.description = description;
    }

    public HashMap<Candy, Integer> getGift() {
        return gift;
    }

    public void setGift(HashMap<Candy, Integer> gift) {
        this.gift = gift;
    }

    /**
     * Геттер для общей стоимости подарка
     *
     * @return Значение общей стоимости подарка
     */
    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    private void setTotalPrice() {
        HashMap<Candy, Integer> gift = this.getGift();

        int count = 0;

        for (Map.Entry<Candy, Integer> entry : gift.entrySet()) {
            int price = entry.getKey().getPrice();
            int amount = entry.getValue();

            count += price * amount;
        }

        this.totalPrice = count;
    }

    /**
     * Геттер для общего веса подарка
     *
     * @return Значение общего веса подарка
     */
    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    private void setTotalWeight() {
        HashMap<Candy, Integer> gift = this.getGift();

        int count = 0;

        for (Map.Entry<Candy, Integer> entry : gift.entrySet()) {
            int weight = entry.getKey().getWeight();
            int amount = entry.getValue();

            count += weight * amount;
        }

        this.totalWeight = count;
    }

    public void addAPack(Candy product, int amount) {
        HashMap<Candy, Integer> gift = this.getGift();

        if (gift.containsKey(product)) {
            Integer currentAmount = gift.get(product);
            gift.put(product, currentAmount + amount);
        } else {
            gift.put(product, amount);
        }

        this.gift = gift;

        this.setTotalPrice();
        this.setTotalWeight();
    }

    public void print() {
        HashMap<Candy, Integer> gift = this.getGift();

        System.out.println("\nWhat's in this gift:\n\n");

        if (!gift.isEmpty()) {
            int i = 0;

            for (Map.Entry<Candy, Integer> entry : gift.entrySet()) {
                i++;

                System.out.println("Product №" + i + ":\n");

                Candy product = entry.getKey();
                System.out.println(product.getFullName());
                product.print();

                System.out.println("Amount of product №" + i + ": " + entry.getValue() + "\n\n");
            }
        } else
            System.out.println("Your gift is empty\n\n");

        // Вывод общего веса подарка с преобразованием (1 кг = 1000 г)
        System.out.println("Total weight of this gift:");
        int weight = this.getTotalWeight();
        System.out.println(weight / 1000 + " kg " + weight % 1000 + " g (" + weight + " g)");

        // Вывод общей цены подарка с преобразованием (1 Галеон = 17 Сиклей)
        System.out.println("\nTotal price of this gift (1 Galleon = 17 Sickles):");
        int price = this.getTotalPrice();
        System.out.println(price / 17 + " Galleons " + price % 17 + " Sickles (" + price + " Sickles)\n\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gift gift1 = (Gift) o;
        return getTotalPrice() == gift1.getTotalPrice() &&
                getTotalWeight() == gift1.getTotalWeight() &&
                Objects.equals(getGift(), gift1.getGift());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getGift(), getTotalPrice(), getTotalWeight());
    }
}
