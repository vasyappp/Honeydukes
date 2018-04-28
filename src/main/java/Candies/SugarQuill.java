package Candies;

public class SugarQuill extends Candy {
    private static final String fullName = "Sugar Quill";
    private static final String description = "Delicate, spun-sugar sweets made to resemble real quills.";
    private boolean deluxe;

    public SugarQuill (boolean deluxe) {
        this.deluxe = deluxe;
        if (deluxe) {
            this.weight = 35;
            this.price = 15;
        } else {
            this.weight = 30;
            this.price = 10;
        }
    }

    public static String getFullName() {
        return fullName;
    }

    public static String getDescription() {
        return description;
    }

    public boolean isDeluxe() {
        return deluxe;
    }

    public void setDeluxe(boolean deluxe) {
        this.deluxe = deluxe;
    }

    @Override
    public void print() {
        System.out.println("Weight of the quill:");
        System.out.println(this.getWeight() + "g");
        System.out.println("Price of the quill:");
        System.out.println(this.getPrice() + " sickles");
        if (this.isDeluxe()) {
            System.out.println("Deluxe quill: you can suck it for one day");
        } else {
            System.out.println("Simple quill: lasts only for one class (an hour and a half)");
        }
    }
}