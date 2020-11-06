package Task4package;

public class Task4 {
    public static void main(String[] args) {
        Human human = new Human("Sergey", "Rud", 58, 3);
        Men men = new Men("Artem", "Rud", 185, 69, true);
        Woman women = new Woman("Julia", "Pysarenko", 165, 50, false);
        human.tolerateCommunity(true,true);
        human.compatibilityTest(men,women);

       // System.out.println(human);

    }

}

