package Shop;

import Candies.*;

public class Honeydukes {
    private Candy[][] products;
    private Gift[] gifts;

    public Honeydukes(Candy[][] products, Gift[] gifts) {
        this.products = products;
        this.gifts = gifts;
    }

    public Candy[][] getProducts() {
        return products;
    }

    public void setProducts(Candy[][] products) {
        this.products = products;
    }

    public Gift[] getGifts() {
        return gifts;
    }

    public void setGifts(Gift[] gifts) {
        this.gifts = gifts;
    }

    public void printBertieBottsList() {
        System.out.println("Name of product:");
        System.out.println(BertieBotts.getFullName());
        System.out.println("Description of product:");
        System.out.println(BertieBotts.getDescription());
        System.out.println();

        System.out.println("Types of product:");
        System.out.println();

        int i = 0;
        BertieBotts[] bertieBotts = (BertieBotts[])this.getProducts()[0];

        for (BertieBotts run : bertieBotts) {
            i++;
            System.out.println("Pack №" + i);
            run.print();
            System.out.println();
        }
    }

    public void printFrogsList() {
        System.out.println("Name of product:");
        System.out.println(ChocolateFrog.getFullName());
        System.out.println("Description of product:");
        System.out.println(ChocolateFrog.getDescription());
        System.out.println();

        System.out.println("Types of product:");
        System.out.println();

        ChocolateFrog[] frogs = (ChocolateFrog[])this.getProducts()[1];
        int i = 0;

        for (ChocolateFrog run : frogs) {
            i++;
            System.out.println("Frog №" + i);
            run.print();
            System.out.println();
        }
    }

    public void printWandsList() {
        System.out.println("Name of product:");
        System.out.println(ChocolateWand.getFullName());
        System.out.println("Description of product:");
        System.out.println(ChocolateWand.getDescription());
        System.out.println();

        System.out.println("Types of product:");
        System.out.println();

        ChocolateWand[] wands = (ChocolateWand[])this.getProducts()[2];
        int i = 0;

        for (ChocolateWand run : wands) {
            i++;
            System.out.println("Wand №" + i);
            run.print();
            System.out.println();
        }
    }

    public void printGumsList() {
        System.out.println("Name of product:");
        System.out.println(DroobleGum.getFullName());
        System.out.println("Description of product:");
        System.out.println(DroobleGum.getDescription());
        System.out.println();

        System.out.println("Types of product:");
        System.out.println();

        DroobleGum[] gums = (DroobleGum[])this.getProducts()[3];
        int i = 0;

        for (DroobleGum run : gums) {
            i++;
            System.out.println("Gum №" + i);
            run.print();
            System.out.println();
        }
    }

    public void printQuillsList() {
        System.out.println("Name of product:");
        System.out.println(SugarQuill.getFullName());
        System.out.println("Description of product:");
        System.out.println(SugarQuill.getDescription());
        System.out.println();

        System.out.println("Types of product:");
        System.out.println();

        SugarQuill[] quills = (SugarQuill[])this.getProducts()[4];
        int i = 0;

        for (SugarQuill run : quills) {
            i++;
            System.out.println("Quill №" + i);
            run.print();
            System.out.println();
        }
    }

    public void printHoneydukes() {
        int i = 1;
        Candy[][] honeydukes = this.getProducts();

        for (Candy[] run: honeydukes) {
            System.out.println("Product №" + i);
            System.out.println();
            if (run[0] instanceof BertieBotts) {
                this.printBertieBottsList();
            } else if (run[0] instanceof ChocolateFrog) {
                this.printFrogsList();
            } else if (run[0] instanceof ChocolateWand) {
                this.printWandsList();
            } else if (run[0] instanceof DroobleGum) {
                this.printGumsList();
            } else if (run[0] instanceof SugarQuill) {
                this.printQuillsList();
            }

            System.out.println();

            i++;
        }
    }
}
