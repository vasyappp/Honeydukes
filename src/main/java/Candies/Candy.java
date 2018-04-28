package Candies;

public abstract class Candy {
    protected int weight;
    protected int price;

    public Candy () {
        this.weight = 0;
        this.price = 0;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void print();
}