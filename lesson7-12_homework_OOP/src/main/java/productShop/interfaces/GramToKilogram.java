package productShop.interfaces;

public interface GramToKilogram {
    default String GetGramInKilo(float gram) {
        float kilo = gram / 1000;
        return gram + " gram = " + kilo + " kilogram";
    }
}