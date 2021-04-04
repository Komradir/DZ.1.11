package dima.baianov;

public class Main3 {
      public static void main(String args[]) { String [][] arrayTwoD = {

            {"a1","a2","a3","a4","a5","a6"},

            {"b1","b2","b3","b4","b5","b6"},

            {"c1","c2","c3","c4","c5","c6"},

    };

        for (String [] arrayOneD : arrayTwoD) {

            for (String element : arrayOneD) {

                System.out.print(element + " ");

            }

            System.out.println();

        } }

    }

