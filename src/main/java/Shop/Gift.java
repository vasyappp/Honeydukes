package Shop;

import Candies.*;

/**
 * Класс Gift
 * Описывает сформированный подарок
 *
 * @see Candies
 *
 * @author Natalia Litvinova
 */

public class Gift {
    /**
     * Атрибуты класса:
     * Список имеющихся в подарке типов продуктов
     * Количество каждого из продуктов
     * Количество типов продуктов
     * Общая цена подарка
     * Общий вес подарка
     */
    private Candy[] product;
    private int[] amount;
    private int length;
    private int totalPrice;
    private int totalWeight;

    /**
     * Конструктор без параметров
     */
    public Gift() {
        this.product = new Candy[100];
        this.amount = new int[100];
        this.length = 0;
        this.totalPrice = 0;
        this.totalWeight = 0;
    }

    /**
     * Конструктор с заданными параметрами
     *
     * @param product Список типов продуктов
     * @param amount Количество каждого продукта в подарке
     * @param length Количество типов продуктов
     */
    public Gift(Candy[] product, int[] amount, int length) {
        this.product = product;
        this.amount = amount;
        this.length = length;
        this.setTotalPrice();
        this.setTotalWeight();
    }

    /**
     * Геттер для списка продуктов в подарке
     *
     * @return Список продуктов в подарке
     */
    public Candy[] getProduct() {
        return product;
    }

    /**
     * Сеттер для списка продуктов в подарке
     *
     * @param product Список продуктов в подарке
     */
    public void setProduct(Candy[] product) {
        this.product = product;
    }

    /**
     * Геттер для количества каждого продукта в подарке
     *
     * @return Количество каждого продукта в подарке
     */
    public int[] getAmount() {
        return amount;
    }

    /**
     * Сеттер для количества каждого продукта в подарке
     *
     * @param amount Количество каждого продукта в подарке
     */
    public void setAmount(int[] amount) {
        this.amount = amount;
    }

    /**
     * Геттер для количества типов продуктов в подарке
     *
     * @return Количество типов продуктов в подарке
     */
    public int getLength() {
        return length;
    }

    /**
     * Сеттер для количества типов продуктов в подарке
     *
     * @param length Количество типов продуктов в подарке
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Добавление продукта в подарок
     *
     * @param product Тип продукта
     * @param amount Количество продукта
     */
    public void addAPack(Candy product, int amount) {
        //Задание начальных значений переменных
        int addIndex = this.getLength();
        Candy[] addPack = this.getProduct();
        int[] addAmount = this.getAmount();

        //Добавление нового продукта список
        addPack[addIndex] = product;
        addAmount[addIndex] = amount;
        addIndex++;

        //Сохранение изменений
        this.setProduct(addPack);
        this.setAmount(addAmount);
        this.setLength(addIndex);
        this.setTotalPrice();
        this.setTotalWeight();
    }

    /**
     * Сеттер для общей стоимости подарка
     * Рассчитывается в зависимости от продуктов, содержащихся в подарке
     */
    private void setTotalPrice() {
        //Задание значений переменных
        Candy[] presentPack = this.getProduct();
        int[] presentAmount = this.getAmount();
        int length = this.getLength();

        //Переменная для подсчета общей стоимости
        int count = 0;

        //Вычисление стоимости каждого продукта в зависимости от его количества в подарке и добавление к общей стоимости
        for (int i = 0; i < length; i++) {
            count += presentPack[i].getPrice() * presentAmount[i];
        }

        this.totalPrice = count;
    }

    /**
     * Сеттер для общего веса подарка
     * Рассчитывается в зависимости от продуктов, содержащихся в подарке
     */
    private void setTotalWeight() {
        //Задание начальных значений переменных
        Candy[] presentPack = this.getProduct();
        int[] presentAmount = this.getAmount();
        int length = this.getLength();

        //Переменная для подсчета общего веса
        int count = 0;

        //Вычисление веса каждого типа продукта в зависимости от его количества в подарке и добавление к общему весу
        for (int i = 0; i < length; i++) {
            count += presentPack[i].getWeight() * presentAmount[i];
        }

        this.totalWeight = count;
    }

    /**
     * Метод вывода информации о подарке
     */
    public void print() {
        //Задание значений переменных
        Candy[] runPack = this.getProduct();
        int[] runAmount = this.getAmount();
        int length = this.length;

        System.out.println("\nWhat's in this gift:\n\n");

        if (length != 0) {
            //Если подарок не пуст, вывод информации о каждом из продуктов подарка
            for (int i = 0; i < length; i++) {
                System.out.println("Product №" + (i + 1) + ":\n");

                if (runPack[i] instanceof BertieBotts) {
                    System.out.println(BertieBotts.getFullName());
                } else if (runPack[i] instanceof ChocolateFrog) {
                    System.out.println(ChocolateFrog.getFullName());
                } else if (runPack[i] instanceof ChocolateWand) {
                    System.out.println(ChocolateWand.getFullName());
                } else if (runPack[i] instanceof DroobleGum) {
                    System.out.println(DroobleGum.getFullName());
                } else if (runPack[i] instanceof SugarQuill) {
                    System.out.println(SugarQuill.getFullName());
                }

                runPack[i].print();

                //Вывод количества продукта в подарке
                System.out.println("\nAmount of product №" + (i + 1) + ": " + runAmount[i] + "\n\n");
            }
        } else
            //Вывод сообщения о том, что подарок пуст
            System.out.println("Your gift is empty\n\n");

        //Вывод общего веса подарка с преобразованием (1 кг = 1000 г)
        System.out.println("Total weight of this gift:");
        int weight = this.getTotalWeight();
        System.out.println(weight / 1000 + " kg " + weight % 1000 + " g (" + weight + " g)");

        //Вывод общей цены подарка с преобразованием (1 Галеон = 17 Сиклей)
        System.out.println("\nTotal price of this gift (1 Galleon = 17 Sickles):");
        int price = this.getTotalPrice();
        System.out.println(price / 17 + " Galleons " + price % 17 + " Sickles (" + price + " Sickles)\n\n");
    }

    /**
     * Геттер для общей стоимости подарка
     *
     * @return Значение общей стоимости подарка
     */
    public int getTotalPrice() {
        return totalPrice;
    }

    /**
     * Геттер для общего веса подарка
     *
     * @return Значение общего веса подарка
     */
    public int getTotalWeight() {
        return totalWeight;
    }
}
