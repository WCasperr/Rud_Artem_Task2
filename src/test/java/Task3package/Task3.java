package Task3package;


import java.util.ArrayList;
import java.util.Comparator;

public class Task3 {
    public static void main(String[] args) {

        Сhef c = new Сhef();

        c.add("Man", "pink", 1, 5);
        c.add("Tam", "yellow", 2, 6);
        c.add("Son", "brown", 3, 7);
        c.add("Ban", "black", 4, 8);
        c.add("Ban", "black", 4, 8);
        System.out.println("Vegetables equals : " + c.compareVegetables(c.getSalad().get(2), c.getSalad().get(4)));
        c.DeleteByName("Ban");
        c.DeleteByColor("yellow");
        c.salad.sort(Comparator.comparing(Vegetable::getCalories));
        c.salad.sort(Comparator.comparing(Vegetable::getCalories).reversed());
        c.salad.sort(Comparator.comparing(Vegetable::getWeight));
        c.salad.sort(Comparator.comparing(Vegetable::getWeight).reversed());
        c.View();
        System.out.println("Calories: " + c.getSaladCalories());
    }
}
