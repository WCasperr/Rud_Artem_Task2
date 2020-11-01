package Task2package;

class Man{
    private int height;
    private int weight;
    private String hairColor;
    public Man(int height,int weight, String hairColor){
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor; }
    //Getter and Setter
    public int getHeight() { return height; }
    public void setHeight(int height) {
        if (height >= 0) {
            this.height = height;
        }
        else System.out.println("Height can`t be zero or below zero");
    }
    public int getWeight() {return  weight;}
    public void setWeight(int weight){this.weight = weight;}
    public String getHairColor() { return hairColor; }
    public void setHairColor(String hairColor) { this.hairColor = hairColor; }
    public void AboutMan(){
        System.out.println("Task2package.Man height is - "+getHeight() + "\n Task2package.Man weight is - " + getWeight()
                +"\n Task2package.Man hair color is - " + getHairColor());
    }
}
class Woman {
    private int height;
    private int weight;
    private String hairColor;

    public Woman(int height, int weight, String hairColor) {
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor; }
    //Getter and Setter
    public int getHeight() { return height; }
    public void setHeight(int height) {
        if (height >= 0) {
            this.height = height;
        }
        else System.out.println("Height can`t be zero or below zero");
    }
    public int getWeight() {return  weight;}
    public void setWeight(int weight){this.weight = weight;}
    public String getHairColor() { return hairColor; }
    public void setHairColor(String hairColor) { this.hairColor = hairColor; }
    public void AboutWoman(){
        System.out.println("Task2package.Woman height is - "+getHeight() + "\n Task2package.Woman weight is - " + getWeight()
                +"\n Task2package.Woman hair color is - " + getHairColor());
    }
}
public class Task2 {
    public static void main(String[] args) {
    Man FirstMan = new Man(185,75,"black");
    FirstMan.AboutMan();
    Woman FirstWoman = new Woman(163,50,"brown");
    FirstWoman.AboutWoman();
    }
}
