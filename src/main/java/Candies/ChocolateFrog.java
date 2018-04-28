package Candies;

public class ChocolateFrog extends Candy {
    private static final String fullName = "Chocolate Frog";
    private static final String description = "A sweet frog-shaped chocolate with a random collectible card";
    private String collectionYear;

    public ChocolateFrog (int price, String collectionYear) {
        this.weight = 200;
        this.price = price;
        this.collectionYear = collectionYear;
    }

    public static String getFullName() {
        return fullName;
    }

    public static String getDescription() {
        return description;
    }

    public String getCollectionYear() {
        return collectionYear;
    }

    public void setCollectionYear(String collectionYear) {
        this.collectionYear = collectionYear;
    }

    @Override
    public void print() {
        System.out.println("Weight of the frog:");
        System.out.println(this.getWeight() + "g");
        System.out.println("Price of the frog:");
        System.out.println(this.getPrice() + " sickles");
        System.out.println("Contains a card of a wizard from years:");
        System.out.println(this.getCollectionYear());
    }
}