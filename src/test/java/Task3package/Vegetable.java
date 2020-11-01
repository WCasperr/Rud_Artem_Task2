package Task3package;

import java.util.Objects;

public class Vegetable extends Сhef {
    private String Name;
    private String Color;
    private double Weight;
    private double Calories;

    public Vegetable(String Name, String Color, double Weight, int Calories) {
        this.Name = Name;
        this.Color = Color;
        this.Weight = Weight;
        this.Calories = Calories;
    }

    public String getName() {
        return Name;
    }

    public String getColor() {
        return Color;
    }

    public double getWeight() {
        return Weight;
    }

    public double getCalories() {
        return Calories;
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
