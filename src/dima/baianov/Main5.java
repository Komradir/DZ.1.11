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

        for (int  [] arrayOneD : arrayTwoD) {

            for (int   element : arrayOneD) {

                System.out.print(element + " ");

            }


            System.out.println(Arrays.toString(arrayTwoD));
        }
    }

}