package Task3package;

import java.util.Comparator;

public class Task3 {
    public static void main(String[] args) {

        Сhef c = new Сhef();

        c.add("Beet", "pink", 350, 200);
        c.add("Carrot", "yellow", 100, 60);
        c.add("Potato", "brown", 500, 40);
        c.add("Onion", "purple", 50, 30);
        c.add("Garlic", "white", 10, 3);
        System.out.println("Vegetables equals : " + c.compareVegetables(c.getSalad().get(2), c.getSalad().get(4)));
        c.DeleteByName("Onion");
        c.DeleteByColor("yellow");
        c.salad.sort(Comparator.comparing(Vegetable::getCalories));
        c.salad.sort(Comparator.comparing(Vegetable::getCalories).reversed());
        c.salad.sort(Comparator.comparing(Vegetable::getWeight));
        c.salad.sort(Comparator.comparing(Vegetable::getWeight).reversed());
        c.DeleteAllVegetables();
        System.out.println("Calories: " + c.getSaladCalories());
        c.View();
    }
}
