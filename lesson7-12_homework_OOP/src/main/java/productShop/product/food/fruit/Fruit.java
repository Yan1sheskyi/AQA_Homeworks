package productShop.product.food.fruit;

import productShop.product.food.Food;

public final class Fruit extends Food {

    private String sort;

    public Fruit(String name, float price, String consumeBefore, float gram, String sort) {
        super(name, price, consumeBefore, gram);
        this.sort = sort;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
