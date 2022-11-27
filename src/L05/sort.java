package L05;

import java.util.Arrays;
import java.util.Random;

public class sort {

    public static void main(String[] args) {
        int n = 20;
        int[] arr = generate(n);

        System.out.println("----------BubbleSortN---------");
        System.out.println(Arrays.toString(arr));
        BubbleSortN(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("----------BubbleSort---------");

        arr = generate(n);
        System.out.println(Arrays.toString(arr));
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("----------SelectionSort_FindMin---------");

        arr = generate(n);
        System.out.println(Arrays.toString(arr));
        SelectionSort_FindMin(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("----------SelectionSort---------");

        arr = generate(n);
        System.out.println(Arrays.toString(arr));
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("----------InsertionSort---------");
        arr = generate(n);
        System.out.println(Arrays.toString(arr));
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //O(n)
    private static int findMin(int[] arr, int index) {
        int minIndex = index;
        for (int i = index; i < arr.length; i++) {
            if (arr[i] < arr[minIndex])
                minIndex = i;
        }
        return minIndex;
    }
    //O(n^2)
    private static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    //O(n^2)
    private static void SelectionSort_FindMin(int[] arr) {
        // { 10,9,8,7,6...}
        for (int i = 0; i < arr.length; i++) {
            int minIndex = findMin(arr, i);
            swap(arr, i, minIndex);
        }
    }
    //O(n^2)
    private static void InsertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = value;
        }
    }
    //O(1)
    private static void swap(int[] arr, int indexI, int indexJ) {
        int temp = arr[indexJ];
        arr[indexJ] = arr[indexI];
        arr[indexI] = temp;
    }
    //Tn = n^2
    //O(n^2)
    private static void BubbleSortN(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }
    //Tn =0.5n^2 + 0.5n
    //O(n^2)
    private static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }
    //O(n)
    public static int[] generate(int n) {
        Random rd = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }
}