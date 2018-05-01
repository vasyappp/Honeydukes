package WorkWithShop.Editing;

import Candies.*;
import Shop.Gift;
import Shop.Honeydukes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Adding {
    private Honeydukes honeydukes;


    public Adding() {
        this.honeydukes = new Honeydukes();
    }

    public Adding(Honeydukes honeydukes) {
        this.honeydukes = honeydukes;
    }

    public Honeydukes getHoneydukes() {
        return honeydukes;
    }

    public void setHoneydukes(Honeydukes honeydukes) {
        this.honeydukes = honeydukes;
    }

    void addSomething() throws FileNotFoundException {
        while (true) {
            Scanner myValue = new Scanner(System.in);

            System.out.println("What do you want to add?");
            System.out.println("1. Add products");
            System.out.println("2. Add gifts");
            System.out.println("3. Go back");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    this.addProducts();
                    break;
                case 2:
                    this.addGifts();
                    break;
                case 3:
                    System.out.println("\nGoing back...\n");
                    return;
                default:
                    System.out.println("\nWrong command\n");
            }
        }
    }

    private void addProducts() throws FileNotFoundException {
        while (true) {
            Scanner myValue = new Scanner(System.in);

            System.out.println("How do you want to add products?");
            System.out.println("1. From a file");
            System.out.println("2. Manually");
            System.out.println("3. Go back");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    this.addProductsFiles();
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("\nGoing back...\n");
                    return;
                default:
                    System.out.println("\nWrong command\n");
            }
        }
    }

    private void addProductsFiles() throws FileNotFoundException {
        while (true) {
            Scanner myValue = new Scanner(System.in);

            System.out.println("What do you want to do?");
            System.out.println("1. Pick a file");
            System.out.println("2. Go back");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter a file path:");
                    String filePath = myValue.nextLine();
                    filePath = myValue.nextLine();
                    this.addProductsFromFile(filePath);
                    break;
                case 2:
                    System.out.println("\nGoing back...\n");
                    return;
                default:
                    System.out.println("\nWrong command\n");
            }
        }
    }

    private void addProductsFromFile(String filePath) throws FileNotFoundException {
        Honeydukes honeydukes = this.getHoneydukes();

        Scanner myValue = new Scanner(new File(filePath));

        System.out.println("Parsing a file \"" + filePath + "\"...\n");

        String product;
        String fullName;
        String shortName;
        String weight;
        String price;
        String optional;

        Candy candy = null;

        while (myValue.hasNext()) {
            boolean flag = true;

            product = myValue.nextLine();
            Integer i = Integer.parseInt(product);

            if (!myValue.hasNext()) {
                System.out.println("Oops! Something went wrong with product №" + i);
                return;
            } else
                fullName = myValue.nextLine();

            if (!myValue.hasNext()) {
                System.out.println("Oops! Something went wrong with product №" + i);
                return;
            } else
                shortName = myValue.nextLine();

            if (!myValue.hasNext()) {
                System.out.println("Oops! Something went wrong with product №" + i);
                return;
            } else
                weight = myValue.nextLine();

            if (!myValue.hasNext()) {
                System.out.println("Oops! Something went wrong with product №" + i);
                return;
            } else
                price = myValue.nextLine();

            if (!myValue.hasNext()) {
                System.out.println("Oops! Something went wrong with product №" + i);
                return;
            } else
                optional = myValue.nextLine();

            if (fullName.equals(Description.getBertieBottsFullName())) {
                candy = generateBertieBott(shortName, weight, price, optional);
            } else if (fullName.equals(Description.getChocolateFrogFullName())) {
                candy = generateChocolateFrog(shortName, weight, price, optional);
            } else if (fullName.equals(Description.getChocolateWandFullName())) {
                candy = generateChocolateWand(shortName, weight, price, optional);
            } else if (fullName.equals(Description.getDroobleGumFullName())) {
                candy = generateDroobleGum(shortName, weight, price, optional);
            } else if (fullName.equals(Description.getSugarQuillFullName())) {
                candy = generateSugarQuill(shortName, weight, price, optional);
            } else {
                System.out.println("Ooops! Wrong product №" + i);
                flag = false;
            }

            if (flag) {
                if (honeydukes.addAProduct(candy))
                    System.out.println("Product №" + i + " added successfully");
                else
                    System.out.println("Ooops! Product №" + i + " already exists");
            }
        }
    }

    private void addGifts() throws FileNotFoundException {
        while (true) {
            Scanner myValue = new Scanner(System.in);

            System.out.println("How do you want to add gifts?");
            System.out.println("1. From a file");
            System.out.println("2. Manually");
            System.out.println("3. Go back");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    this.addGiftsFiles();
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("\nGoing back...\n");
                    return;
                default:
                    System.out.println("\nWrong command\n");
            }
        }
    }

    private void addGiftsFiles() throws FileNotFoundException {
        while (true) {
            Scanner myValue = new Scanner(System.in);

            System.out.println("What do you want to do?");
            System.out.println("1. Pick a file");
            System.out.println("2. Go back");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter a file path:");
                    String filePath = myValue.nextLine();
                    filePath = myValue.nextLine();
                    this.addGiftFromFile(filePath);
                    break;
                case 2:
                    System.out.println("\nGoing back...\n");
                    return;
                default:
                    System.out.println("\nWrong command\n");
            }
        }
    }

    private void addGiftFromFile(String filePath) throws FileNotFoundException {
        Honeydukes honeydukes = this.getHoneydukes();

        Scanner myValue = new Scanner(new File(filePath));

        System.out.println("Parsing a file\"" + filePath + "\"...\n");

        String nameOfGift;
        String descriptionOfGift;

        if (!myValue.hasNext()) {
            System.out.println("Oops! Something went wrong with a gift");
            return;
        } else
            nameOfGift = myValue.nextLine();

        if (!myValue.hasNext()) {
            System.out.println("Oops! Something went wrong with a gift");
            return;
        } else
            descriptionOfGift = myValue.nextLine();

        Gift gift = new Gift(new HashMap<>(), nameOfGift, descriptionOfGift);

        String product;
        String fullName;
        String shortName;
        String amount;

        Candy candy;

        while (myValue.hasNext()) {
            product = myValue.nextLine();
            Integer i = Integer.parseInt(product);

            if (!myValue.hasNext()) {
                System.out.println("Oops! Something went wrong with product №" + i);
                return;
            } else
                fullName = myValue.nextLine();

            if (!myValue.hasNext()) {
                System.out.println("Oops! Something went wrong with product №" + i);
                return;
            } else
                shortName = myValue.nextLine();

            if (!myValue.hasNext()) {
                System.out.println("Oops! Something went wrong with product №" + i);
                return;
            } else
                amount = myValue.nextLine();

            candy = honeydukes.findProduct(fullName, shortName);

            if (candy != null) {
                if (candy.getShortName().equals(shortName)) {
                    Integer amountInt = Integer.parseInt(amount);

                    gift.addAPack(candy, amountInt);

                    System.out.println("Pack №" + i + " added successfully");
                } else
                    System.out.println("Pack №" + i + " doesn't exist");
            } else
                System.out.println("Type of pack №" + i + " doesn't exist");
        }

        if (honeydukes.addAGift(gift)) {
            System.out.println("Gift added successfully");
        } else
            System.out.println("Ooops! Gift already exists");
    }

    private BertieBotts generateBertieBott(String shortname, String weight, String price, String flavourMix) {
        Integer weightInt = Integer.parseInt(weight);
        Integer priceInt = Integer.parseInt(price);

        BertieBotts bertieBotts = new BertieBotts(shortname, weightInt, priceInt, flavourMix);

        return bertieBotts;
    }

    private ChocolateFrog generateChocolateFrog(String shortname, String weight, String price, String collectionYear) {
        Integer weightInt = Integer.parseInt(weight);
        Integer priceInt = Integer.parseInt(price);

        ChocolateFrog chocolateFrog = new ChocolateFrog(shortname, weightInt, priceInt, collectionYear);

        return chocolateFrog;
    }

    private ChocolateWand generateChocolateWand(String shortname, String weight, String price, String core) {
        Integer weightInt = Integer.parseInt(weight);
        Integer priceInt = Integer.parseInt(price);

        ChocolateWand chocolateWand = new ChocolateWand(shortname, weightInt, priceInt, core);

        return chocolateWand;
    }

    private DroobleGum generateDroobleGum(String shortname, String weight, String price, String flavour) {
        Integer weightInt = Integer.parseInt(weight);
        Integer priceInt = Integer.parseInt(price);

        DroobleGum droobleGum = new DroobleGum(shortname, weightInt, priceInt, flavour);

        return droobleGum;
    }

    private SugarQuill generateSugarQuill(String shortname, String weight, String price, String deluxe) {
        Integer weightInt = Integer.parseInt(weight);
        Integer priceInt = Integer.parseInt(price);
        boolean deluxeBoolean = deluxe.equals("Deluxe");

        SugarQuill sugarQuill = new SugarQuill(shortname, weightInt, priceInt, deluxeBoolean);

        return sugarQuill;
    }
}
