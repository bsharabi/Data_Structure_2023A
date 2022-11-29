package L05;

import java.util.Arrays;
import java.util.Random;

public class practice {

    public static void main(String[] args) {
        int[] a= {1,2,5,6};
        int[] b= {1,4,5,7};
        int[] c= merge(a,b);

    }
    //3m+3k => O(m+k)
    private static int[] merge(int[] a, int[] b) {
        //O(k) + O(m)
        if (!isSorted(a) || !isSorted(b)) {
            return null;
        }
        //size = k+m
        int[] c = new int[a.length + b.length];
        int k = 0;
        int m = 0;
        int l = 0;
        //O(k+m)
        while (k < a.length && m < b.length) {
            if (a[k] <= b[m]) {
                c[l++] = a[k++];
            } else {
                c[l++] = b[m++];
            }
        }
        //O(k)
        while (k < a.length) {
            c[l++] = a[k++];
        }
        //O(m)
        while (m < b.length) {
            c[l++] = b[m++];
        }
        return c;
    }

    //O(n)
    private static boolean isSorted(int[] arr) {
        // if  a<b and b<c then  a<c
        //{1,2,3,4,3,5,6,7,8,9}
        if (arr == null)
            return true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }

    //O(1)
    private static void swap(int[] arr, int indexI, int indexJ) {
        int temp = arr[indexJ];
        arr[indexJ] = arr[indexI];
        arr[indexI] = temp;
    }

    //O(n^2)
    private static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }

}