package productShop.product;

public abstract class Product {

    private String name;
    private float price;
    private String consumeBefore;

    public Product(String name, float price, String consumeBefore) {
        this.name = name;
        this.price = price;
        this.consumeBefore = consumeBefore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getConsumeBefore() {
        return consumeBefore;
    }

    public void setConsumeBefore(String consumeBefore) {
        this.consumeBefore = consumeBefore;
    }
}
