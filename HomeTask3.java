import java.util.Arrays;
/**
 * Java Basic. HomeTask3
 * 
 * @authur Geork (Жора)
 * @todo 12.09.2022
 * @date 18.09.2022
 */

public class HomeTask3 {
    public static void main(String[] args) {
        int [] arr = {5, -3, 8, -7, 10, -1, 12};
        System.out.println("Task: a");
        printArray(arr);
        System.out.println("Task: b");
        System.out.println(getMax(arr));
        System.out.println("Task: c");
        int [] arr2 = {1, 0, 1, 1, 0, 1};
        printArray(invertArray(arr2));
        System.out.println("Task: d");
        int [] arr3 = {5, -3, 8, -2, 10, -1, 12};
        printArray(sortArray(arr3));
    }
    static void printArray(int[] array) {
        System.out.print("[");
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a]);
            if (a < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    static int getMax(int[] array){
        int max = array[0];
        for (int b = 1; b < array.length; b++) {
            if( array[b] > max ) {
                max = array[b];
            }
        }
        return max;
    }
    static int[] invertArray (int [] array) {
        for (int c = 0; c < array.length; c++) {
            if (array[c] == 0){
                array[c] = 1;
            } else {
                array[c] = 0;
            }
        }
        return array;
    }
    static int[] sortArray (int [] array) {
        for(int i = 0; i <  array.length; i++) {
            Arrays.sort(array);
        }
        return array;
    }
}

