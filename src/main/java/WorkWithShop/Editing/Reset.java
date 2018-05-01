package WorkWithShop.Editing;

import Shop.Honeydukes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Reset {
    private Honeydukes honeydukes;


    public Reset() {
        this.honeydukes = new Honeydukes();
    }

    public Reset(Honeydukes honeydukes) {
        this.honeydukes = honeydukes;
    }

    public Honeydukes getHoneydukes() {
        return honeydukes;
    }

    public void setHoneydukes(Honeydukes honeydukes) {
        this.honeydukes = honeydukes;
    }

    void resetSomething() {
        while (true) {
            Scanner myValue = new Scanner(System.in);

            System.out.println("What do you want to reset?");
            System.out.println("1. Products");
            System.out.println("2. Gifts");
            System.out.println("3. EVERYTHING!!!");
            System.out.println("4. I've changed my mind, go back");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    this.resetProducts();
                    break;
                case 2:
                    this.resetGifts();
                    break;
                case 3:
                    this.resetHoneydukes();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("\nWrong command\n");
            }
        }
    }

    private void resetProducts() {
        while (true) {
            Scanner myValue = new Scanner(System.in);

            System.out.println("Are you sure you want to reset all products from Honeydukes? (y - yes, n - no)");

            String choice = myValue.nextLine();

            switch (choice) {
                case "y":
                    Honeydukes honeydukes = this.getHoneydukes();
                    honeydukes.setProducts(new HashMap<>());
                    this.setHoneydukes(honeydukes);
                    return;
                case "n":
                    return;
                default:
                    System.out.println("\nWrong command\n");
            }
        }
    }

    private void resetGifts() {
        while (true) {
            Scanner myValue = new Scanner(System.in);

            System.out.println("Are you sure you want to reset all gifts from Honeydukes? (y - yes, n - no)");

            String choice = myValue.nextLine();

            switch (choice) {
                case "y":
                    Honeydukes honeydukes = this.getHoneydukes();
                    honeydukes.setGifts(new ArrayList<>());
                    this.setHoneydukes(honeydukes);
                    return;
                case "n":
                    return;
                default:
                    System.out.println("\nWrong command\n");
            }
        }
    }

    private void resetHoneydukes() {
        Scanner myValue = new Scanner(System.in);

        while (true) {
            System.out.println("Are you sure you want to reset Honeydukes? (y - yes, n - no)");

            String choice = myValue.nextLine();

            switch (choice) {
                case "y":
                    this.honeydukes = new Honeydukes();
                    return;
                case "n":
                    return;
                default:
                    System.out.println("\nWrong command\n");
            }
        }
    }
}
