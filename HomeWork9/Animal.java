package HomeWork9;

public abstract class Animal {
    protected String name;
    protected String colour;
    protected int age;

    public Animal(String name) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    public String run() {
        return "distance:";
    }

    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}
