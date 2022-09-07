/**
*Java Basic. HomeTask1
*
*@authur Geork (Жора)
*@version 6.9.2022
*
*/

import java.util.Arrays;
import static java.lang.Math.*;

public class HomeTask1 {
    public static void main(String[] args) {
    
    int a = 6, b =4;                    // Task1
    int S = a * b;
    int P = (a + b) * 2;
    
    System.out.println("Task 1");
    
    //System.out.printf("Sqauare is = %d, Perimeter is = %d", S, P);
    
    System.out.println("Sqauare is = " + S + " " + "Perimeter is = " + P);
    
    int x = 5, y = 3;                       // Task 2
    
    System.out.println("Task2");
    int sum = x + y;
    System.out.println("sum = " + sum);
    int sub = x - y;
    System.out.println("sub = " + sub);
    int mult = x * y;
    System.out.println("mult = " + mult);
    float div = x / (float) (y);
    System.out.println("div = " + div);
    
    int [] myFirstArray = new int [5];           // Task 3
    myFirstArray [0] = 2;
    myFirstArray [1] = 4;
    myFirstArray [2] = 6;
    myFirstArray [3] = 8;
    myFirstArray [4] = 10;
    
    String myFirstArrayToString = Arrays.toString(myFirstArray);
    
    System.out.println("Task 3");
    System.out.println(myFirstArrayToString);   // в одной строке
    
    //System.out.println(myFirstArray[0]);      
    //System.out.println(myFirstArray[1]);      
    //System.out.println(myFirstArray[2]);      //по одному значению в строке
    //System.out.println(myFirstArray[3]);      
    //System.out.println(myFirstArray[4]);
    
    int d = 50;                                     // Task 4
    int r = d / 2;
    double SC = Math.PI * r * r;
    double totalCalories = SC * 40;
    
    System.out.println("Task 4");
    //System.out.println("Energy of pizza = " + totalCalories + " " +"cal");        // без округление
    
    //String total = String.format("%.2f",totalCalories);                           //округление до сотых
    //System.out.println("Energy of pizza = " + total + " " + "cal");
    
    System.out.println("Energy of pizza = " + round(totalCalories) + " " + "cal");

    }
}
