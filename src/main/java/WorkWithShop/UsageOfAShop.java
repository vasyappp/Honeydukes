package WorkWithShop;

import Candies.*;
import Shop.Gift;
import Shop.Honeydukes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Класс UsageOfAShop
 * Описывает работу пользователя-покупателя с магазином
 * (Не позволяет редактировать ассортимент магазина, только просматривать список продуктов,
 * а также составлять и покупать подарки)
 *
 * @see Candies
 * @see Shop
 *
 * @author Natalia Litvinova
 */

public class UsageOfAShop {
    private Honeydukes honeydukes;

    public UsageOfAShop(Honeydukes honeydukes) {
        this.honeydukes = honeydukes;
    }

    public Honeydukes getHoneydukes() {
        return honeydukes;
    }

    public void setHoneydukes(Honeydukes honeydukes) {
        this.honeydukes = honeydukes;
    }

    public void mainMenu() {
        Honeydukes honeydukes = this.getHoneydukes();

        Scanner myValue = new Scanner(System.in);

        while(true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Check the list of products in Honeydukes");
            System.out.println("2. Buy a gift for the upcoming New Year");
            System.out.println("3. Go back to previous menu");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    // Просмотр всех доступных продуктов
                    System.out.println("\nGoing to check products...\n");
                    this.checkProducts();
                    break;
                case 2:
                    // Покупка подарка
                    System.out.println("\nGoing to buy a gift...\n");
                    this.getAGift();
                    break;
                case 3:
                    // Выход из программы
                    System.out.println("\nGoing back to previous menu...\n");
                    return;
                default:
                    // Вывод ошибки некорректной команды
                    System.out.println("\nWrong command!\n");
                    break;
            }
        }
    }

    private void checkProducts() {
        Honeydukes honeydukes = this.getHoneydukes();

        Scanner myValue = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to check?");
            System.out.println("1. Check all products");
            System.out.println("2. Bertie Bott's beans products");
            System.out.println("3. Chocolate Frogs products");
            System.out.println("4. Chocolate Wands products");
            System.out.println("5. Drooble's gums products");
            System.out.println("6. Sugar Quills");
            System.out.println("7. Go back to main menu");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    // Вызов метода вывода всех продуктов
                    System.out.println("\nChecking all products:\n");
                    honeydukes.printHoneydukes();
                    break;
                case 2:
                    // Вызов метода вывода продуктов типа "Драже Берти Боттс"
                    System.out.println("\nChecking Bertie Bott's beans products:\n");
                    honeydukes.printOneList(Description.getBertieBottsFullName());
                    break;
                case 3:
                    // Вызов метода вывода продуктов типа "Шоколадная лягушка"
                    System.out.println("\nChecking Chocolate Frogs products:\n");
                    honeydukes.printOneList(Description.getChocolateFrogFullName());
                    break;
                case 4:
                    // Вызов метода вывода продуктов типа "Шоколадная волшебная палочка"
                    System.out.println("\nChecking Chocolate Wands products:\n");
                    honeydukes.printOneList(Description.getChocolateWandFullName());
                    break;
                case 5:
                    // Вызов метода вывода продуктов типа "Жвачка Друбла"
                    System.out.println("\nChecking Drooble's gums products:\n");
                    honeydukes.printOneList(Description.getDroobleGumFullName());
                    break;
                case 6:
                    // Вызов метода вывода продуктов типа "Сахарное перо для письма"
                    System.out.println("\nChecking Sugar Quills products:\n");
                    honeydukes.printOneList(Description.getSugarQuillFullName());
                    break;
                case 7:
                    // Возврат к прошлому меню
                    System.out.println("\nGoing back to main menu...\n");
                    return;
                default:
                    // Вывод ошибки некорректной команды
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Check more!\n");
        }
    }

    private void getAGift() {
        Scanner myValue = new Scanner(System.in);

        while (true) {
            System.out.println("We have prepared some gifts for you! Do you want one? Or do you want to create a pack?");
            System.out.println("1. Buy a prepared gift");
            System.out.println("2. Create a gift");
            System.out.println("3. Go back to main menu");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    // Вызов метода выбора готового подарка
                    System.out.println("\nGoing to buy a prepared gift...\n");
                    this.getAPreparedGift();
                    break;
                case 2:
                    // Вызов метода создания подарка
                    System.out.println("\nGoing to create a gift...\n");
                    this.createAGift();
                    break;
                case 3:
                    // Возврат к прошлому меню
                    System.out.println("\nGoing back to main menu...\n");
                    return;
                default:
                    // Вывод ошибки некорректной команды
                    System.out.println("\nWrong command!\n");
            }
        }
    }

    private void getAPreparedGift() {
        Honeydukes honeydukes = this.getHoneydukes();

        Scanner myValue = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Check the list of prepared gifts");
            System.out.println("2. Buy a prepared gift");
            System.out.println("3. Go back to previous menu");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nChecking the list of prepared gifts...\n");
                    honeydukes.printGiftsList();
                    break;
                case 2:
                    System.out.println("\nEnter the number of a gift:");
                    int number = myValue.nextInt();
                    if ((number <= honeydukes.getGifts().size()) && (number > 0)) {
                        System.out.println();
                        honeydukes.getGifts().get(number - 1).print();
                    } else
                        System.out.println("\nWrong number of a gift\n");
                    break;
                case 3:
                    System.out.println("\nGoing back to previous menu...\n");
                    return;
                default:
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Moar prepared gifts!\n");
        }
    }

    private void createAGift() {
        Honeydukes honeydukes = this.getHoneydukes();

        Gift gift = new Gift();

        Scanner myValue = new Scanner(System.in);

        while (true) {
            System.out.println("Which product do you want to add?");

            int i = 1;

            for (String key : honeydukes.getProducts().keySet()) {
                System.out.println(i + ". " + key);
                i++;
            }

            int deeperCommands = i - 1;

            System.out.println((deeperCommands + 1) + ". Check my current gift");
            System.out.println((deeperCommands + 2) + ". Go back to gift picking");

            int choice = myValue.nextInt();

            if ((choice > 0) && (choice <= deeperCommands)) {
                String key = this.findAKey(choice - 1);

                System.out.println("\nGoing to add a product \"" + key + "\"\n");

                gift = this.addAProduct(gift, key);
            } else if (choice == deeperCommands + 1) {
                System.out.println("\nChecking your current gift\n");
                gift.print();
            } else if (choice== deeperCommands + 2) {
                System.out.println("\nGoing back...\n");
                return;
            } else
                System.out.println("\bWrong command\n");

            System.out.println("Choose another type of product\n");
        }
    }

    private String findAKey(int number) {
        Honeydukes honeydukes = this.getHoneydukes();
        int i = 0;

        for (String key : honeydukes.getProducts().keySet()) {
            if (i == number)
                return key;
            else
                i++;
        }

        return "";
    }

    private Gift addAProduct(Gift gift, String key) {
        Honeydukes honeydukes = this.getHoneydukes();

        ArrayList<Candy> productList = honeydukes.getProducts().get(key);

        Scanner myValue = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do?");

            int i = 0;

            for (Candy product : productList) {
                i++;
                System.out.println(i + ". Add the product №" + i + ": " + product.getShortName());
            }

            int maxProduct = i;

            System.out.println((maxProduct + 1) + ". Check all products of the type \"" + key + "\"");
            System.out.println((maxProduct + 2) + ". Go back to add a different product");

            int choice = myValue.nextInt();

            if (choice == maxProduct + 1) {
                System.out.println("\nChecking the list of product \"" + key + "\"\n");
                honeydukes.printOneList(key);
            } else
            if ((choice > 0) && (choice <= maxProduct)) {
                System.out.println("\nEnter the amount of the product:");
                int amount = myValue.nextInt();

                gift.addAPack(productList.get(i - 1), amount);
                System.out.println("\nProduct added successfully!\n");
            } else if (choice == maxProduct + 2) {
                System.out.println("\nGoing back...\n");
                return gift;
            } else
                System.out.println("\nWrong command\n");

            System.out.println("Continue adding\n");
        }
    }
}
