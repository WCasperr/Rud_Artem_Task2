package Task4package;

import Task3package.Vegetable;

import java.util.ArrayList;

public class Human {
private boolean genderType;
private String name;
private String lastName;
private float height;
private float weight;
    private ArrayList<> list = new ArrayList<>();

    public void add(String Name, String Color, double Weight, int Calories) {
        Vegetable vegetable = new Vegetable(Name, Color, Weight, Calories);
        salad.add(vegetable);
    }
    public boolean isGenderType() {
        return genderType;
    }

    public void setGenderType(boolean genderType) {
        this.genderType = genderType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
