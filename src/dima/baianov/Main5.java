package dima.baianov;
import java.util.Arrays;
public class Main5 {
    public static void main(String args[]) {
        int[][] arrayTwoD = {
                {1, 15, 7, 21, 228, 1488, 322, 228},
                {9, 77, 69, 55, 2, 4, 6, 0},
                {22, 33, 44, 55, 66, 77, 88, 11},
                {34, 52, 11, 56, 78, 99, 88, 12},
                {67, 55, 32, 3, 16, 64, 1337, 8},
                {9, 78, 90, 91, 87, 78, 51, 72},
        };
        System.out.println();


        for (int[] arrayOneD : arrayTwoD) {

            Arrays.sort(arrayOneD);
            System.out.println(arrayOneD);

        }
        int p1 = arrayTwoD[0][0];
        int a1 = arrayTwoD[0][7];
        int s1 = arrayTwoD[1][0];
        int d1 = arrayTwoD[1][7];
        int l1 = arrayTwoD[4][7];
        int z1 = arrayTwoD[5][0];
        int x1 = arrayTwoD[5][7];


        int[][] mas = {
                {p1, a1},
                {s1, d1},
                {z1, x1},
        };
        System.out.println(mas);

    }
}


