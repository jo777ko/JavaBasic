/**
 * Java Basic. HomeTask8
 *
 * @authur Geork (Жора)
 * @todo 28.9.2022
 * @date 02.10.2022
 */
public class HomeTask8 {
    public static void main(String[] args) {
        //Level 1
        System.out.println("Level: 1");
        Cat cat = new Cat("Kleopatra","Black", 5, 1);
        System.out.println(cat);
        System.out.println(cat.voice());
        System.out.println("Try to play: " + cat.play());
        cat.feed();
        System.out.println("Try to play: " + cat.play());
        System.out.println("Try to play: " + cat.play());
        cat.feed();
        System.out.println("Try to jump: " + cat.jump(1));
        cat.feed();
        System.out.println("Try to jump: " + cat.jump(2));
        //Level 2
        System.out.println("Level: 2");
        Car car = new Car("GTR", "Black");
        System.out.println(car);
        System.out.println(car.engineOn());
        System.out.println(car.pressClutch());
        System.out.println(car.pressGas());
        System.out.println(car.leftClutch());
        System.out.println(car.pressBreak());
        System.out.println(car.engineOff());
    }
}
