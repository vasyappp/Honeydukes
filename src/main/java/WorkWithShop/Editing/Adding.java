package WorkWithShop.Editing;

import Candies.*;
import Shop.Gift;
import Shop.Honeydukes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
                    this.addProductsManually();
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

        this.setHoneydukes(honeydukes);
    }

    private void addProductsManually () {
        Honeydukes honeydukes = this.getHoneydukes();

        while (true) {
            Scanner myValue = new Scanner(System.in);

            System.out.println("What do you want to do?");
            System.out.println("1. Add Bertie Bott's beans product");
            System.out.println("2. Add Chocolate Frog product");
            System.out.println("3. Add Chocolate Wand product");
            System.out.println("4. Add Drooble's Gum product");
            System.out.println("5. Add Sugar Quill product");
            System.out.println("6. Go back");

            int choice = myValue.nextInt();
            String temp = myValue.nextLine();

            if ((choice > 0) && (choice < 6)) {
                System.out.println("\nEnter short name of the product:");
                String shortName = myValue.nextLine();

                System.out.println("\nEnter weight of the product:");
                String weight = myValue.nextLine();

                System.out.println("\nEnter price of the product:");
                String price = myValue.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("\nEnter flavour mix of the product:");
                        break;
                    case 2:
                        System.out.println("\nEnter collection year of the product:");
                        break;
                    case 3:
                        System.out.println("\nEnter core of the product:");
                        break;
                    case 4:
                        System.out.println("\nEnter flavour of the product:");
                        break;
                    case 5:
                        System.out.println("\nEnter \"Deluxe\" if it's a Deluxe edition:");
                        break;
                    default:
                        System.out.println("\nSomething is going wrong...\n");
                }
                String optional = myValue.nextLine();

                Candy candy = null;

                switch (choice) {
                    case 1:
                        candy = this.generateBertieBott(shortName, weight, price, optional);
                        break;
                    case 2:
                        candy = this.generateChocolateFrog(shortName, weight, price, optional);
                        break;
                    case 3:
                        candy = this.generateChocolateWand(shortName, weight, price, optional);
                        break;
                    case 4:
                        candy = this.generateDroobleGum(shortName, weight, price, optional);
                        break;
                    case 5:
                        candy = this.generateSugarQuill(shortName, weight, price, optional);
                        break;
                    default:
                        System.out.println("\nSomething is going wrong...\n");
                }

                if (candy != null) {
                    if (honeydukes.addAProduct(candy)) {
                        System.out.println("Product added successfully");
                    } else
                        System.out.println("Ooops! Product already exists");
                }
            } else if (choice == 6) {
                System.out.println("\nGoing back...\n");
                this.setHoneydukes(honeydukes);
                return;
            } else
                System.out.println("\nWrong command\n");
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
                    this.addGiftManually();
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

        boolean flagSuccess = false;
        boolean flagNoSuccess = false;

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

                    flagSuccess = true;
                } else {
                    System.out.println("Pack №" + i + " doesn't exist");
                    flagNoSuccess = true;
                }
            } else {
                System.out.println("Type of pack №" + i + " doesn't exist");
                flagNoSuccess = true;
            }
        }

        if (flagNoSuccess) {
            if (flagSuccess) {
                System.out.println("We've faced some problems while trying to read a file");
            } else {
                System.out.println("We couldn't add any products to the gift");
            }

            while (true) {
                System.out.println("Add this gift to Honeydukes? (y - yes, n - no)");

                Scanner myValueAdd = new Scanner(System.in);

                String choice = myValueAdd.nextLine();

                switch (choice) {
                    case "y":
                        if (honeydukes.addAGift(gift)) {
                            System.out.println("Gift added successfully");
                        } else
                            System.out.println("Ooops! Gift already exists");
                        this.setHoneydukes(honeydukes);
                        return;
                    case "n":
                        System.out.println("Gift wasn't added to Honeydukes");
                        return;
                    default:
                        System.out.println("\nWrong command\n");
                }
            }
        } else {
            System.out.println("All products added to gift successfully");
            if (honeydukes.addAGift(gift)) {
                System.out.println("Gift added successfully");
            } else
                System.out.println("Ooops! Gift already exists");

            this.setHoneydukes(honeydukes);
        }
    }

    private void addGiftManually() {
        Honeydukes honeydukes = this.getHoneydukes();

        Scanner myValue = new Scanner(System.in);

        System.out.println("\nEnter the name of the gift:");
        String nameOfGift = myValue.nextLine();

        System.out.println("\nEnter the description of the gift");
        String description = myValue.nextLine();

        System.out.println();

        Gift gift = new Gift(new HashMap<>(), nameOfGift, description);

        while (true) {
            System.out.println("What type of product you want to add?");
            System.out.println("1. Bertie Bott's beans");
            System.out.println("2. Chocolate Frog");
            System.out.println("3. Chocolate Wand");
            System.out.println("4. Drooble's Gum");
            System.out.println("5. Sugar Quill");
            System.out.println("6. Check current gift");
            System.out.println("7. Go back");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    gift = this.addGiftManuallyChoose(gift, Description.getBertieBottsFullName());
                    break;
                case 2:
                    gift = this.addGiftManuallyChoose(gift, Description.getChocolateFrogFullName());
                    break;
                case 3:
                    gift = this.addGiftManuallyChoose(gift, Description.getChocolateWandFullName());
                    break;
                case 4:
                    gift = this.addGiftManuallyChoose(gift, Description.getDroobleGumFullName());
                    break;
                case 5:
                    gift = this.addGiftManuallyChoose(gift, Description.getSugarQuillFullName());
                    break;
                case 6:
                    gift.print();
                    break;
                case 7:
                    while (true) {
                        System.out.println("\nWanna save the gift?");
                        System.out.println("1. Save current gift");
                        System.out.println("2. Delete current gift");

                        int choiceExit = myValue.nextInt();

                        switch (choiceExit) {
                            case 1:
                                honeydukes.addAGift(gift);
                                this.setHoneydukes(honeydukes);
                                return;
                            case 2:
                                return;
                            default:
                                System.out.println("\nWrong command\n");
                        }
                    }
                default:
                    System.out.println("\nWrong command\n");
            }
        }
    }

    private Gift addGiftManuallyChoose(Gift gift, String key) {
        Honeydukes honeydukes = this.getHoneydukes();

        ArrayList<Candy> products = honeydukes.getProducts().get(key);

        if (!products.isEmpty()) {
            while (true) {
                Scanner myValue = new Scanner(System.in);

                int i = 0;

                System.out.println("Which product of the type \"" + key + "\" you want to add?");

                for (Candy candy : products) {
                    i++;

                    System.out.println(i + ". Add product №" + i + ": " + candy.getShortName());
                }

                int maxProduct = i;

                System.out.println((maxProduct + 1) + ". Check all products of the type \"" + key + "\"");
                System.out.println((maxProduct + 2) + ". Go back");

                int choice = myValue.nextInt();

                if ((choice > 0) && (choice <= maxProduct)) {
                    Candy candy = products.get(choice - 1);

                    System.out.println("\nEnter the amount of product:");
                    int amount = myValue.nextInt();

                    gift.addAPack(candy, amount);

                    System.out.println("Product added successfully");
                } else if (choice == maxProduct + 1) {
                    honeydukes.printOneList(key);
                } else if (choice == maxProduct + 2) {
                    System.out.println("\nGoing back...\n");
                    return gift;
                } else
                    System.out.println("\nWrong command\n");
            }
        } else {
            System.out.println("Ooops! No products of the type \"" + key + "\" found");
            return gift;
        }
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
