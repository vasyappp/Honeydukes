package Shop;

import Candies.*;

/**
 * Класс Honeydukes
 * "Магазин" - хранит данные обо всех имеющихся продуктах, а также данные о готовых подарках
 *
 * @see Candies
 * @see Gift
 *
 * @author Natalia Litvinova
 */

public class Honeydukes {
    /**
     * Атрибуты класса:
     * Список имеющихся продуктов
     * Список готовых подарков
     */
    private Candy[][] products;
    private Gift[] gifts;

    /**
     * Конструктор с заданными параметрами
     *
     * @param products Список продуктов
     * @param gifts Список готовых подарков
     */
    public Honeydukes(Candy[][] products, Gift[] gifts) {
        this.products = products;
        this.gifts = gifts;
    }

    /**
     * Геттер для списка продуктов
     *
     * @return Список продуктов
     */
    public Candy[][] getProducts() {
        return products;
    }

    /**
     * Сеттер для списка продуктов
     *
     * @param products Список продуктов
     */
    public void setProducts(Candy[][] products) {
        this.products = products;
    }

    /**
     * Геттер для списка подарков
     *
     * @return Список подарков
     */
    public Gift[] getGifts() {
        return gifts;
    }

    /**
     * Сеттер для списка подарков
     *
     * @param gifts Список подарков
     */
    public void setGifts(Gift[] gifts) {
        this.gifts = gifts;
    }

    /**
     * Вывод информации обо всех имеющихся продуктах типа "Драже Берти Боттс"
     */
    public void printBertieBottsList() {
        System.out.println("Name of product:");
        System.out.println(BertieBotts.getFullName());
        System.out.println("Description of product:");
        System.out.println(BertieBotts.getDescription());
        System.out.println();

        System.out.println("Types of product:");
        System.out.println();

        int i = 0;
        BertieBotts[] bertieBotts = (BertieBotts[])this.getProducts()[0];

        for (BertieBotts run : bertieBotts) {
            i++;
            System.out.println("Pack №" + i);
            run.print();
            System.out.println();
        }
    }

    /**
     * Вывод информации обо всех имеющихся продуктах типа "Шоколадная лягушка"
     */
    public void printFrogsList() {
        System.out.println("Name of product:");
        System.out.println(ChocolateFrog.getFullName());
        System.out.println("Description of product:");
        System.out.println(ChocolateFrog.getDescription());
        System.out.println();

        System.out.println("Types of product:");
        System.out.println();

        ChocolateFrog[] frogs = (ChocolateFrog[])this.getProducts()[1];
        int i = 0;

        for (ChocolateFrog run : frogs) {
            i++;
            System.out.println("Frog №" + i);
            run.print();
            System.out.println();
        }
    }

    /**
     * Вывод информации обо всех имеющихся продуктах типа "Шоколадная волшебная палочка"
     */
    public void printWandsList() {
        System.out.println("Name of product:");
        System.out.println(ChocolateWand.getFullName());
        System.out.println("Description of product:");
        System.out.println(ChocolateWand.getDescription());
        System.out.println();

        System.out.println("Types of product:");
        System.out.println();

        ChocolateWand[] wands = (ChocolateWand[])this.getProducts()[2];
        int i = 0;

        for (ChocolateWand run : wands) {
            i++;
            System.out.println("Wand №" + i);
            run.print();
            System.out.println();
        }
    }

    /**
     * Вывод информации обо всех имеющихся продуктах типа "Жвачка Друбла"
     */
    public void printGumsList() {
        System.out.println("Name of product:");
        System.out.println(DroobleGum.getFullName());
        System.out.println("Description of product:");
        System.out.println(DroobleGum.getDescription());
        System.out.println();

        System.out.println("Types of product:");
        System.out.println();

        DroobleGum[] gums = (DroobleGum[])this.getProducts()[3];
        int i = 0;

        for (DroobleGum run : gums) {
            i++;
            System.out.println("Gum №" + i);
            run.print();
            System.out.println();
        }
    }

    /**
     * Вывод информации обо всех имеющихся продуктах типа "Сахарные перья для письма"
     */
    public void printQuillsList() {
        System.out.println("Name of product:");
        System.out.println(SugarQuill.getFullName());
        System.out.println("Description of product:");
        System.out.println(SugarQuill.getDescription());
        System.out.println();

        System.out.println("Types of product:");
        System.out.println();

        SugarQuill[] quills = (SugarQuill[])this.getProducts()[4];
        int i = 0;

        for (SugarQuill run : quills) {
            i++;
            System.out.println("Quill №" + i);
            run.print();
            System.out.println();
        }
    }

    /**
     * Вывод информации обо всех имеющихся продуктах
     */
    public void printHoneydukes() {
        int i = 1;
        Candy[][] honeydukes = this.getProducts();

        for (Candy[] run: honeydukes) {
            System.out.println("Product №" + i);
            System.out.println();

            // Вывод информации в зависимости от того, объектом какого типа является первый продукт массива
            if (run[0] instanceof BertieBotts) {
                this.printBertieBottsList();
            } else if (run[0] instanceof ChocolateFrog) {
                this.printFrogsList();
            } else if (run[0] instanceof ChocolateWand) {
                this.printWandsList();
            } else if (run[0] instanceof DroobleGum) {
                this.printGumsList();
            } else if (run[0] instanceof SugarQuill) {
                this.printQuillsList();
            }

            System.out.println();

            i++;
        }
    }
}
