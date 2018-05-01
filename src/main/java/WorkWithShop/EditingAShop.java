package WorkWithShop;

import Candies.*;
import Shop.Honeydukes;

import java.io.File;
import java.io.FileNotFoundException;
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

    public void addFromAFile(String filePath) throws FileNotFoundException {
        Scanner myValue = new Scanner(new File(filePath));

        System.out.println("Parsing a file \"" + filePath + "\"...\n");

        String product;
        String fullName;
        String shortName;
        String weight;
        String price;
        String optional;

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
                if (this.addABertieBott(shortName, weight, price, optional))
                    System.out.println("Product №" + i + " added successfully");
                else
                    System.out.println("Ooops! Product №" + i + " already exists");
            } else if (fullName.equals(Description.getChocolateFrogFullName())) {
                if (this.addAChocolateFrog(shortName, weight, price, optional))
                    System.out.println("Product №" + i + " added successfully");
                else
                    System.out.println("Ooops! Product №" + i + " already exists");
            } else if (fullName.equals(Description.getChocolateWandFullName())) {
                if (this.addAChocolateWand(shortName, weight, price, optional))
                    System.out.println("Product №" + i + " added successfully");
                else
                    System.out.println("Ooops! Product №" + i + " already exists");
            } else if (fullName.equals(Description.getDroobleGumFullName())) {
                if (this.addADroobleGum(shortName, weight, price, optional))
                    System.out.println("Product №" + i + " added successfully");
                else
                    System.out.println("Ooops! Product №" + i + " already exists");
            } else if (fullName.equals(Description.getSugarQuillFullName())) {
                if (this.addASugarQuill(shortName, weight, price, optional))
                    System.out.println("Product №" + i + " added successfully");
                else
                    System.out.println("Ooops! Product №" + i + " already exists");
            } else
                System.out.println("Ooops! Wrong product №" + i);
        }
    }

    private boolean addABertieBott(String shortname, String weight, String price, String flavourMix) {
        Honeydukes honeydukes = this.getHoneydukes();

        Integer weightInt = Integer.parseInt(weight);
        Integer priceInt = Integer.parseInt(price);

        BertieBotts bertieBotts = new BertieBotts(shortname, weightInt, priceInt, flavourMix);

        boolean success = honeydukes.addAProduct(bertieBotts);

        this.setHoneydukes(honeydukes);

        return success;
    }

    private boolean addAChocolateFrog(String shortname, String weight, String price, String collectionYear) {
        Honeydukes honeydukes = this.getHoneydukes();

        Integer weightInt = Integer.parseInt(weight);
        Integer priceInt = Integer.parseInt(price);

        ChocolateFrog chocolateFrog = new ChocolateFrog(shortname, weightInt, priceInt, collectionYear);

        boolean success = honeydukes.addAProduct(chocolateFrog);

        this.setHoneydukes(honeydukes);

        return success;
    }

    private boolean addAChocolateWand(String shortname, String weight, String price, String core) {
        Honeydukes honeydukes = this.getHoneydukes();

        Integer weightInt = Integer.parseInt(weight);
        Integer priceInt = Integer.parseInt(price);

        ChocolateWand chocolateWand = new ChocolateWand(shortname, weightInt, priceInt, core);

        boolean success = honeydukes.addAProduct(chocolateWand);

        this.setHoneydukes(honeydukes);

        return success;
    }

    private boolean addADroobleGum(String shortname, String weight, String price, String flavour) {
        Honeydukes honeydukes = this.getHoneydukes();

        Integer weightInt = Integer.parseInt(weight);
        Integer priceInt = Integer.parseInt(price);

        DroobleGum droobleGum = new DroobleGum(shortname, weightInt, priceInt, flavour);

        boolean success = honeydukes.addAProduct(droobleGum);

        this.setHoneydukes(honeydukes);

        return success;
    }

    private boolean addASugarQuill(String shortname, String weight, String price, String deluxe) {
        Honeydukes honeydukes = this.getHoneydukes();

        Integer weightInt = Integer.parseInt(weight);
        Integer priceInt = Integer.parseInt(price);
        boolean deluxeBoolean = deluxe.equals("Deluxe");

        SugarQuill sugarQuill = new SugarQuill(shortname, weightInt, priceInt, deluxeBoolean);

        boolean success = honeydukes.addAProduct(sugarQuill);

        this.setHoneydukes(honeydukes);

        return success;
    }
}
