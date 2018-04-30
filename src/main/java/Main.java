import Candies.*;
import Shop.*;
import Print.*;

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
        BertieBotts bertieBottsMediumEveryPack = new BertieBotts(100, 6, "Every");
        BertieBotts bertieBottsBigEveryPack = new BertieBotts(200, 10, "Every");
        BertieBotts bertieBottsSmallEveryPack = new BertieBotts(50, 4, "Every");
        BertieBotts bertieBottsOrdinaryPack = new BertieBotts(100, 7, "Ordinary");
        BertieBotts bertieBottsEeewPack = new BertieBotts(100, 7, "Eeew");

        // Создание массива продуктов типа "Драже Берти Боттс"
        BertieBotts[] bertieBotts = {bertieBottsSmallEveryPack,
                bertieBottsMediumEveryPack, bertieBottsBigEveryPack, bertieBottsOrdinaryPack, bertieBottsEeewPack};


        // Создание различных продуктов типа "Шоколадная лягушка"
        ChocolateFrog frogXVIII = new ChocolateFrog(5, "1700 - 1799");
        ChocolateFrog frogXIX = new ChocolateFrog(4, "1800 - 1899");
        ChocolateFrog frogXX = new ChocolateFrog(3, "1900 - 1999");
        ChocolateFrog frogXXI = new ChocolateFrog(3, "2000 - 2018");

        // Создание массива продуктов типа "Шоколадная лягушка"
        ChocolateFrog[] frogs = {frogXVIII, frogXIX, frogXX, frogXXI};


        // Создание различных продуктов типа "Шоколадная волшебная палочка"
        ChocolateWand wandUnicorn = new ChocolateWand(45, "Unicorn hair");
        ChocolateWand wandPhoenix = new ChocolateWand(46, "Phoenix feather");
        ChocolateWand wandDragon = new ChocolateWand(50, "Dragon heartstring");

        // Создание массива продуктов типа "Шоколадная волшебная палочка"
        ChocolateWand[] wands = {wandUnicorn, wandPhoenix, wandDragon};


        // Создание различных продуктов типа "Жвачка Друбла"
        DroobleGum gumCrazyberry = new DroobleGum(18, 2, "Crazyberry");
        DroobleGum gumBerry = new DroobleGum(17, 2, "Berry");

        // Создание массива продуктов типа "Жвачка Друбла"
        DroobleGum[] gums = {gumCrazyberry, gumBerry};


        // Создание различных продуктов типа "Сахарное перо для письма"
        SugarQuill quillDeluxe = new SugarQuill(true);
        SugarQuill quillNotDeluxe = new SugarQuill(false);

        // Создание массива продуктов типа "Сахарное перо для письма"
        SugarQuill[] quills = {quillDeluxe, quillNotDeluxe};


        // Создание общего списка всех доступных продуктов
        Candy[][] products = {bertieBotts, frogs, wands, gums, quills};


        // Создание данных для первого готового подарка
        Candy[] weasleyWillPack = {bertieBottsSmallEveryPack, frogXX, frogXXI,
                wandUnicorn, gumCrazyberry, gumBerry, quillNotDeluxe};
        int[] weasleyWillAmount = {1, 1, 1, 1, 2, 2};

        // Создание первого готового подарка
        Gift weasleyWill = new Gift(weasleyWillPack, weasleyWillAmount,6);


        // Создание данных для второго готового подарка
        Candy[] malfoysMightPack = {bertieBottsBigEveryPack, frogXVIII, frogXIX, frogXX, frogXXI, wandDragon,
                wandPhoenix, wandUnicorn, gumBerry, gumCrazyberry, quillDeluxe};
        int[] malfoysMightAmount = {3, 10, 8, 5, 5, 5, 5, 5, 10, 10, 5};

        // Создание второго готового подарка
        Gift malfoysMight = new Gift(malfoysMightPack, malfoysMightAmount, 11);


        // Создание данных для третьего готового подарка
        Candy[] dracoIsADouchePack = {bertieBottsEeewPack};
        int[] dracoIsADoucheAmount = {3};

        // Создание третьего готового подарка
        Gift dracoIsADouche = new Gift(dracoIsADouchePack, dracoIsADoucheAmount, 1);


        // Создание данных для четвертого готового подарка
        Candy[] potterPaysPack = {bertieBottsMediumEveryPack, frogXVIII, frogXIX, frogXX, frogXXI,
                wandDragon, wandPhoenix, wandUnicorn, gumBerry, gumCrazyberry, quillNotDeluxe};
        int[] potterPaysAmount = {1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};

        // Создание четвертого готового подарка
        Gift potterPays = new Gift(potterPaysPack, potterPaysAmount,11);


        // Создание списка доступных готовых подарков
        Gift[] gifts = {weasleyWill, malfoysMight, potterPays, dracoIsADouche};


        // Создание нового объекта типа "магазин" и возвращение этого объекта
        return new Honeydukes(products, gifts);
    }


    /**
     * Метод просмотра доступных продуктов
     *
     * @see Shop.Honeydukes
     * @see Print.Menu
     *
     * @param honeydukes Список доступных продуктов и подарков
     */
    private static void checkProducts(Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);

        while (true) {
            // Вывод меню просмотра доступных продуктов
            Menu.printMenuProducts();

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    // Вызов метода вывода всех продуктов
                    System.out.println("\nChecking all products:\n");
                    honeydukes.printHoneydukes();
                    break;
                case 2:
                    // Вызов метода вывода продуктов типа "Драже Берти Боттс"
                    System.out.println("\nChecking Bertie Bott's beans products:\n");
                    honeydukes.printBertieBottsList();
                    break;
                case 3:
                    // Вызов метода вывода продуктов типа "Шоколадная лягушка"
                    System.out.println("\nChecking Chocolate Frogs products:\n");
                    honeydukes.printFrogsList();
                    break;
                case 4:
                    // Вызов метода вывода продуктов типа "Шоколадная волшебная палочка"
                    System.out.println("\nChecking Chocolate Wands products:\n");
                    honeydukes.printWandsList();
                    break;
                case 5:
                    // Вызов метода вывода продуктов типа "Жвачка Друбла"
                    System.out.println("\nChecking Drooble's gums products:\n");
                    honeydukes.printGumsList();
                    break;
                case 6:
                    // Вызов метода вывода продуктов типа "Сахарное перо для письма"
                    System.out.println("\nChecking Sugar Quills products:\n");
                    honeydukes.printQuillsList();
                    break;
                case 7:
                    // Возврат к прошлому меню
                    System.out.println("\nGoing back to main menu...\n");
                    return;
                default:
                    // Вывод ошибки некорректной команды
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Check more!\n");
        }
    }


    /**
     * Метод выбора функции покупки подарка: выбор готового подарка или создание собственного
     *
     * @see Shop.Honeydukes
     * @see Print.Menu
     *
     * @param honeydukes Список доступных продуктов и готовых подарков
     */
    private static void getAGift(Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);

        while (true) {
            // Вывод меню выбора покупки подарка
            Menu.printMenuGift();

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    // Вызов метода выбора готового подарка
                    getAPreparedGift(honeydukes);
                    break;
                case 2:
                    // Вызов метода создания подарка
                    createAGiftAdding(honeydukes);
                    break;
                case 3:
                    // Возврат к прошлому меню
                    System.out.println("\nGoing back to main menu...\n");
                    return;
                default:
                    // Вывод ошибки некорректной команды
                    System.out.println("\nWrong command!\n");
            }
        }
    }


    /**
     * Метод выбора готового подарка
     *
     * @see Shop.Honeydukes
     * @see Print.Menu
     *
     * @param honeydukes Список всех доступных продуктов и готовых подарков
     */
    private static void getAPreparedGift(Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);

        System.out.println();

        while (true) {
            // Вывод информации обо всех готовых подарках и меню выбора действия
            Menu.printMenuGiftPrepared();

            Gift[] gifts = honeydukes.getGifts();

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    // Вывод информации о первом готовом подарке
                    gifts[0].print();
                    break;
                case 2:
                    // Вывод информации о втором готовом подарке
                    gifts[1].print();
                    break;
                case 3:
                    // Вывод информации о третьем готовом подарке
                    gifts[2].print();
                    break;
                case 4:
                    // Вывод информации о четвертом готовом подарке
                    gifts[3].print();
                    break;
                case 5:
                    // Возврат к предыдущему меню
                    System.out.println("\nGoing back to gift picking...\n");
                    return;
                default:
                    // Вывод ошибки некорректной команды
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Pick another gift!\n");
        }
    }


    /**
     * Метод выбора типа продукта для добавления в подарок
     *
     * @see Shop.Honeydukes
     * @see Print.Menu
     *
     * @param honeydukes Список доступных продуктов и готовых подарков
     */
    private static void createAGiftAdding(Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);

        // Объявление нового объекта подарка
        Gift gift = new Gift();

        System.out.println();

        while (true) {
            // Вывод меню выбора
            Menu.printMenuGiftCreating();

            int choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    // Вызов метода добавления продукта типа "Драже Берти Боттс"
                    gift = createAGiftBertieBotts(gift, honeydukes);
                    break;
                case 2:
                    // Вызов метода добавления продукта типа "Шоколадная лягушка"
                    gift = createAGiftFrogs(gift,honeydukes);
                    break;
                case 3:
                    // Вызов метода добавления продукта типа "Шоколадная волшебная палочка"
                    gift = createAGiftWands(gift, honeydukes);
                    break;
                case 4:
                    // Вызов метода добавления продукта типа "Жвачка Друбла"
                    gift = createAGiftGums(gift, honeydukes);
                    break;
                case 5:
                    // Вызов метода добавления продукта типа "Сахарное перо для письма"
                    gift = createAGiftQuills(gift,honeydukes);
                    break;
                case 6:
                    // Вывод информации о текущем состоянии подарка
                    System.out.println("\nYour gift's info:\n");
                    gift.print();
                    break;
                case 7:
                    // Возврат к предыдущему меню
                    System.out.println("\nGoing back to gift picking...\n");
                    return;
                default:
                    // Вывод ошибки некорректной команды
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Wanna add something else?\n");
        }

    }

    /**
     * Метод добавления к подарку продукта типа "Драже Берти Боттс"
     *
     * @see Shop.Honeydukes
     * @see Print.Menu
     * @see Shop.Gift
     *
     * @param gift Объект создаваемого подарка
     * @param honeydukes Список всех доступных продуктов
     *
     * @return Обновленный создаваемый подарок
     */
    private static Gift createAGiftBertieBotts(Gift gift, Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);

        // Получение списка доступных продуктов типа "Драже Берти Боттс"
        BertieBotts[] bertieBotts = (BertieBotts[])honeydukes.getProducts()[0];

        int choice;
        int amount;

        System.out.println();

        while (true) {
            // Вывод меню выбора продукта типа "Драже Берти Боттс"
            Menu.printMenuGiftCreatingBertie();

            choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    // Просмотр всего списка доступных продуктов типа "Драже Берти Боттс"
                    System.out.println("\nChecking Bertie Bott's Beans products:\n");
                    honeydukes.printBertieBottsList();
                    break;
                case 2:
                    // Добавление к подарку первого продукта типа "Драже Берти Боттс"
                    System.out.println("\nHow many packs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(bertieBotts[0], amount);
                    System.out.println("\nPacks added!\n");
                    break;
                case 3:
                    // Добавление к подарку второго продукта типа "Драже Берти Боттс"
                    System.out.println("\nHow many packs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(bertieBotts[1], amount);
                    System.out.println("\nPacks added!\n");
                    break;
                case 4:
                    // Добавление к подарку третьего продукта типа "Драже Берти Боттс"
                    System.out.println("\nHow many packs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(bertieBotts[2], amount);
                    System.out.println("\nPacks added!\n");
                    break;
                case 5:
                    // Добавление к подарку четвертого продукта типа "Драже Берти Боттс"
                    System.out.println("\nHow many packs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(bertieBotts[3], amount);
                    System.out.println("\nPacks added!\n");
                    break;
                case 6:
                    // Добавление к подарку пятого продукта типа "Драже Берти Боттс"
                    System.out.println("\nHow many packs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(bertieBotts[4], amount);
                    System.out.println("\nPacks added!\n");
                    break;
                case 7:
                    // Возврат к предыдущему меню
                    System.out.println("\nGoing back to picking...\n");
                    return gift;
                default:
                    // Вывод ошибки некорректной команды
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Pick another Bertie Bott's beans pack!\n");
        }
    }


    /**
     * Метод добавления к подарку продукта типа "Шоколадная лягушка"
     *
     * @see Shop.Honeydukes
     * @see Print.Menu
     * @see Shop.Gift
     *
     * @param gift Объект создаваемого подарка
     * @param honeydukes Список всех доступных продуктов
     *
     * @return Обновленный создаваемый подарок
     */
    private static Gift createAGiftFrogs(Gift gift, Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);

        // Получение списка доступных продуктов типа "Шоколадная лягушка"
        ChocolateFrog[] frogs = (ChocolateFrog[])honeydukes.getProducts()[1];

        int choice;
        int amount;

        System.out.println();

        while (true) {
            // Вывод меню выбора продукта типа "Шоколадная лягушка"
            Menu.printMenuGiftCreatingFrogs();

            choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    // Просмотр всего списка доступных продуктов типа "Шоколадная лягушка"
                    System.out.println("\nChecking Chocolate Frogs products:\n");
                    honeydukes.printFrogsList();
                    break;
                case 2:
                    // Добавление к подарку первого продукта типа "Шоколадная лягушка"
                    System.out.println("\nHow many frogs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(frogs[0], amount);
                    System.out.println("\nFrogs added!\n");
                    break;
                case 3:
                    // Добавление к подарку второго продукта типа "Шоколадная лягушка"
                    System.out.println("\nHow many frogs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(frogs[1], amount);
                    System.out.println("\nFrogs added!\n");
                    break;
                case 4:
                    // Добавление к подарку третьего продукта типа "Шоколадная лягушка"
                    System.out.println("\nHow many frogs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(frogs[2], amount);
                    System.out.println("\nFrogs added!\n");
                    break;
                case 5:
                    // Добавление к подарку четвертого продукта типа "Шоколадная лягушка"
                    System.out.println("\nHow many frogs do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(frogs[3], amount);
                    System.out.println("\nFrogs added!\n");
                    break;
                case 6:
                    // Возврат к предыдущему меню
                    System.out.println("\nGoing back to picking...\n");
                    return gift;
                default:
                    // Вывод сообщения некорректной команды
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Pick another Chocolate Frog!\n");
        }
    }


    /**
     * Метод добавления к подарку продукта типа "Шоколадная волшебная палочка"
     *
     * @see Shop.Honeydukes
     * @see Print.Menu
     * @see Shop.Gift
     *
     * @param gift Объект создаваемого подарка
     * @param honeydukes Список всех доступных продуктов
     *
     * @return Обновленный создаваемый подарок
     */
    private static Gift createAGiftWands(Gift gift, Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);

        // Получение списка доступных продуктов типа "Шоколадная волшебная палочка"
        ChocolateWand[] wands = (ChocolateWand[])honeydukes.getProducts()[2];

        int choice;
        int amount;

        System.out.println();

        while (true) {
            // Вывод меню выбора продукта типа "Шоколадная волшебная палочка"
            Menu.printMenuGiftCreatingWands();

            choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    // Просмотр всех доступных продуктов типа "Шоколадная волшебная палочка"
                    System.out.println("\nChecking Chocolate Wands products:\n");
                    honeydukes.printWandsList();
                    break;
                case 2:
                    // Добавление к подарку первого продукта типа "Шоколадная волшебная палочка"
                    System.out.println("\nHow many wands do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(wands[0], amount);
                    System.out.println("\nWands added!\n");
                    break;
                case 3:
                    // Добавление к подарку второго продукта типа "Шоколадная волшебная палочка"
                    System.out.println("\nHow many wands do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(wands[1], amount);
                    System.out.println("\nWands added!\n");
                    break;
                case 4:
                    // Добавление к подарку третьего продукта типа "Шоколадная волшебная палочка"
                    System.out.println("\nHow many wands do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(wands[2], amount);
                    System.out.println("\nWands added!\n");
                    break;
                case 5:
                    // Возврат к предыдущему меню
                    System.out.println("\nGoing back to picking...\n");
                    return gift;
                default:
                    // Вывод ошибки некорректной команды
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Pick another Chocolate Wand!\n");
        }
    }


    /**
     * Метод добавления к подарку продукта типа "Жвачка Друбла"
     *
     * @see Shop.Honeydukes
     * @see Print.Menu
     * @see Shop.Gift
     *
     * @param gift Объект создаваемого подарка
     * @param honeydukes Список всех доступных продуктов
     *
     * @return Обновленный создаваемый подарок
     */
    private static Gift createAGiftGums(Gift gift, Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);

        // Получение списка доступных продуктов типа "Жвачка Друбла"
        DroobleGum[] gums = (DroobleGum[])honeydukes.getProducts()[3];

        int choice;
        int amount;

        System.out.println();

        while (true) {
            // Вывод меню выбора продукта типа "Жвачка Друбла"
            Menu.printMenuGiftCreatingGums();

            choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    // Просмотр всех доступных продуктов типа "Жвачка Друбла"
                    System.out.println("\nChecking Drooble's gum products:\n");
                    honeydukes.printGumsList();
                    break;
                case 2:
                    // Добавление к подарку первого продукта типа "Жвачка Друбла"
                    System.out.println("\nHow many gums do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(gums[0], amount);
                    System.out.println("\nGums added!\n");
                    break;
                case 3:
                    // Добавление к подарку второго продукта типа "Жвачка Друбла"
                    System.out.println("\nHow many gums do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(gums[1], amount);
                    System.out.println("\nGums added!\n");
                    break;
                case 4:
                    // Возврат к предыдущему меню
                    System.out.println("\nGoing back to picking...\n");
                    return gift;
                default:
                    // Вывод ошибки некорректной команды
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Pick another Drooble's Gum!\n");
        }
    }


    /**
     * Метод добавления к подарку продукта типа "Сахарное перо"
     *
     * @see Shop.Honeydukes
     * @see Print.Menu
     * @see Shop.Gift
     *
     * @param gift Объект создаваемого подарка
     * @param honeydukes Список всех доступных продуктов
     *
     * @return Обновленный создаваемый подарок
     */
    private static Gift createAGiftQuills (Gift gift, Honeydukes honeydukes) {
        Scanner myValue = new Scanner(System.in);

        // Получение списка доступных продуктов типа "Сахарное перо"
        SugarQuill[] quills = (SugarQuill[])honeydukes.getProducts()[4];

        int choice;
        int amount;

        System.out.println();

        while (true) {
            // Вывод меню выбора продукта типа "Сахарное перо"
            Menu.printMenuGiftCreatingQuills();

            choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    // Просмотр всех доступных продуктов типа "Сахарное перо"
                    System.out.println("\nChecking Sugar Quills products:\n");
                    honeydukes.printQuillsList();
                    break;
                case 2:
                    // Добавление к подарку первого продукта типа "Сахарное перо"
                    System.out.println("\nHow many quills do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(quills[0], amount);
                    System.out.println("\nQuills added!\n");
                    break;
                case 3:
                    // Добавление к подарку второго продукта типа "Сахарное перо"
                    System.out.println("\nHow many quills do you want to add?");
                    amount = myValue.nextInt();
                    gift.addAPack(quills[1], amount);
                    System.out.println("\nQuills added!\n");
                    break;
                case 4:
                    // Возврат к предыдущему меню
                    System.out.println("\nGoing back to picking...\n");
                    return gift;
                default:
                    // Вывод ошибки некорректной команды
                    System.out.println("\nWrong command!\n");
            }

            System.out.println("Pick another Sugar Quill!\n");
        }
    }


    /**
     * Метод main
     * Генерирует список доступных товаров и готовых подарков, выводит первое меню выбора действия
     *
     * @param args args
     */
    public static void main(String[] args) {
        Scanner myValue = new Scanner(System.in);

        // Генерация списка доступных товаров и готовых подарков
        Honeydukes honeydukes = generateHoneydukes();

        System.out.println("One more hello");

        System.out.println("Welcome to Honeydukes!\n");

        while (true) {
            Menu.printMenu();
            int choice = myValue.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    // Просмотр всех доступных продуктов
                    checkProducts(honeydukes);
                    break;
                case 2:
                    // Покупка подарка
                    getAGift(honeydukes);
                    break;
                case 3:
                    // Выход из программы
                    System.out.println("Goodbye!");
                    myValue.close();
                    return;
                default:
                    // Вывод ошибки некорректной команды
                    System.out.println("Wrong command!\n");
                    break;
            }
        }
    }
}
