package Task4package;
import java.util.Random;
import java.util.Scanner;

public class Human {

    protected String name;
    protected String surname;
    protected float height;
    protected float weight;
    public Random random;
    public Scanner scanner;
    private Human human;

    public Human(String name, String surname, float height, float weight){
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    public String getName(){return name;}
    public void setName(){this.name = name;}
    public String getSurname(){return surname;}
    public void setSurname(){this.surname = surname;}
    public float getHeight(){return height;}
    public void setHeight(){this.height = height;}
    public float getWeight(){return weight;}
    public void setWeight(){this.weight = weight;}


    public boolean toSpeak(boolean men, boolean women){
        if (men == false && women == false){ return true;}
        else if (men == true && women == false){return true;}
        else if (men == false && women == true){return true;}
        else if (men == true && women == true){
            if (random.nextInt(100)<50){return true;}
            else {return false;}
        }
        return false;
    }

    public boolean tolerateCommunity(boolean men, boolean women){
        if (men == false && women == false){
            if (random.nextInt(100)<5){return true;}
        }
        else if(men == false && women == true){
            if (random.nextInt(100)<70){return true;}
        }
        else if (men == true && women == false){
            if (random.nextInt(100)<70){return true;}
        }
        else if (men == true && women == true){
            if (random.nextInt(100)<5.6){return true;}
        }
        return false;
    }

    public boolean spendTimeTogether(Men men, Woman women){
        if (men.getHeight() <= women.getHeight() && (men.getHeight()*0.1)>women.getHeight()){
            return random.nextInt(100) < 85;
        }
        else if (men.getHeight() >= women.getHeight() && (women.getHeight()*0.1)<women.getHeight()){
            return random.nextInt(100) < 95;
        }
        return false;
    }

    public void beInRelationship(Men men, Woman women) {
        if (toSpeak(true, false) && tolerateCommunity(true, false) &&
                spendTimeTogether(men, women)) {
            women.bornChild(human);
        }
    }

    public void compatibilityTest(Men men, Woman women){
        beInRelationship(men, women);
    }
}