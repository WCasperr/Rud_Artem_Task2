package taskEnum;

public enum MyEnum {
    FIRSTHUMAN("Jojo","afrikan", 18),
    SECONDHUMAN("Ivan","european", 25),
    THIRDHUMAN("Chi","asian", 71);

    protected String name;
    protected String humanRace;
    protected int humanAge;

    MyEnum(String name,String humanRace, int humanAge) {
        this.name = name;
        this.humanRace = humanRace;
        this.humanAge = humanAge;
    }

    public String getName() {
        return name;
    }

    public String getHumanRace() {
        return humanRace;
    }

    public int getHumanAge() {
        return humanAge;
    }
}
