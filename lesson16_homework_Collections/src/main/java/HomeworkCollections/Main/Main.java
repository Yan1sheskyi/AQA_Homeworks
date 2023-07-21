package HomeworkCollections.Main;

import HomeworkCollections.ProductMarket.Product;
import HomeworkCollections.ProductMarket.ProductMarket;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Product pr0 = new Product("Apple", 5);
        Product pr1 = new Product("Coca-cola", 15);
        Product pr2 = new Product("Snickers", 3);
        Product pr3 = new Product("Chicken", 8);
        Product pr4 = new Product("Golden egg", 18);
        Product pr5 = new Product("Pepsi", -13);
        Product pr6 = new Product("Banana", -5);
        Product pr7 = new Product("Potato", 2);
        Product pr8 = new Product("Watermelon", 12);

        ArrayList<Product> prList = new ArrayList<>();
        prList.add(new Product("Apple", 4));
        prList.add(pr0);
        prList.add(pr1);
        prList.add(pr2);
        prList.add(pr3);
        prList.add(pr4);
        prList.add(pr5);
        prList.add(pr6);
        prList.add(pr7);
        prList.add(pr8);

        ProductMarket list = new ProductMarket(prList);

        System.out.println(list.printAllNames());
        System.out.println(list.printAllNamesSorted());
        System.out.println(list.printAllPricesMoreThanTen());
        System.out.println(list.printAllPricesLessThanZero());
        System.out.println(list.printAllPricesAsString());


    }

}
