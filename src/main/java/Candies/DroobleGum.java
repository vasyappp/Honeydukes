package Candies;

public class DroobleGum extends Candy {
    private static final String fullName = "Drooble's Best Blowing Gum";
    private static final String description = "Lets the consumer blow bluebell-coloured bubbles which would not pop for days";
    private String flavour;

    public DroobleGum (int weight, int price, String flavour) {
        this.weight = weight;
        this.price = price;
        this.flavour = flavour;
    }

    public static String getFullName() {
        return fullName;
    }

    public static String getDescription() {
        return description;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public void print() {
        System.out.println("Weight of the gum:");
        System.out.println(this.getWeight() + "g");
        System.out.println("Price of the gum:");
        System.out.println(this.getPrice() + " sickles");
        System.out.println("Gum's flavour:");
        System.out.println(this.getFlavour());
    }
}