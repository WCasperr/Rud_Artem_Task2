package Task3package;

import java.util.Objects;

public class Vegetable extends Сhef {
    private String name;
    private String color;
    private double weight;
    private double calories;

    public Vegetable(String Name, String Color, double Weight, int Calories) {
        this.name = Name;
        this.color = Color;
        this.weight = Weight;
        this.calories = Calories;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public double getCalories() {
        return calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return Double.compare(vegetable.getWeight(), getWeight()) == 0 &&
                Double.compare(vegetable.getCalories(), getCalories()) == 0 &&
                Objects.equals(getName(), vegetable.getName()) &&
                Objects.equals(getColor(), vegetable.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getColor(), getWeight(), getCalories());
    }

    @Override
    public String toString() {
        return "[ Vegetable Name is - " + getName()
                + ", Color - " + getColor()
                + ", Weight - " + getWeight()
                + " Calories - " + getCalories() + " ]";
    }
}
