package Print;

public class Menu {
    public static void printMenu() {
        System.out.println("What do you want to do?");
        System.out.println("1. Check the list of products in Honeydukes");
        System.out.println("2. Buy a gift for the upcoming New Year");
        System.out.println("3. Exit");
    }

    public static void printMenuProducts() {
        System.out.println("What do you want to check?");
        System.out.println("1. Check all products");
        System.out.println("2. Bertie Bott's beans products");
        System.out.println("3. Chocolate Frogs products");
        System.out.println("4. Chocolate Wands products");
        System.out.println("5. Drooble's gums products");
        System.out.println("6. Sugar Quills");
        System.out.println("7. Go back to main menu");
    }

    public static void printMenuGift() {
        System.out.println("We have prepared some gifts for you! Do you want one? Or do you want to create a pack?");
        System.out.println("1. Buy a prepared gift");
        System.out.println("2. Create a gift");
        System.out.println("3. Go back to main menu");
    }

    public static void printMenuGiftPrepared() {
        System.out.println("Here are the options!\n");
        System.out.println("Pack 1: Weasley's Will");
        System.out.println("A cheap gift that contains the most popular candies\n");
        System.out.println("Pack 2: Malfoy's Might");
        System.out.println("The more you pay - the more you gain! Get all the candies & waste all your money on it\n");
        System.out.println("Pack 3: Potter Pays");
        System.out.println("A gift for those who have only two friends and loves to share with them\n");
        System.out.println("Pack 4: Draco is a Douche");
        System.out.println("Contains only an 'Eeew' Bertie Bott's pack: give a bean to someone you don't like, " +
                "watch him eating vomit\n");
        System.out.println("Which one you choose?");
        System.out.println("1. Weasley's Will");
        System.out.println("2. Malfoy's Might");
        System.out.println("3. Potter Pays");
        System.out.println("4. Draco is a Douche");
        System.out.println("5. Go back to gift picking");
    }

    public static void printMenuGiftCreating() {
        System.out.println("Which product do you want to add?");
        System.out.println("1. Bertie Bott's beans");
        System.out.println("2. Chocolate frog");
        System.out.println("3. Chocolate wand");
        System.out.println("4. Drooble's gum");
        System.out.println("5. Sugar quill");
        System.out.println("6. Check my current gift");
        System.out.println("7. Go back to gift picking");
    }

    public static void printMenuGiftCreatingBertie() {
        System.out.println("What do you want to do?");
        System.out.println("1. Check all Bertie Bott's beans products");
        System.out.println("2. Add a small pack with every flavour");
        System.out.println("3. Add a medium pack with every flavour");
        System.out.println("4. Add a big pack with every flavour");
        System.out.println("5. Add a pack with ordinary flavour");
        System.out.println("6. Add a pack with Eeew! flavour");
        System.out.println("7. Go back to add a different product");
    }

    public static void printMenuGiftCreatingFrogs() {
        System.out.println("What do you want to do?");
        System.out.println("1. Check all Chocolate Frogs products");
        System.out.println("2. Add a frog with a wizard from 1700-1799");
        System.out.println("3. Add a frog with a wizard from 1800-1899");
        System.out.println("4. Add a frog with a wizard from 1900-1999");
        System.out.println("5. Add a frog with a wizard from 2000-2018");
        System.out.println("6. Go back to add a different product");
    }

    public static void printMenuGiftCreatingWands() {
        System.out.println("What do you want to do?");
        System.out.println("1. Check all Chocolate Wands products");
        System.out.println("2. Add a wand with a Unicorn hair core");
        System.out.println("3. Add a wand with a Phoenix feather core");
        System.out.println("4. Add a wand with a Dragon heartstring core");
        System.out.println("5. Go back to add a different product");
    }

    public static void printMenuGiftCreatingGums() {
        System.out.println("What do you want to do?");
        System.out.println("1. Check all Drooble's Gums products");
        System.out.println("2. Add a crazyberry-flavoured gum");
        System.out.println("3. Add a berry-flavoured gum");
        System.out.println("4. Go back to add a different product");
    }

    public static void printMenuGiftCreatingQuills() {
        System.out.println("What do you want to do?");
        System.out.println("1. Check all Sugar Quills products");
        System.out.println("2. Add a Deluxe-edition quill");
        System.out.println("3. Add an ordinary quill");
        System.out.println("4. Go back to add a different product");
    }
}
