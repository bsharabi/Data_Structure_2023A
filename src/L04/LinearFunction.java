package L04;

import java.util.Arrays;
import java.util.Random;

public class LinearFunction {
    public static void main(String[] args) {
        int[] arr = generate(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(generate(i)));
        }

        int[] min_max = minMx(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(min_max));

        int sum = sumArr(arr);
        int sumEven = SumEven(arr);
        System.out.println(sum);
        System.out.println(sumEven);
    }

    private static int SumEven(int[] arr) {
        if (arr == null)
            return Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] % 2 == 0) ? arr[i] : 0;
        }
        return sum;
    }

    private static int sumArr(int[] arr) {
        if (arr == null)
            return Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int[] minMx(int[] arr) {
        if (arr == null)
            return null;
        int value = arr[0];
        int max = value;
        int min = value;
        for (int i = 1; i < arr.length; i++) {
            value = arr[i];
//            if(value<min)
//                min=value;
//            if(value>max)
//                max=value;
            min = (value < min) ? value : min;
            max = (value > max) ? value : max;
        }
        return new int[]{min, max};
    }

    public static int[] generate(int n) {
        Random rd = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }
}
