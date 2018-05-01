package WorkWithShop.Editing;

import Shop.Honeydukes;

import java.util.Scanner;

public class Checking {
    private Honeydukes honeydukes;


    public Checking() {
        this.honeydukes = new Honeydukes();
    }

    public Checking(Honeydukes honeydukes) {
        this.honeydukes = honeydukes;
    }

    public Honeydukes getHoneydukes() {
        return honeydukes;
    }

    public void setHoneydukes(Honeydukes honeydukes) {
        this.honeydukes = honeydukes;
    }

    void checkSomething() {
        Honeydukes honeydukes;
        while (true) {
            Scanner myValue = new Scanner(System.in);

            System.out.println("What do you want to check?");
            System.out.println("1. Products");
            System.out.println("2. Gifts");
            System.out.println("3. Go back");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    honeydukes = this.getHoneydukes();
                    honeydukes.printHoneydukes();
                    break;
                case 2:
                    honeydukes = this.getHoneydukes();
                    honeydukes.printGiftsList();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("\nWrong command\n");
            }
        }
    }
}
