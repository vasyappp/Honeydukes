import Candies.*;
import Shop.*;
import WorkWithShop.EditingAShop;
import WorkWithShop.UsageOfAShop;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Main класс
 * Формирование новогоднего подарка из списка доступных продуктов
 *
 * @author Natalia Litvinova
 */

public class Main {
    /**
     * Метод генерации списка доступных продуктов и готовых подарков
     *
     * @see Candies
     * @see Shop
     *
     * @return Обьект "магазин" - список доступных продуктов и готовых подарков
     */
    private static Honeydukes generateHoneydukes() {
        // Создание различных продуктов типа "Драже Берти Боттс"
        BertieBotts bertieBottsMediumEveryPack = new BertieBotts("MediumEveryPack", 100, 6, "Every");
        BertieBotts bertieBottsBigEveryPack = new BertieBotts("BigEveryPack", 200, 10, "Every");
        BertieBotts bertieBottsSmallEveryPack = new BertieBotts("SmallEveryPack", 50, 4, "Every");
        BertieBotts bertieBottsOrdinaryPack = new BertieBotts("OrdinaryPack", 100, 7, "Ordinary");
        BertieBotts bertieBottsEeewPack = new BertieBotts("EeewPack", 100, 7, "Eeew");

        // Создание массива продуктов типа "Драже Берти Боттс"
        ArrayList<Candy> bertieBotts = new ArrayList<>();
        bertieBotts.add(bertieBottsSmallEveryPack);
        bertieBotts.add(bertieBottsMediumEveryPack);
        bertieBotts.add(bertieBottsBigEveryPack);
        bertieBotts.add(bertieBottsOrdinaryPack);
        bertieBotts.add(bertieBottsEeewPack);


        // Создание различных продуктов типа "Шоколадная лягушка"
        ChocolateFrog frogXVIII = new ChocolateFrog("FrogXVIII", 5, "1700 - 1799");
        ChocolateFrog frogXIX = new ChocolateFrog("FrogXIX", 4, "1800 - 1899");
        ChocolateFrog frogXX = new ChocolateFrog("FrogXX", 3, "1900 - 1999");
        ChocolateFrog frogXXI = new ChocolateFrog("FrogXXI", 3, "2000 - 2018");

        // Создание массива продуктов типа "Шоколадная лягушка"
        ArrayList<Candy> frogs = new ArrayList<>();
        frogs.add(frogXVIII);
        frogs.add(frogXIX);
        frogs.add(frogXX);
        frogs.add(frogXXI);


        // Создание различных продуктов типа "Шоколадная волшебная палочка"
        ChocolateWand wandUnicorn = new ChocolateWand("WandUnicorn", 45, "Unicorn hair");
        ChocolateWand wandPhoenix = new ChocolateWand("WandPhoenix", 46, "Phoenix feather");
        ChocolateWand wandDragon = new ChocolateWand("WandDragon", 50, "Dragon heartstring");

        // Создание массива продуктов типа "Шоколадная волшебная палочка"
        ArrayList<Candy> wands = new ArrayList<>();
        wands.add(wandUnicorn);
        wands.add(wandPhoenix);
        wands.add(wandDragon);


        // Создание различных продуктов типа "Жвачка Друбла"
        DroobleGum gumCrazyberry = new DroobleGum("GumCrazyberry", 18, 2, "Crazyberry");
        DroobleGum gumBerry = new DroobleGum("GumBerry", 17, 2, "Berry");

        // Создание массива продуктов типа "Жвачка Друбла"
        ArrayList<Candy> gums = new ArrayList<>();
        gums.add(gumCrazyberry);
        gums.add(gumBerry);


        // Создание различных продуктов типа "Сахарное перо для письма"
        SugarQuill quillDeluxe = new SugarQuill("QuillDeluxe", true);
        SugarQuill quillNotDeluxe = new SugarQuill("QuillNotDeluxe", false);

        // Создание массива продуктов типа "Сахарное перо для письма"
        ArrayList<Candy> quills = new ArrayList<>();
        quills.add(quillDeluxe);
        quills.add(quillNotDeluxe);


        // Создание общего списка всех доступных продуктов
        HashMap<String, ArrayList<Candy>> products = new HashMap<>();
        products.put(bertieBottsBigEveryPack.getFullName(), bertieBotts);
        products.put(frogXIX.getFullName(), frogs);
        products.put(wandDragon.getFullName(), wands);
        products.put(gumBerry.getFullName(), gums);
        products.put(quillDeluxe.getFullName(), quills);


        // Создание данных для первого готового подарка
        HashMap<Candy, Integer> weasleyWillPack = new HashMap<>();

        weasleyWillPack.put(bertieBottsSmallEveryPack, 1);
        weasleyWillPack.put(frogXX, 1);
        weasleyWillPack.put(frogXXI, 1);
        weasleyWillPack.put(wandUnicorn, 1);
        weasleyWillPack.put(gumCrazyberry, 1);
        weasleyWillPack.put(gumBerry, 2);
        weasleyWillPack.put(quillNotDeluxe, 2);

        // Создание первого готового подарка
        Gift weasleyWill = new Gift(weasleyWillPack, "Weasley's Will",
                "A cheap gift that contains the most popular candies");


        // Создание данных для второго готового подарка
        HashMap<Candy, Integer> malfoysMightPack = new HashMap<>();
        malfoysMightPack.put(bertieBottsBigEveryPack, 3);
        malfoysMightPack.put(frogXVIII, 10);
        malfoysMightPack.put(frogXIX, 8);
        malfoysMightPack.put(frogXX, 5);
        malfoysMightPack.put(frogXXI, 5);
        malfoysMightPack.put(wandUnicorn, 5);
        malfoysMightPack.put(wandPhoenix, 5);
        malfoysMightPack.put(wandDragon, 5);
        malfoysMightPack.put(gumCrazyberry, 10);
        malfoysMightPack.put(gumBerry, 10);
        malfoysMightPack.put(quillDeluxe, 5);

        // Создание второго готового подарка
        Gift malfoysMight = new Gift(malfoysMightPack, "Malfoy's Might",
                "The more you pay - the more you gain! Get all the candies & waste all your money on it");


        // Создание данных для третьего готового подарка
        HashMap<Candy, Integer> dracoIsADouchePack = new HashMap<>();
        dracoIsADouchePack.put(bertieBottsEeewPack, 3);

        // Создание третьего готового подарка
        Gift dracoIsADouche = new Gift(dracoIsADouchePack, "Draco is a Douche",
                "Contains only an 'Eeew' Bertie Bott's pack: give a bean to someone you don't like, watch him eating vomit");


        // Создание данных для четвертого готового подарка
        HashMap<Candy, Integer> potterPaysPack = new HashMap<>();
        potterPaysPack.put(bertieBottsMediumEveryPack, 1);
        potterPaysPack.put(frogXVIII, 3);
        potterPaysPack.put(frogXIX, 3);
        potterPaysPack.put(frogXX, 3);
        potterPaysPack.put(frogXXI, 3);
        potterPaysPack.put(wandUnicorn, 3);
        potterPaysPack.put(wandPhoenix, 3);
        potterPaysPack.put(wandDragon, 3);
        potterPaysPack.put(gumCrazyberry, 3);
        potterPaysPack.put(gumBerry, 3);
        potterPaysPack.put(quillNotDeluxe, 3);

        // Создание четвертого готового подарка
        Gift potterPays = new Gift(potterPaysPack, "Potter Pays",
                "A gift for those who have only two friends and loves to share with them");


        // Создание списка доступных готовых подарков
        ArrayList<Gift> gifts = new ArrayList<>();
        gifts.add(weasleyWill);
        gifts.add(malfoysMight);
        gifts.add(potterPays);
        gifts.add(dracoIsADouche);


        // Создание нового объекта типа "магазин" и возвращение этого объекта
        return new Honeydukes(products, gifts);
    }

    /**
     * Метод main
     * Генерирует список доступных товаров и готовых подарков, выводит первое меню выбора действия
     *
     * @param args args
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner myValue = new Scanner(System.in);

        // Генерация списка доступных товаров и готовых подарков
        Honeydukes honeydukes = generateHoneydukes();

        System.out.println("Welcome to Honeydukes!\n");

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Work with a shop");
            System.out.println("2. Go to Forbidden Forest");
            System.out.println("3. Exit");

            int choice = myValue.nextInt();

            switch (choice) {
                case 2:
                    System.out.println("\nWe're currently working on this function.");
                    System.out.println("Come back later\n");
                    break;
                case 1:
                    UsageOfAShop usage = new UsageOfAShop(honeydukes);
                    System.out.println("\nEntering a shop...\n");
                    usage.mainMenu();
                    break;
                case 3:
                    System.out.println("\nGoodbye\n");
                    return;
                default:
                    System.out.println("\nWrong command\n");
            }
        }
    }
}
