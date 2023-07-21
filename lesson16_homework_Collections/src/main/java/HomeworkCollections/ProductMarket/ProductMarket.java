package HomeworkCollections.ProductMarket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket extends ArrayList {

    private ArrayList<Product> list;

    public ProductMarket(ArrayList<Product> list) {
        this.list = list;
    }

    public ArrayList<Product> getList() {
        return list;
    }

    public ArrayList<String> printAllNames() {
        ArrayList<String> listOfNames = new ArrayList<>();
        for(Product s : list) {
            listOfNames.add(s.getName());
        }
        return listOfNames;

    }

    public ArrayList<String> printAllNamesSorted() {
        ArrayList<String> listOfNames = new ArrayList<>();
        for(Product s : list) {
            listOfNames.add(s.getName());
        }
        Collections.sort(listOfNames);
        return listOfNames;

    }

    public List<Integer> printAllPricesMoreThanTen() {
        ArrayList<Integer> listOfPrices = new ArrayList<>();
        for(Product s : list) {
            listOfPrices.add(s.getPrice());
        }
        List<Integer> listOfPricesMore10 = listOfPrices.stream()
                .filter(s -> s > 10)
                .collect(Collectors.toList());
        return listOfPricesMore10;
    }

    public List<Integer> printAllPricesLessThanZero() {
        ArrayList<Integer> listOfPrices = new ArrayList<>();
        for(Product s : list) {
            listOfPrices.add(s.getPrice());
        }
        List<Integer> listOfPricesLess0 = listOfPrices.stream()
                .filter(s -> s < 0)
                .collect(Collectors.toList());

        return listOfPricesLess0;
    }

    public List<String> printAllPricesAsString() {
        ArrayList<Integer> listOfPrices = new ArrayList<>();
        for(Product s : list) {
            listOfPrices.add(s.getPrice());
        }
        List<String> listOfPricesAsString = listOfPrices.stream()
                .map(s ->String.valueOf(s))
                .collect(Collectors.toList());
        listOfPricesAsString.add("Text that proves that this is list of String elements");
        return listOfPricesAsString;
    }

}
