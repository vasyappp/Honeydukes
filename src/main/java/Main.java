import Candies.*;
import Shop.*;
import Print.*;

import java.util.Scanner;

public class Main {
    private static Honeydukes generateHoneydukes() {
        BertieBotts bertieBottsMediumEveryPack = new BertieBotts(100, 6, "Every");
        BertieBotts bertieBottsBigEveryPack = new BertieBotts(200, 10, "Every");
        BertieBotts bertieBottsSmallEveryPack = new BertieBotts(50, 4, "Every");
        BertieBotts bertieBottsOrdinaryPack = new BertieBotts(100, 7, "Ordinary");
        BertieBotts bertieBottsEeewPack = new BertieBotts(100, 7, "Eeew");

        BertieBotts[] bertieBotts = {bertieBottsSmallEveryPack,
                bertieBottsMediumEveryPack, bertieBottsBigEveryPack, bertieBottsOrdinaryPack, bertieBottsEeewPack};

        ChocolateFrog frogXVIII = new ChocolateFrog(5, "1700 - 1799");
        ChocolateFrog frogXIX = new ChocolateFrog(4, "1800 - 1899");
        ChocolateFrog frogXX = new ChocolateFrog(3, "1900 - 1999");
        ChocolateFrog frogXXI = new ChocolateFrog(3, "2000 - 2018");

        ChocolateFrog[] frogs = {frogXVIII, frogXIX, frogXX, frogXXI};

        ChocolateWand wandUnicorn = new ChocolateWand(45, "Unicorn hair");
        ChocolateWand wandPhoenix = new ChocolateWand(46, "Phoenix feather");
        ChocolateWand wandDragon = new ChocolateWand(50, "Dragon heartstring");

        ChocolateWand[] wands = {wandUnicorn, wandPhoenix, wandDragon};

        DroobleGum gumCrazyberry = new DroobleGum(18, 2, "Crazyberry");
        DroobleGum gumBerry = new DroobleGum(17, 2, "Berry");

        DroobleGum[] gums = {gumCrazyberry, gumBerry};

        SugarQuill quillDeluxe = new SugarQuill(true);
        SugarQuill quillNotDeluxe = new SugarQuill(false);

        SugarQuill[] quills = {quillDeluxe, quillNotDeluxe};

        Candy[][] products = {bertieBotts, frogs, wands, gums, quills};

        Candy[] weasleyWillPack = {bertieBottsSmallEveryPack, frogXX, frogXXI,
                wandUnicorn, gumCrazyberry, gumBerry, quillNotDeluxe};
        int[] weasleyWillAmount = {1, 1, 1, 1, 2, 2};

        Gift weasleyWill = new Gift(weasleyWillPack, weasleyWillAmount,6);

        Candy[] malfoysMightPack = {bertieBottsBigEveryPack, frogXVIII, frogXIX, frogXX, frogXXI, wandDragon,
                wandPhoenix, wandUnicorn, gumBerry, gumCrazyberry, quillDeluxe};
        int[] malfoysMightAmount = {3, 10, 8, 5, 5, 5, 5, 5, 10, 10, 5};

        Gift malfoysMight = new Gift(malfoysMightPack, malfoysMightAmount, 11);

        Candy[] dracoIsADouchePack = {bertieBottsEeewPack};
        int[] dracoIsADoucheAmount = {3};

        Gift dracoIsADouche = new Gift(dracoIsADouchePack, dracoIsADoucheAmount, 1);

        Candy[] potterPaysPack = {bertieBottsMediumEveryPack, frogXVIII, frogXIX, frogXX, frogXXI,
                wandDragon, wandPhoenix, wandUnicorn, gumBerry, gumCrazyberry, quillNotDeluxe};
        int[] potterPaysAmount = {1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};

        Gift potterPays = new Gift(potterPaysPack, potterPaysAmount,11);

        Gift[] gifts = {weasleyWill, malfoysMight, potterPays, dracoIsADouche};

        return new Honeydukes(products, gifts);
    }

    private static void checkProducts(Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);

        while (true) {
            Menu.printMenuProducts();

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nChecking all products:\n");
                    honeydukes.printHoneydukes();
                    break;
                case 2:
                    System.out.println("\nChecking Bertie Bott's beans products:\n");
                    honeydukes.printBertieBottsList();
                    break;
                case 3:
                    System.out.println("\nChecking Chocolate Frogs products:\n");
                    honeydukes.printFrogsList();
                    break;
                case 4:
                    System.out.println("\nChecking Chocolate Wands products:\n");
                    honeydukes.printWandsList();
                    break;
                case 5:
                    System.out.println("\nChecking Drooble's gums products:\n");
                    honeydukes.printGumsList();
                    break;
                case 6:
                    System.out.println("\nChecking Sugar Quills products:\n");
                    honeydukes.printQuillsList();
                    break;
                case 7:
                    System.out.println("\nGoing back to main menu...\n");
                    return;
                default:
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Check more!\n");
        }
    }

    private static void getAGift(Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);

        while (true) {
            Menu.printMenuGift();

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    getAPreparedGift(honeydukes);
                    break;
                case 2:
                    createAGiftAdding(honeydukes);
                    break;
                case 3:
                    System.out.println("\nGoing back to main menu...\n");
                    return;
                default:
                    System.out.println("\nWrong command!\n");
            }
        }
    }

    private static void getAPreparedGift(Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);

        System.out.println();

        while (true) {
            Menu.printMenuGiftPrepared();

            Gift[] gifts = honeydukes.getGifts();

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    gifts[0].print();
                    break;
                case 2:
                    gifts[1].print();
                    break;
                case 3:
                    gifts[2].print();
                    break;
                case 4:
                    gifts[3].print();
                    break;
                case 5:
                    System.out.println("\nGoing back to gift picking...\n");
                    return;
                default:
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Pick another gift!\n");
        }
    }

    private static void createAGiftAdding(Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);

        Gift gift = new Gift();

        System.out.println();

        while (true) {
            Menu.printMenuGiftCreating();

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    gift = createAGiftBertieBotts(gift, honeydukes);
                    break;
                case 2:
                    gift = createAGiftFrogs(gift,honeydukes);
                    break;
                case 3:
                    gift = createAGiftWands(gift, honeydukes);
                    break;
                case 4:
                    gift = createAGiftGums(gift, honeydukes);
                    break;
                case 5:
                    gift = createAGiftQuills(gift,honeydukes);
                    break;
                case 6:
                    System.out.println("\nYour gift's info:\n");
                    gift.print();
                    break;
                case 7:
                    System.out.println("\nGoing back to gift picking...\n");
                    return;
                default:
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Wanna add something else?\n");
        }

    }

    private static Gift createAGiftBertieBotts(Gift gift, Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);
        BertieBotts[] bertieBotts = (BertieBotts[])honeydukes.getProducts()[0];
        int choice;
        int amount;

        System.out.println();

        while (true) {
            Menu.printMenuGiftCreatingBertie();

            choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nChecking Bertie Bott's Beans products:\n");
                    honeydukes.printBertieBottsList();
                    break;
                case 2:
                    System.out.println("\nHow many packs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(bertieBotts[0], amount);
                    System.out.println("\nPacks added!\n");
                    break;
                case 3:
                    System.out.println("\nHow many packs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(bertieBotts[1], amount);
                    System.out.println("\nPacks added!\n");
                    break;
                case 4:
                    System.out.println("\nHow many packs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(bertieBotts[2], amount);
                    System.out.println("\nPacks added!\n");
                    break;
                case 5:
                    System.out.println("\nHow many packs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(bertieBotts[3], amount);
                    System.out.println("\nPacks added!\n");
                    break;
                case 6:
                    System.out.println("\nHow many packs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(bertieBotts[4], amount);
                    System.out.println("\nPacks added!\n");
                    break;
                case 7:
                    System.out.println("\nGoing back to picking...\n");
                    return gift;
                default:
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Pick another Bertie Bott's beans pack!\n");
        }
    }

    private static Gift createAGiftFrogs(Gift gift, Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);
        ChocolateFrog[] frogs = (ChocolateFrog[])honeydukes.getProducts()[1];
        int choice;
        int amount;

        System.out.println();

        while (true) {
            Menu.printMenuGiftCreatingFrogs();

            choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nChecking Chocolate Frogs products:\n");
                    honeydukes.printFrogsList();
                    break;
                case 2:
                    System.out.println("\nHow many frogs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(frogs[0], amount);
                    System.out.println("\nFrogs added!\n");
                    break;
                case 3:
                    System.out.println("\nHow many frogs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(frogs[1], amount);
                    System.out.println("\nFrogs added!\n");
                    break;
                case 4:
                    System.out.println("\nHow many frogs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(frogs[2], amount);
                    System.out.println("\nFrogs added!\n");
                    break;
                case 5:
                    System.out.println("\nHow many frogs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(frogs[3], amount);
                    System.out.println("\nFrogs added!\n");
                    break;
                case 6:
                    System.out.println("\nGoing back to picking...\n");
                    return gift;
                default:
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Pick another Chocolate Frog!\n");
        }
    }

    private static Gift createAGiftWands(Gift gift, Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);
        ChocolateWand[] wands = (ChocolateWand[])honeydukes.getProducts()[2];
        int choice;
        int amount;

        System.out.println();

        while (true) {
            Menu.printMenuGiftCreatingWands();

            choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nChecking Chocolate Wands products:\n");
                    honeydukes.printWandsList();
                    break;
                case 2:
                    System.out.println("\nHow many wands do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(wands[0], amount);
                    System.out.println("\nWands added!\n");
                    break;
                case 3:
                    System.out.println("\nHow many wands do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(wands[1], amount);
                    System.out.println("\nWands added!\n");
                    break;
                case 4:
                    System.out.println("\nHow many wands do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(wands[2], amount);
                    System.out.println("\nWands added!\n");
                    break;
                case 5:
                    System.out.println("\nGoing back to picking...\n");
                    return gift;
                default:
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Pick another Chocolate Wand!\n");
        }
    }

    private static Gift createAGiftGums(Gift gift, Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);
        DroobleGum[] gums = (DroobleGum[])honeydukes.getProducts()[3];
        int choice;
        int amount;

        System.out.println();

        while (true) {
            Menu.printMenuGiftCreatingGums();

            choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nChecking Drooble's gum products:\n");
                    honeydukes.printGumsList();
                    break;
                case 2:
                    System.out.println("\nHow many gums do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(gums[0], amount);
                    System.out.println("\nGums added!\n");
                    break;
                case 3:
                    System.out.println("\nHow many gums do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(gums[1], amount);
                    System.out.println("\nGums added!\n");
                    break;
                case 4:
                    System.out.println("\nGoing back to picking...\n");
                    return gift;
                default:
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Pick another Drooble's Gum!\n");
        }
    }

    private static Gift createAGiftQuills (Gift gift, Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);
        SugarQuill[] quills = (SugarQuill[])honeydukes.getProducts()[4];
        int choice;
        int amount;

        System.out.println();

        while (true) {
            Menu.printMenuGiftCreatingQuills();

            choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nChecking Sugar Quills products:\n");
                    honeydukes.printQuillsList();
                    break;
                case 2:
                    System.out.println("\nHow many quills do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(quills[0], amount);
                    System.out.println("\nQuills added!\n");
                    break;
                case 3:
                    System.out.println("\nHow many quills do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(quills[1], amount);
                    System.out.println("\nQuills added!\n");
                    break;
                case 4:
                    System.out.println("\nGoing back to picking...\n");
                    return gift;
                default:
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Pick another Sugar Quill!\n");
        }
    }

    public static void main(String[] args) {
        Scanner myValue = new Scanner(System.in);
        Honeydukes honeydukes = generateHoneydukes();

        System.out.println("Welcome to Honeydukes!\n");

        while (true) {
            Menu.printMenu();
            int choice = myValue.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    checkProducts(honeydukes);
                    break;
                case 2:
                    getAGift(honeydukes);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    myValue.close();
                    return;
                default:
                    System.out.println("Wrong command!\n");
                    break;
            }
        }
    }
}
