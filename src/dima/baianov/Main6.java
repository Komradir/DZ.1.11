package dima.baianov;
import java.util.*;
import java.util.Arrays;


public class Main6 {
    public static void main(String args[]) {
        boolean[] massyv = {true, false, true, false, true, false, true, false};
        System.out.println(Arrays.toString(massyv));


        int q = 0;

        while (q <= 10) {
            boolean z = massyv[0];

            System.arraycopy(massyv, 1, massyv, 0, 7);
            massyv[7] = z;
            System.out.println(Arrays.toString(massyv));
            q ++;
        }


    }
}
