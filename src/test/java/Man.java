public class Man{
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
        System.out.println("Man height is - "+getHeight() + "\n Man weight is - " + getWeight()
                +"\n Man hair color is - " + getHairColor());
    }
}