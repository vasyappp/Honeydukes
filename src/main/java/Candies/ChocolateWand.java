package Candies;

public class ChocolateWand extends Candy {
    private static final String fullName = "Chocolate Wand";
    private static final String description = "Chocolate wand-shaped sweets with a magical substance at its core";
    private String core;

    public ChocolateWand (int weight, String core) {
        this.weight = weight;
        this.price = 10;
        this.core = core;
    }

    public static String getFullName() {
        return fullName;
    }

    public static String getDescription() {
        return description;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    @Override
    public void print() {
        System.out.println("Weight of the wand:");
        System.out.println(this.getWeight() + "g");
        System.out.println("Price of the wand:");
        System.out.println(this.getPrice() + " sickles");
        System.out.println("Contains a magical core:");
        System.out.println(this.getCore());
    }
}