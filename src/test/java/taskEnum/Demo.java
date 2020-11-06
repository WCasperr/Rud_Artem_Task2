package taskEnum;

import java.util.Arrays;

    public class Demo {
        public static void main(String[] args) {
            MyEnum afrikan = MyEnum.FIRSTHUMAN;
            MyEnum european = MyEnum.SECONDHUMAN;
            MyEnum asian = MyEnum.THIRDHUMAN;
            System.out.println("Human names and age : \n " + afrikan.getName() +" age: "+afrikan.getHumanAge()
                    + "\n" + european.getName() +" age: "+european.getHumanAge()
                    + "\n" + asian.getName()+ " age: " +asian.getHumanAge());
            System.out.println("First Human race is " + afrikan.getHumanRace()
                    + "\n Second Human race is " + european.getHumanRace()
                    + "\n Third Human race is " + asian.getHumanRace());
            // значения начинаются с нуля
            System.out.println("ordinal value  \n" +
                    afrikan.ordinal() +" "+ european.ordinal() +" "+ asian.ordinal());
            System.out.println("Enum values : " + Arrays.toString(MyEnum.values()));
        }
    }

