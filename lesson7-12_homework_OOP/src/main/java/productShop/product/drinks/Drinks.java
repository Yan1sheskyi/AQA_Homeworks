package productShop.product.drinks;

import productShop.product.Product;

public final class Drinks extends Product {

    private float liter;
    private boolean alcoholic;

    public Drinks(String name, float price, String consumeBefore, float liter, boolean alcoholic) {
        super(name, price, consumeBefore);
        this.liter = liter;
        this.alcoholic = alcoholic;
    }

    public float getLiter() {
        return liter;
    }

    public void setLiter(float liter) {
        this.liter = liter;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }
}
