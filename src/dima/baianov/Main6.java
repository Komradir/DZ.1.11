package dima.baianov;

import java.util.Arrays;


public class Main6 {
    public static void main(String args[]) {
        boolean[] massyv = {true, false,true, false,true, false,true, false };
        System.out.println(Arrays.toString(massyv));
        System.arraycopy(massyv, 1, massyv, 0, 7);

        System.out.println(Arrays.toString(massyv));
    }

}
