package Task4package;

class Men extends Human{
    protected boolean genderMale = true;
    public Men(String name, String surname, float height, float weight, boolean genderMale){
        super(name, surname, height, weight);
        this.genderMale = genderMale;
    }
    public boolean getGenderMale(){return genderMale;}
}
