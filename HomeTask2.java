/**
 * Java Basic. HomeTask2
 * 
 * @authur Geork (Жора)
 * @todo 7.9.2022
 * @date 11.9.2022
 */


public class HomeTask2 {
    public static void main(String[] args) {
    
        System.out.println("Task1:");
        checkWeather(-100);
        checkWeather(5);
        checkWeather(22);
        checkWeather(40);
        
        System.out.println("Task2:");
        canWalk();
    
        System.out.println("Task3:");
        System.out.println(sum(12, 8));
        System.out.println(sub(12, 8));
        System.out.println(mult(12, 8));
        System.out.println(div(12, 8));

        System.out.println("Task4:");
        dayOfWeek(6);
        
        System.out.println("Task5:");
        canBuyFood();
        
        System.out.println("Task6:");
        resultOfQuadraticEquation(1, -8, 12);
        resultOfQuadraticEquation(1, -6, 9);
        resultOfQuadraticEquation(5, 3, 7);
    
    }
    
    static void checkWeather(int temperature){

        if (temperature < 0){
            System.out.println("It's frost");
        } else if (temperature > 0 && temperature < 18){
            System.out.println("It's cold");
        } else if (temperature > 18 && temperature < 29){
            System.out.println("It's warm");
        } else {
            System.out.println("It's hot");
        }
    }

    static void canWalk(){
        boolean isWeekend = true;
        boolean isRain = true;
        if (isWeekend && isRain) {
            System.out.println("I can walk");
        } else {
            System.out.println("I can't walk");
        }
    }

    static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
    static double div(double a, int b) {
        double c = a / b;
        return c;
    }
    static int sub(int a, int b) {
        int c = a - b;
        return c;
    }
    static int mult(int a, int b) {
        int c = a * b;
        return c;
    }
    
    
    static void dayOfWeek (int numberOfDay){
        switch (numberOfDay) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Tursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Error Week number!");
                break;
            }
        }
    static void canBuyFood(){
        boolean isLidlOpen = true;
        boolean isTescoOpen = false;
        if (isLidlOpen && isTescoOpen) {
            System.out.println("I can buy food in Lidl and Tesco");
        } else if (isLidlOpen ){
            System.out.println("I can buy food in Lidl");
        } else if (isTescoOpen ){
            System.out.println("I can buy food in Tesco");
        } else {
            System.out.println("I can't buy food");
        }
    }
    static void resultOfQuadraticEquation(int a, int b, int c){
    
        double d = (b * b) - (4 * a * c);

        double x1, x2;
            x1 = (( - b) + Math.sqrt(d)) / (2 * a);
            x2 = (( - b) - Math.sqrt(d)) / (2 * a);
        if (d ==0){
            double x;
            x = (-b) / (2 * a);
            System.out.println("One root: x = " + x);
        } else if (d > 0){
            System.out.println("Two roots: x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("No roots");
        }
    }
}