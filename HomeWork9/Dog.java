package HomeWork9;

public class Dog extends Animal implements IAnimal {

    public Dog(String name, String colour, int age) {

        super(name);
    }

    @Override
    public String voice() {

        return "gaf - gaf";
    }
}
