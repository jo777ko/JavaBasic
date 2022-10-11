package HomeWork9;

public class Cat1 extends Animal implements IAnimal {
    public Cat1(String name, String colour, int age) {

        super(name);
    }

    public String voice() {

        return "meow";
    }

}
