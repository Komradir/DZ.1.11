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
        ArrayList<Integer> listmax = new ArrayList<>();
        ArrayList<Integer> listmix = new ArrayList<>();
        for (int[] arrayOneD : array) {

            Arrays.sort(arrayOneD);

            int max = getMax(arrayOneD);
            int min = getMin(arrayOneD);
            listmax.add(max);
            listmix.add(min);

        }
        int mas[][] = {
                {listmax.get(0),listmix.get(0)},
                {listmax.get(1),listmix.get(1)},
                {listmax.get(2),listmix.get(2)},
                {listmax.get(3),listmix.get(3)},
                {listmax.get(4),listmix.get(4)},
                {listmax.get(5),listmix.get(5)},


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
