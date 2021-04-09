package dima.baianov;

import java.util.ArrayList;
import java.util.Arrays;

public class Main5 {
    public static void main(String args[]) {
        int array[][] = {
                {1, 15, 7, 21, 228, 1488, 322, 228},
                {9, 77, 69, 55, 2, 4, 6, 0},
                {22, 33, 44, 55, 66, 77, 88, 11},
                {34, 52, 11, 56, 78, 99, 88, 12},
                {67, 55, 32, 3, 16, 64, 1337, 8},
                {9, 78, 90, 91, 87, 78, 51, 72},
        };
        System.out.println(Arrays.deepToString(array).replaceAll("],", "]," + System.getProperty("line.separator"))); // я ваще не понимаю как и что тут происходит, но я только так смог вывести массив
        System.out.println("-----------------------");
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] arrayOneD : array) {

            Arrays.sort(arrayOneD);

            int max = getMax(arrayOneD);
            int min = getMin(arrayOneD);
            list.add(max);
            list.add(min);

        }
        int mas[][] = {
                {list.get(0),list.get(1)},
                {list.get(2),list.get(3)},
                {list.get(4),list.get(5)},
                {list.get(6),list.get(7)},
                {list.get(8),list.get(9)},
                {list.get(10),list.get(11)},


        };
        System.out.println(Arrays.deepToString(mas).replaceAll("],", "]," + System.getProperty("line.separator")));
    }




    public static int getMax(int[] array){
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] array){
        int minValue = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }
}
