package productShop.product;

import productShop.product.drinks.Drinks;
import productShop.product.food.Food;
import productShop.product.food.fruit.Fruit;
import productShop.product.food.meat.Meat;

public class Main {

    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Apple",4.99F, "10/02/23", 2400,"Golden");
        Fruit fruit2 = new Fruit("Orange",7.5F, "05/02/23", 1650,"Red");
        Meat meat1 = new Meat("Chicken fillet", 9.99F, "25/01/23", 1273, "Chicken");

        System.out.println(fruit1.getName());
        System.out.println(fruit2.getConsumeBefore());
        System.out.println(meat1.getGram());
        fruit1.setGram(3100);
        System.out.println(fruit1.GetGramInKilo(fruit1.getGram()));
    }
}
