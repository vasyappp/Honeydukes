package WorkWithShop.Editing;

import Candies.*;
import Shop.Honeydukes;

import java.util.ArrayList;
import java.util.Scanner;

public class Changing {
    Honeydukes honeydukes;


    Changing() {
        this.honeydukes = new Honeydukes();
    }

    Changing(Honeydukes honeydukes) {
        this.honeydukes = honeydukes;
    }

    public Honeydukes getHoneydukes() {
        return honeydukes;
    }

    public void setHoneydukes(Honeydukes honeydukes) {
        this.honeydukes = honeydukes;
    }

    void changeSomething() {
        while (true) {
            Scanner myValue = new Scanner(System.in);

            System.out.println("What do you want to change?");
            System.out.println("1. Change some products");
            System.out.println("2. Change some gifts");
            System.out.println("3. Go back");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    this.changeProducts();
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

    private void changeProducts() {
        while (true) {
            Scanner myValue = new Scanner(System.in);

            System.out.println("Product of which type you want to change?");
            System.out.println("1. Bertie Bott's beans");
            System.out.println("2. Chocolate Frog");
            System.out.println("3. Chocolate Wand");
            System.out.println("4. Drooble's Gum");
            System.out.println("5. Sugar Quill");
            System.out.println("6. Go back");

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    this.changeProductPick(Description.getBertieBottsFullName());
                    break;
                case 2:
                    this.changeProductPick(Description.getChocolateFrogFullName());
                    break;
                case 3:
                    this.changeProductPick(Description.getChocolateWandFullName());
                    break;
                case 4:
                    this.changeProductPick(Description.getDroobleGumFullName());
                    break;
                case 5:
                    this.changeProductPick(Description.getSugarQuillFullName());
                    break;
                case 6:
                    System.out.println("\nGoing back...\n");
                    return;
                default:
                    System.out.println("\nWrong command\n");
            }
        }
    }

    private void changeProductPick(String key) {
        Honeydukes honeydukes = this.getHoneydukes();

        ArrayList<Candy> products = honeydukes.getProducts().get(key);

        if (!products.isEmpty()) {
            while (true) {
                System.out.println("Which product of the type \"" + key + "\" you want to change?");

                int i = 0;

                for (Candy candy : products) {
                    i++;

                    System.out.println(i + ". Product №" + i + ": " + candy.getShortName());
                }

                int maxProduct = i;

                System.out.println((maxProduct + 1) + ". Check all products of type \"" + key + "\"");
                System.out.println((maxProduct + 2) + ". Go back");

                Scanner myValue = new Scanner(System.in);

                int choice = myValue.nextInt();

                if ((choice > 0) && (choice <= maxProduct)) {
                    Candy candy = products.get(choice - 1);
                    this.changeCertainProduct(candy);
                } else if (choice == maxProduct + 1) {
                    honeydukes.printOneList(key);
                } else if (choice == maxProduct + 2) {
                    System.out.println("\nGoing back...\n");
                    return;
                } else
                    System.out.println("\nWrong command\n");
            }
        } else
            System.out.println("Ooops! No products of that type");
    }

    private void changeCertainProduct(Candy candy) {
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Check information about product");
            System.out.println("2. Change short name");
            System.out.println("3. Change weight");
            System.out.println("4. Change price");

            if (candy instanceof BertieBotts)
                System.out.println("5. Change flavour mix");
            else if (candy instanceof ChocolateFrog)
                System.out.println("5. Change collection year");
            else if (candy instanceof ChocolateWand)
                System.out.println("5. Change core");
            else if (candy instanceof DroobleGum)
                System.out.println("5. Change flavour");
            else if (candy instanceof SugarQuill)
                System.out.println("5. Change Deluxe parameter");

            System.out.println("6. Go back");

            Scanner myValue = new Scanner(System.in);

            int choice = myValue.nextInt();
            String change = myValue.nextLine();
            Integer changeInt;

            switch (choice) {
                case 1:
                    System.out.println("\nInformation about product:\n");
                    System.out.println("Short name: " + candy.getShortName());
                    System.out.println("Weight (grams): " + candy.getWeight());
                    System.out.println("Price (Sickles): " + candy.getPrice());
                    if (candy instanceof BertieBotts)
                        System.out.println("Flavour mix: " + ((BertieBotts) candy).getFlavourMix());
                    else if (candy instanceof ChocolateFrog)
                        System.out.println("Collection year: " + ((ChocolateFrog) candy).getCollectionYear());
                    else if (candy instanceof ChocolateWand)
                        System.out.println("Core: " + ((ChocolateWand) candy).getCore());
                    else if (candy instanceof DroobleGum)
                        System.out.println("Flavour: " + ((DroobleGum) candy).getFlavour());
                    else if (candy instanceof SugarQuill)
                        System.out.println("Deluxe parameter: " + ((SugarQuill) candy).isDeluxe());
                    break;
                case 2:
                    System.out.println("\nEnter new short name:");
                    change = myValue.nextLine();
                    candy.setShortName(change);
                    break;
                case 3:
                    System.out.println("\nEnter new weight:");
                    change = myValue.nextLine();
                    changeInt = Integer.parseInt(change);
                    candy.setWeight(changeInt);
                    break;
                case 4:
                    System.out.println("\nEnter new price:");
                    change = myValue.nextLine();
                    changeInt = Integer.parseInt(change);
                    candy.setPrice(changeInt);
                    break;
                case 5:
                    if (candy instanceof BertieBotts) {
                        System.out.println("\nEnter new flavour mix:");
                        change = myValue.nextLine();
                        ((BertieBotts) candy).setFlavourMix(change);
                    } else if (candy instanceof ChocolateFrog) {
                        System.out.println("\nEnter new collection year:");
                        change = myValue.nextLine();
                        ((ChocolateFrog) candy).setCollectionYear(change);
                    } else if (candy instanceof ChocolateWand) {
                        System.out.println("\nEnter new core:");
                        change = myValue.nextLine();
                        ((ChocolateWand) candy).setCore(change);
                    } else if (candy instanceof DroobleGum) {
                        System.out.println("\nEnter new flavour:");
                        change = myValue.nextLine();
                        ((DroobleGum) candy).setFlavour(change);
                    } else if (candy instanceof SugarQuill) {
                        System.out.println("\nEnter \"Deluxe\" if you want to set product to Deluxe:");
                        change = myValue.nextLine();
                        ((SugarQuill) candy).setDeluxe(change.equals("Deluxe"));
                    }
                    break;
                case 6:
                    System.out.println("\nGoing back...\n");
                    return;
                default:
                    System.out.println("\nWrong command\n");
            }
        }
    }
}
