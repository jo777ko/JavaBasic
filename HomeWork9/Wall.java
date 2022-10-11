package HomeWork9;

public class Wall {
    protected int heightOfWall = 3;

    public void setValues(int height){
        this.heightOfWall = height;
    }

    public void info(int heightOfWall){
        if(heightOfWall > 2){
           System.out.println("Barrier has passed.");
        } else {
          System.out.println("Try again.");
        }
    }

}
