package WorkWithShop;

import Candies.BertieBotts;
import Candies.Candy;
import Shop.Honeydukes;

import java.util.Scanner;

/**
 * Класс EditingAShop
 * Описывает работу администратора с магазином
 * Позволяет добавлять новые типы продуктов, составлять и добавлять готовые подарки
 *
 * @see Candies
 * @see Shop
 *
 * @author Natalia Litvinova
 */

public class EditingAShop {
    private Honeydukes honeydukes;

    public EditingAShop() {
        this.honeydukes = new Honeydukes();
    }

    public EditingAShop(Honeydukes honeydukes) {
        this.honeydukes = honeydukes;
    }

    public Honeydukes getHoneydukes() {
        return honeydukes;
    }

    public void setHoneydukes(Honeydukes honeydukes) {
        this.honeydukes = honeydukes;
    }

    private void addABertieBotts() {
        Honeydukes honeydukes = this.getHoneydukes();

        Scanner myValue = new Scanner(System.in);

        System.out.println("Enter the weight of this product (in grams):");
        int weight = myValue.nextInt();

        System.out.println("\nEnter the price of this product (in Sickles):");
        int price = myValue.nextInt();

        System.out.println();

        String flavourMix = "";

        boolean correctCommand = false;

        while (!correctCommand) {
            System.out.println("Choose a flavour mix for this product:");
            System.out.println("1. Every flavour imaginable");
            System.out.println("2. Only ordinary tastes: orange, chocolate, etc.");
            System.out.println("3. Extreme flavours for those who likes earwax & dirty socks");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    flavourMix = "Every";
                    correctCommand = true;
                    break;
                case 2:
                    flavourMix = "Ordinary";
                    correctCommand = true;
                    break;
                case 3:
                    flavourMix = "Eeew";
                    correctCommand = true;
                    break;
                default:
                    System.out.println("\nWrong command!\n");
            }
        }

        System.out.println("Enter the short name of this product (no spacing allowed)");
        String shortName = myValue.next();

        BertieBotts bertieBotts = new BertieBotts(shortName, weight, price, flavourMix);

        if (honeydukes.addAProduct(bertieBotts))
            System.out.println("Product was added successfully");
        else
            System.out.println("Product already exists");

        this.setHoneydukes(honeydukes);
    }

    private void addAChocolateFrog() {
        Honeydukes honeydukes = this.getHoneydukes();

        Scanner myValue = new Scanner(System.in);

        System.out.println("Enter the weight of this product (in grams):");
        int weight = myValue.nextInt();

        System.out.println("\nEnter the price of this product (in Sickles):");
        int price = myValue.nextInt();

        System.out.println();

        String flavourMix = "";

        boolean correctCommand = false;

        while (!correctCommand) {
            System.out.println("Choose a flavour mix for this product:");
            System.out.println("1. Every flavour imaginable");
            System.out.println("2. Only ordinary tastes: orange, chocolate, etc.");
            System.out.println("3. Extreme flavours for those who likes earwax & dirty socks");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    flavourMix = "Every";
                    correctCommand = true;
                    break;
                case 2:
                    flavourMix = "Ordinary";
                    correctCommand = true;
                    break;
                case 3:
                    flavourMix = "Eeew";
                    correctCommand = true;
                    break;
                default:
                    System.out.println("\nWrong command!\n");
            }
        }

        System.out.println("Enter the short name of this product (no spacing allowed)");
        String shortName = myValue.next();

        BertieBotts bertieBotts = new BertieBotts(shortName, weight, price, flavourMix);

        if (honeydukes.addAProduct(bertieBotts))
            System.out.println("Product was added successfully");
        else
            System.out.println("Product already exists");

        this.setHoneydukes(honeydukes);
    }

    public void addAProductMenu() {
        System.out.println("What type of product do you want to add?");
        System.out.println("1. Bertie Bott's beans");
        System.out.println("2. Chocolate Frog");
        System.out.println("3. Chocolate Wand");
        System.out.println("4. Drooble's Gum");
        System.out.println("5. Sugar Quill");
        System.out.println("6. Go back to previous menu");
    }
}
