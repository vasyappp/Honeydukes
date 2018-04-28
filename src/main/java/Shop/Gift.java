package Shop;

import Candies.*;

public class Gift {
    private Candy[] product;
    private int[] amount;
    private int length;
    private int totalPrice;
    private int totalWeight;

    public Gift() {
        this.product = new Candy[100];
        this.amount = new int[100];
        this.length = 0;
        this.totalPrice = 0;
        this.totalWeight = 0;
    }

    public Gift(Candy[] product, int[] amount, int length) {
        this.product = product;
        this.amount = amount;
        this.length = length;
        this.setTotalPrice();
        this.setTotalWeight();
    }

    public Candy[] getProduct() {
        return product;
    }

    public void setProduct(Candy[] product) {
        this.product = product;
    }

    public int[] getAmount() {
        return amount;
    }

    public void setAmount(int[] amount) {
        this.amount = amount;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void addAPack(Candy product, int amount) {
        int addIndex = this.getLength();
        Candy[] addPack = this.getProduct();
        int[] addAmount = this.getAmount();

        addPack[addIndex] = product;
        addAmount[addIndex] = amount;
        addIndex++;

        this.setProduct(addPack);
        this.setAmount(addAmount);
        this.setLength(addIndex);
        this.setTotalPrice();
        this.setTotalWeight();
    }

    private void setTotalPrice() {
        Candy[] presentPack = this.getProduct();
        int[] presentAmount = this.getAmount();
        int length = this.getLength();

        int count = 0;

        for (int i = 0; i < length; i++) {
            count += presentPack[i].getPrice() * presentAmount[i];
        }

        this.totalPrice = count;
    }

    private void setTotalWeight() {
        Candy[] presentPack = this.getProduct();
        int[] presentAmount = this.getAmount();
        int length = this.getLength();

        int count = 0;

        for (int i = 0; i < length; i++) {
            count += presentPack[i].getWeight() * presentAmount[i];
        }

        this.totalWeight = count;
    }

    public void print() {
        Candy[] runPack = this.getProduct();
        int[] runAmount = this.getAmount();
        int length = this.length;

        System.out.println("\nWhat's in this gift:\n\n");

        if (length != 0) {
            for (int i = 0; i < length; i++) {
                System.out.println("Product №" + (i + 1) + ":\n");

                if (runPack[i] instanceof BertieBotts) {
                    System.out.println(BertieBotts.getFullName());
                } else if (runPack[i] instanceof ChocolateFrog) {
                    System.out.println(ChocolateFrog.getFullName());
                } else if (runPack[i] instanceof ChocolateWand) {
                    System.out.println(ChocolateWand.getFullName());
                } else if (runPack[i] instanceof DroobleGum) {
                    System.out.println(DroobleGum.getFullName());
                } else if (runPack[i] instanceof SugarQuill) {
                    System.out.println(SugarQuill.getFullName());
                }

                runPack[i].print();

                System.out.println("\nAmount of product №" + (i + 1) + ": " + runAmount[i] + "\n\n");
            }
        } else
            System.out.println("Your gift is empty\n\n");

        System.out.println("Total weight of this gift:");
        int weight = this.getTotalWeight();
        System.out.println(weight / 1000 + "kg " + weight % 1000 + "g (" + weight + "g)");
        System.out.println("\nTotal price of this gift (1 Galleon = 17 Sickles):");
        int price = this.getTotalPrice();
        System.out.println(price / 17 + " Galleons " + price % 17 + " Sickles (" + price + " Sickles)\n\n");
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
