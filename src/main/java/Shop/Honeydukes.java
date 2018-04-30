package Shop;

import Candies.*;

import java.util.*;

/**
 * Класс Honeydukes
 * "Магазин" - хранит данные обо всех имеющихся продуктах, а также данные о готовых подарках
 *
 * @see Candies
 * @see Gift
 *
 * @author Natalia Litvinova
 */

public class Honeydukes {
    /**
     * Атрибуты класса:
     * Список имеющихся продуктов
     * Список готовых подарков
     */
    private HashMap<String, LinkedList<Candy>> products;
    private ArrayList<Gift> gifts;

    public Honeydukes() {
        this.products = new HashMap<>();
        this.gifts = new ArrayList<>();
    }

    public Honeydukes(HashMap<String, LinkedList<Candy>> products, ArrayList<Gift> gifts) {
        this.products = products;
        this.gifts = gifts;
    }

    public HashMap<String, LinkedList<Candy>> getProducts() {
        return products;
    }

    public void setProducts(HashMap<String, LinkedList<Candy>> products) {
        this.products = products;
    }

    public ArrayList<Gift> getGifts() {
        return gifts;
    }

    public void setGifts(ArrayList<Gift> gifts) {
        this.gifts = gifts;
    }

    public boolean addAProduct(Candy product) {
        HashMap<String, LinkedList<Candy>> products = this.getProducts();

        String key = product.getFullName();

        if (products.containsKey(key)) {
            LinkedList<Candy> productList = products.get(key);

            if (productList.contains(product))
                return false;
            else {
                productList.add(product);

                products.put(key, productList);

                this.setProducts(products);

                return true;
            }
        } else {
            LinkedList<Candy> productList = new LinkedList<>();

            productList.add(product);

            products.put(key, productList);

            this.setProducts(products);

            return true;
        }
    }

    public boolean addAGift(Gift gift) {
        ArrayList<Gift> gifts = this.getGifts();

        if (gifts.contains(gift))
            return false;
        else {
            gifts.add(gift);

            this.setGifts(gifts);

            return true;
        }
    }

    public void printOneList(String fullName) {
        HashMap<String, LinkedList<Candy>> products = this.getProducts();

        if (products.containsKey(fullName)) {
            LinkedList<Candy> productsList = products.get(fullName);
            if (!productsList.isEmpty()) {
                Iterator<Candy> iterator = productsList.iterator();
                Candy candy = iterator.next();

                System.out.println("Name of product:");
                System.out.println(candy.getFullName());
                System.out.println("Description of product:");
                System.out.println(candy.getDescription());


                System.out.println("\nTypes of product:\n");

                int i = 1;
                System.out.println("Pack №" + i);
                candy.print();
                System.out.println();

                while (iterator.hasNext()) {
                    candy = iterator.next();
                    i++;
                    System.out.println("Pack №" + i);
                    candy.print();
                    System.out.println();
                }
            } else
                System.out.println("\nOoops! Zero products named " + fullName + " found\n");
        } else
            System.out.println("\nOoops! Zero products named " + fullName + " found\n");
    }

    public void printHoneydukes() {
        HashMap<String, LinkedList<Candy>> products = this.getProducts();

        int i = 1;

        for (Map.Entry<String, LinkedList<Candy>> entry : products.entrySet()) {
            System.out.println("Product №" + i + "\n");

            this.printOneList(entry.getKey());

            System.out.println();

            i++;
        }
    }

    public void printGiftsList() {
        ArrayList<Gift> gifts = this.getGifts();

        int i = 1;

        for (Gift gift : gifts) {
            System.out.println("Gift №" + i + "\n");
            System.out.println("\"" + gift.getFullName() + "\"");
            System.out.println(gift.getDescription());

            System.out.println("\nTotal weight of this gift (1 kg = 1000 g):");
            int weight = gift.getTotalWeight();
            System.out.println(weight / 1000 + " kg " + weight % 1000 + " g (" + weight + " g)");

            System.out.println("\nTotal price of this gift (1 Galleon = 17 Sickles):");
            int price = gift.getTotalPrice();
            System.out.println(price / 17 + " Galleons " + price % 17 + " Sickles (" + price + " Sickles)\n\n");
        }
    }
}
