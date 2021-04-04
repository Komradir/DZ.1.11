package dima.baianov;

public class Main4 { public static void main(String args[]) { char [][] arrayTwoD = {

        {97 , 98},

        {99, 100},

        {101, 102},

        {103, 104}

};

    for (char [] arrayOneD : arrayTwoD) {

        for (char element : arrayOneD) {

            System.out.print(element + " ");

        }

        System.out.println();

    } }

}
