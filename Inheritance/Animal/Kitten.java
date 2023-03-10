package Inheritance.Animal;

public class Kitten extends Cat implements Sound{
    private static final String GENDER = "Female";

    public Kitten(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return Messages.KITTEN_SOUND;
    }
}
