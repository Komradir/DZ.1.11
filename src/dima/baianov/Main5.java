package dima.baianov;

import java.util.Arrays;
public class Main5 {
    public static void main(String args[]) {
        int  [][] arrayTwoD  = {

                {1,15,7,21,228,1488,322,228},
                {9,77,69,55,2,4,6,0},
                {22,33,44,55,66,77,88,11},
                {34,52,11,56,78,99,88,12},
                {67,55,32,3,16,64,1337,8},
                {9,78,90,91,87,78,51,72},


        };
        System.out.println();
        
        int [][] mas;

        for (int  [] arrayOneD : arrayTwoD) {

            Arrays.sort(arrayOneD);

            }

        mas [0][0] = arrayTwoD[0][0];
        mas [0][1] = arrayTwoD[0][7];
        mas [1][0] = arrayTwoD[1][0];
        mas [1][1] = arrayTwoD[1][7];
        mas [2][0] = arrayTwoD[2][0];
        mas [2][1] = arrayTwoD[2][7];
        mas [3][0] = arrayTwoD[3][0];
        mas [3][1] = arrayTwoD[3][7];
        mas [4][0] = arrayTwoD[4][0];
        mas [4][1] = arrayTwoD[4][7];
        mas [5][0] = arrayTwoD[5][0];
        mas [5][1] = arrayTwoD[5][7];

        System.out.println(mas);
        }
    }

