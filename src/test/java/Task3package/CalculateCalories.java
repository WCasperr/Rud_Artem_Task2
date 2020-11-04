package Task3package;

import java.util.List;

public class CalculateCalories {

    public static int calculate(List<Vegetable> vegetableList) {
        int calories = 0;
        for (Vegetable vegetable : vegetableList) {
            calories += vegetable.getCalories();
        }
        return calories;
    }
}
