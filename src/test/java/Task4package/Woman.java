package Task4package;

import java.util.Scanner;

class Woman extends Human{
    protected boolean genderFemale = false;
    private Men man;
    private Woman woman;
    public Woman(String name, String surname, float height, float weight, boolean genderFemale){
        super(name, surname, height, weight);
        this.genderFemale = genderFemale;
        scanner = new Scanner(System.in);
    }

    public void bornChild(Human human){
        if (human == man || human == woman){
            random.nextInt(100);
        }
        try {
            System.out.println("Enter child name: ");
            while (!name.isEmpty()) {
                human.name = scanner.next();
                if(name.isEmpty()){
                    System.out.println("the child must have a name ");
                    human.name = scanner.next();
                }
                else {
                    System.out.println("You entered: " + human.name);
                    break;
                }
            }
        }
        catch (NullPointerException e){
            System.out.println("Error! String cannot be empty!");
        }

        human.surname = man.surname; // or surname = men.getSurname(); ???
        if (human == man){
            human.height = (float) (man.height + 0.1 * (woman.height - man.height));
        }
        else if (human == woman){
            human.height = (float) (woman.height + 0.1 * (man.height - woman.height));
        }

        if (human == man){
            human.weight = (float) (man.weight + 0.1 * (woman.weight - man.weight));
        }
        else if (human == woman){
            human.weight = (float) (woman.weight + 0.1 * (man.weight - woman.weight));
        }
        else{
            System.out.println("Nothing happened, split up...");
        }
        new Human(human.name, human.surname, human.height, human.weight);
    }
}
