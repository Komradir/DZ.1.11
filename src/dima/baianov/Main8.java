package dima.baianov;

public class Main8 {
    public static void main(String args[]) {
        int array[] = new int[]
                {1, 15, 7, 21, 228, 1488, 322, 228};


        int maxValue = array[0];
        for(int i=1;i < array.length;i++){
            if(array[i] > maxValue){
            maxValue = array[i];
        }
        }
        System.out.println(maxValue);

    int minValue = array[0];
    for(int i=1;i<array.length;i++){
        if(array[i] < minValue){
            minValue = array[i];
        }
    }
        System.out.println(minValue);
}
}
