package Task4package;
import java.util.Random;
import java.util.ArrayList;

public class Human {
    private boolean genderType;
    private String name;
    private String lastName;
    private float height;
    private float weight;

    private ArrayList<Human> list = new ArrayList<>();
    public Human (){
        genderType = false;
        name = "Child";
        lastName = "ChildLastName";
        height = 30;
        weight = 3;
    }
    public Human(boolean genderType, String name, String lastName, float height, float weight) {
        this.genderType = genderType;
        this.name = name;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
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
    public String toString(){
        return "This " +genderType+ "'s name " + name + " and surname "+lastName+", is "+height+" tall and weigh "+weight+ " kilos";
    }
    public boolean talk(boolean man, boolean woman){
        if (!man && !woman)
        {
            return true;
        }
        else if (man && !woman){
            return true;
        }
        else if (!man){
            return true;
        }
        else {
            Random r1 = new Random();
            if (r1.nextInt(100) < 50)
            {
                return true;
            }
            else
                return false;
        }
    }
    public boolean company(boolean man, boolean woman){
        if (man && woman){
            Random r2 = new Random();
            if (r2.nextInt(100) < 5){
                return true;
            }
        }
        else if (!man && woman){
            Random r3 = new Random();
            if (r3.nextInt(100) < 70){
                return true;
            }
        }
        else if (man){
            Random r4 = new Random();
            if (r4.nextInt(100) < 70){
                return true;
            }
        }

            return false;
    }

}

