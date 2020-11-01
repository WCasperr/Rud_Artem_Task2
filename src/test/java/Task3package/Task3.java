package Task3package;


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
        c.View();
        System.out.println("Calories: " + c.getSaladCalories());
    }
}
