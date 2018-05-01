package WorkWithShop;

import Candies.*;
import Shop.Gift;
import Shop.Honeydukes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
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

    public void setProductsFromFile(String filePath) throws FileNotFoundException {
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

    public void setGiftFromFile(String filePath) throws FileNotFoundException {
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
