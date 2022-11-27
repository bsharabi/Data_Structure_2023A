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

        long start = System.currentTimeMillis();

        for (int i = 2; i < 100; i++) {
            boolean ans = isPrime(i);
            if (ans)
                System.out.print(i + " ");
        }
        long end = System.currentTimeMillis();
        System.out.println("\nTime: "+(end-start));
        System.out.println();

         start = System.currentTimeMillis();

        for (int i = 2; i < 100; i++) {
            boolean ans = isPrimeSqrt(i);
            if (ans)
                System.out.print(i + " ");
        }
         end = System.currentTimeMillis();
        System.out.println("\nTime: "+(end-start));
    }

    //O(n)
    private static int SumEven(int[] arr) {
        if (arr == null)
            return Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] % 2 == 0) ? arr[i] : 0;
        }
        return sum;
    }

    //O(n)
    private static int sumArr(int[] arr) {
        if (arr == null)
            return Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //O(n)
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

    //O(n)
    public static boolean isPrime(int n) {
        int i = 2;
        while (n % i != 0) {
            i++;
        }
        return i == n;
    }

    //O(sqrt(n))
    public static boolean isPrimeSqrt(int n) {
        if(n<=1)
            return false;

        for (int i=2; i<=Math.sqrt(n);i++)
            if(n % i == 0)
                return false;

        return true;
    }
}
