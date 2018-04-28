package Candies;

public class BertieBotts extends Candy {
    private static final String fullName = "Bertie Bott's Every Flavour Beans";
    private static final String description = "Jelly beans with every flavor imaginable";
    private String flavourMix;

    public BertieBotts (int weight, int price, String flavourMix) {
        this.weight = weight;
        this.price = price;
        this.flavourMix = flavourMix;
    }

    public static String getFullName() {
        return fullName;
    }

    public static String getDescription() {
        return description;
    }

    public String getFlavourMix() {
        return flavourMix;
    }

    public void setFlavourMix(String flavourMix) {
        this.flavourMix = flavourMix;
    }

    @Override
    public void print() {
        System.out.println("Weight of the pack:");
        System.out.println(this.getWeight() + "g");
        System.out.println("Price of the pack:");
        System.out.println(this.getPrice() + " sickles");
        System.out.println("Flavour mix:");
        switch (this.getFlavourMix()) {
            case "Every":
                System.out.println("Every flavour imaginable!");
                break;
            case "Ordinary":
                System.out.println("Only ordinary tastes: orange, chocolate, etc.");
                break;
            case "Eeew":
                System.out.println("Extreme flavours for those who likes earwax & dirty socks");
                break;
        };
    }
}