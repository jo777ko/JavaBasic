package HomeWork9;

public class Robot extends Machine implements IRunJump {
    String name;
    int distance;
    int jump;

    public Robot(String name, int jump, int distance){
        this.name = name;
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
