package HomeWork9;

public class RunningTrack {
    protected int distanceOfRun = 10;

    public void setValues(int distance){
        this.distanceOfRun = distance;
    }

    public void info(int distanceOfRun){
        if(distanceOfRun > 5){
            System.out.println("Barrier has passed.");
        } else {
            System.out.println("Try again.");
        }
    }
}
