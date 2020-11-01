package Task3package;

import java.util.ArrayList;

public class Сhef {
    private String dName;
    private String dColor;
    private double dWeight;
    private int dCalories;
    private ArrayList<Vegetable> salad = new ArrayList<>();

    public void add(String Name, String Color, double Weight, int Calories) {
        Vegetable vegetable = new Vegetable(Name, Color, Weight, Calories);
        salad.add(vegetable);
    }

    public boolean compareVegetables(Vegetable vegetable1, Vegetable vegetable2) {
        return vegetable1.equals(vegetable2);
    }

    public ArrayList<Vegetable> getSalad() {
        return salad;
    }

    public int getSaladCalories() {

        return CalculateCalories.calculate(salad);
    }

    public void DeleteAllVegetables() {
        salad.clear();
    }

    public void DeleteByName(String dName) {
        salad.removeIf(str1 -> str1.getName().equals(dName));
    }
    public void DeleteByColor(String dColor) {
        salad.removeIf(str1 -> str1.getColor().equals(dColor));
    }
    public void View() {
        for (Object v : salad) {
            System.out.println(v);
        }
    }
}

