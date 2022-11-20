package L04;

import java.util.Arrays;
import java.util.Random;

public class MinMax {

    public static void main(String[] args) {
       int[] arr = generate(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(generate(i)));
        }
       int[] min_max = minMx(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(min_max));
    }

    private static int[] minMx(int[] arr) {
        if(arr==null)
            return null;
        int value = arr[0];
        int max=value;
        int min =value;
        for (int i = 1; i < arr.length; i++) {
            value = arr[i];
//            if(value<min)
//                min=value;
//            if(value>max)
//                max=value;
            min=(value<min)?value:min;
            max=(value>max)?value:max;
        }
        return new int[]{min,max};
    }

    private static int[] generate(int n) {
        Random rd = new Random();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=rd.nextInt(100);
        }
        return arr;
    }
}
