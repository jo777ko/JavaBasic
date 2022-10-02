import java.util.*;
/**
 * Java Basic. HomeTask7
 *
 * @authur Geork (Жора)
 * @todo 26.9.2022
 * @date 02.10.2022
 */

public class HomeTask7 {
    public static void main(String[] args) {
        // part of Lottery game
        List<Integer> lottery = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lottery.add(i + 1);
        }
        //shuffle
        Collections.shuffle(lottery);
        System.out.println(lottery.subList(0, 10));

        showCollections();
        showMap();
        showArraysList();
        showArrays();
    }

    static void showCollections() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(6, 10, 11, 15, 3, 0));
        System.out.println(arrayList);
        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.min(arrayList));
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    static void showMap() {
        Map<Integer, String> daysMap = new HashMap<>();
        daysMap.put(1,"Monday");
        daysMap.put(2, "Tuesday");
        System.out.println(daysMap);
        System.out.println(daysMap.get(1));
    }
    static void showArraysList() {
        List<Integer>arrayList = new ArrayList<>();
        System.out.println(arrayList);
        arrayList.add(7);
        arrayList.add(15);
        arrayList.addAll(Arrays.asList(20, 17, 14, 11, 8));
        System.out.println(arrayList);
        arrayList.add(1, 6);
        System.out.println(arrayList);
        arrayList.remove(4);
        System.out.println(arrayList);
        for (Integer a : arrayList) {
            System.out.println(a);
        }
    }
    static int[] generateArray(int length) {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random()*20);
        }
        return result;
    }
    static void showArrays() {
        int[] arr = generateArray(20);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int found = Arrays.binarySearch(arr, 10);
        System.out.println(found + ":" + arr[found]);
    }
}
