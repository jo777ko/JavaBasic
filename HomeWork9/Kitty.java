package HomeWork9;

public class Kitty extends Animal implements IRunJump{

    int distance;
    int jump;

    public Kitty(String name, int jump, int distance) {
        super(name);
        this.distance = distance;
        this.jump = jump;
    }

    @Override
    public int isRun() {
        return distance;
    }

    @Override
    public int isJump() {
        return jump;
    }
}
