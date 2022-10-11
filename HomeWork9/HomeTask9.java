package HomeWork9;

/**
 * Java Basic. HomeTask9
 *
 * @authur Geork (Жора)
 * @todo 05.10.2022
 * @date 12.10.2022
 */

public class HomeTask9 {

    public static void main(String[] args) {

        Cat1 cat = new Cat1("Barsik", "red", 2);
        Dog dog = new Dog("Polkan", "black", 3);

        System.out.println("Level1: ");
        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.voice());
        }
        //Level 2
        System.out.println("Level2: ");
        Human human = new Human("John", 4, 10);
        Robot robot = new Robot("Optimus", 5, 15);
        Kitty kitty = new Kitty("Kleopatra", 1, 1);
        Wall wall = new Wall();
        RunningTrack rt = new RunningTrack();

        int[] barriers = {wall.heightOfWall, rt.distanceOfRun};
        int[] players = {human.isJump(), robot.isJump(), kitty.isJump()
                , kitty.isRun(), robot.isRun(), human.isRun()};
        for (int i = 0, j = 5; i < j; i++,j--) {
            if (barriers[0] < players[i]) {
                System.out.println("Do next");
                if (barriers[1] < players[j]) {
                    System.out.println("You win.");
                } else {
                    System.out.println("You lose, because you needed to pass first barrier.");
                }
            } else {
                System.out.println("You lose.");
            }
        }
    }
}


