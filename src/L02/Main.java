package L02;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long n1 = 10000;
        long start = System.currentTimeMillis();
        for (int i = 0, j = 9; i < n1; i++) {
            while (j > 0)
                j--;
            for (int k = 0; k < 10 * 10; k++) {
//                System.out.println("Hello");
                for (int l = 0; l < 21; l++) {
//                    System.out.println(l);
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        int n = 100;
        // 1+n+n+2*n
        //4n+1
        for (int i = 0; i < n; i++) {
//            System.out.println("hello");
//            System.out.println("hello");
        }
        String str = "abcefd";
        // 1+n+n+n =3n+2
        int i = 0;
        while (i < str.length() && str.charAt(i) != 'd') {
            i++;
        }
        if (i == str.length())
            System.out.println("False");
        else
            System.out.println("True");

        str = "abcdef" + "d";
        i = 0;
        //1+1+2n = 2n+4
        while (str.charAt(i) != 'd') {
            i++;
        }
        if (i == str.length() - 1)
            System.out.println("False");
        else
            System.out.println("True");


        Random rd = new Random();
        int rdn = rd.nextInt(50);
        int[] arr = new int[rdn];
        for (int j = 0; j < rdn; j++) {
            arr[j] = rd.nextInt(21);
        }

        System.out.println(Arrays.toString(arr));

        int[] counting = new int[21];
        // 1+1+2n+n 3n+67
        for (int j = 0; j < arr.length; j++) {
            counting[arr[j]]++;
        }
        System.out.println(Arrays.toString(counting));
        int max = counting[0];
        int index = 0;
        //2+63
        for (int j = 1; j < 21; j++) {
            if (counting[j] > max) {
                max = counting[j];
                index = j;
            }
        }
        System.out.println(index);

    }
}