package productShop.product.food;

import productShop.interfaces.GramToKilogram;
import productShop.product.Product;

public abstract class Food extends Product implements GramToKilogram {

    private float gram;

    public Food(String name, float price, String consumeBefore, float gram) {
        super(name, price, consumeBefore);
        this.gram = gram;
    }

    public float getGram() {
        return gram;
    }

    public void setGram(float gram) {
        this.gram = gram;
    }

    @Override
    public String GetGramInKilo(float gram) {
        return (GramToKilogram.super.GetGramInKilo(gram));
    }
}

