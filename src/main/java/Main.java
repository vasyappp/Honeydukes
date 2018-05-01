import WorkWithShop.Editing.EditingAShop;
import WorkWithShop.UsageOfAShop;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Main класс
 * Формирование новогоднего подарка из списка доступных продуктов
 *
 * @author Natalia Litvinova
 */

public class Main {
    /**
     * Метод main
     * Генерирует список доступных товаров и готовых подарков, выводит первое меню выбора действия
     *
     * @param args args
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner myValue = new Scanner(System.in);

        EditingAShop editingAShop = new EditingAShop();
        editingAShop.setPlainHoneydukes();

        System.out.println("Welcome to Honeydukes!\n");

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Enter a shop");
            System.out.println("2. Open a \"Forbidden Forest\" door");
            System.out.println("3. Exit");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    UsageOfAShop usage = new UsageOfAShop(editingAShop.getHoneydukes());
                    System.out.println("\nEntering a shop...\n");
                    usage.mainMenu();
                    break;
                case 2:
                    System.out.println("\nThis area is only for the shop's stuff!");
                    System.out.println("Just like a Forbidden Forest it is...");
                    System.out.println("you know...");
                    System.out.println("forbidden.");
                    System.out.println("You need to know a secret password to enter this area\n");
                    editingAShop.requirePassword();
                    break;
                case 3:
                    System.out.println("\nGoodbye\n");
                    return;
                default:
                    System.out.println("\nWrong command\n");
            }
        }
    }
}
