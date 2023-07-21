package productShop.product.food.meat;

import productShop.product.food.Food;

public final class Meat extends Food {

    private String animal;

    public Meat(String name, float price, String consumeBefore, float gram, String animal) {
        super(name, price, consumeBefore, gram);
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}
