package L06;

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        funcVoid("Hello");
        int sum = func(7, 3);
        System.out.println(sum);
        a();
        a1(5);
        func_a();
        System.out.println("-------------------------- Linear Search -----------------------------");
        boolean ans = LinearSearchRec(new int[]{1, 8, 6, 50, 87, -8, -30, -87, 0}, 4);
        System.out.println(ans);
        ans = LinearSearchRec(new int[]{1, 8, 6, 50, 87, -8, -30, -87, 0}, -30);
        System.out.println(ans);
        ans = LinearSearchRec(null, -30);
        System.out.println(ans);
        ans = LinearSearchRec(new int[]{}, -30);
        System.out.println(ans);
        ans = LinearSearchRec(new int[]{1}, -30);
        System.out.println(ans);
        ans = LinearSearchRec(new int[]{1}, 1);
        System.out.println(ans);

        System.out.println("-------------------------- Binary Search -----------------------------");
        int[] arr = new int[]{1, 8, 6, 50, 87, -8, -30, -87, 0};
        int[] b = Arrays.copyOfRange(arr, arr.length, arr.length);
        System.out.println(Arrays.toString(b));
        System.out.println(b.length);
        Arrays.sort(arr);
        ans = BinarySearchRec(arr, 4);
        System.out.println(ans);
        ans = BinarySearchRec(arr, -30);
        System.out.println(ans);
        ans = BinarySearchRec(null, -30);
        System.out.println(ans);
        ans = BinarySearchRec(new int[]{}, -30);
        System.out.println(ans);
        ans = BinarySearchRec(new int[]{1}, -30);
        System.out.println(ans);
        ans = BinarySearchRec(new int[]{1}, 1);
        System.out.println(ans);

        System.out.println( divRec(10,5));
        System.out.println( divRec(10,3));

    }

    private static int[] margeSort(int[] arr) {
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        int[] newArr = new int[0];
        if (arr.length != 1) {
            left = margeSort(left);
            right = margeSort(right);
            newArr = marge(left, right);
        }
        return newArr;
    }

    private static int[] marge(int[] left, int[] right) {
        return null;
    }

    static void a(int n) {
        if (n == 1)
            return;
        a(n - 1);
    }

    private static boolean BinarySearchRec(int[] arr, int num) {
        if (arr == null || arr.length == 0)
            return false;
        int mid = arr.length / 2;
        if (arr[mid] == num)
            return true;
        if (num < arr[mid])
            return BinarySearchRec(Arrays.copyOfRange(arr, 0, mid), num);
        else
            return BinarySearchRec(Arrays.copyOfRange(arr, mid + 1, arr.length), num);


    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;
        return factorial(n - 1) * n;

    }

    private static int fib(int n) {
        if (n == 0 || n == 1)
            return 1;
        if (n == 2)
            return 2;

        return fib(n - 1) + fib((n - 2));

    }

    private static int Sum(int n) {
        if (n == 1)
            return 1;
        return Sum(n - 1) + n;
    }

    private static void func_a() {
        System.out.println("function a (Before)");
        func_b();
        System.out.println("function a (After)");
    }

    private static void func_b() {
        System.out.println("function a (Before)");
        func_c();
        System.out.println("function a (After)");
    }

    private static void func_c() {
        System.out.println("function c (Before)");
    }

    private static void funcVoid(String msg) {
        System.out.println(msg);
    }

    private static int func(int a, int b) {
        return a + b;
    }

    private static void a() {
        System.out.println("Hello a function");
        b();
    }

    private static void b() {
        System.out.println("Hello b function");
        c();
    }

    private static void c() {
        System.out.println("Hello c function");
        d();
    }

    private static void d() {
        System.out.println("Hello d function");
    }

    private static void a1(int n) {
        if (n == 2)
            return;
        System.out.println("Hello a function");
        b1(n - 1);
    }

    private static void b1(int n) {
        if (n == 2)
            return;
        System.out.println("Hello b function");
        c1(n - 1);
    }

    private static void c1(int n) {
        if (n == 2)
            return;
        System.out.println("Hello c function");
        d1(n - 1);
    }

    private static void d1(int n) {
        if (n == 2)
            return;
        System.out.println("Hello d function");
    }

    private static int a2() {
        System.out.println("Hello a function");
        return b2() + 1;
    }

    private static int b2() {
        System.out.println("Hello b function");
        return c2() + 1;
    }

    private static int c2() {
        System.out.println("Hello c function");
        return d2() + 1;
    }

    private static int d2() {
        System.out.println("Hello d function");
        return 1;
    }

    private static int a3(int n) {
        if (n == 2)
            return 1;
        System.out.println("Hello a function");
        return b3(n - 1) + 1;
    }

    private static int b3(int n) {
        if (n == 2)
            return 1;
        System.out.println("Hello b function");
        return c3(n - 1) + 1;
    }

    private static int c3(int n) {
        if (n == 2)
            return 1;
        System.out.println("Hello c function");
        return d3(n - 1) + 1;
    }

    private static int d3(int n) {
        if (n == 2)
            return 1;
        System.out.println("Hello d function");
        return 1;
    }

    private static int a4(int n) {
        if (n == 2)
            return 1;
        System.out.println("Hello d function");
        return a4(n - 1);
    }

    //O(n)
    public static boolean LinearSearch(int[] arr, int num) {
        //{1,8,6,5,4,3,2,8}
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return true;
        }
        return false;
    }

    public static boolean BinarySearch(int[] arr, int num) {
        //iter =0
        //{1,2,3,4,5,6,7,8,9,10}
        // ^         ^        ^
        // |         |        |
        // left    middle    right

        // iter = 1 if(arr[middle]>num) |OR|  iter =1 if(arr[middle]<num)
        //{1,2,3,4,5,6,7,8,9,10}        |  |  {1,2,3,4,5,6,7,8,9,10}
        // ^   ^   ^                    |  |               ^   ^  ^
        // |   |   |                    |  |               |   |  |
        // l   m   r                    |  |               l   m  r

        int left = 0;
        int right = arr.length - 1;
        int middle = (left + right) / 2;
        while (left <= right) {
            if (arr[middle] == num)
                return true;
            if (arr[middle] > num)
                right = middle - 1;
            else
                left = middle + 1;

            middle = (left + right) / 2;
        }
        return false;
    }

    //O(n^2)
    public static boolean LinearSearchRec(int[] arr, int num) {
        if (arr == null || arr.length == 0)
            return false;
        if (arr[0] == num)
            return true;
        int[] temp = Arrays.copyOfRange(arr, 1, arr.length);
        return LinearSearchRec(temp, num);
    }

    //O(n)
    public static boolean LinearSearchRec(int[] arr, int num, int index) {
        if (arr == null || arr.length == index)
            return false;
        if (arr[index] == num)
            return true;
        return LinearSearchRec(arr, num, index + 1);

    }

    //O(log^2(n))
    public static boolean BinarySearchRec1(int[] arr, int num) {
        if (arr == null || arr.length == 0)
            return false;
        int middle = arr.length / 2;
        if (arr[middle] == num)
            return true;
        if (arr[middle] > num)
            return BinarySearchRec1(Arrays.copyOfRange(arr, 0, middle), num);

        int[] temp = Arrays.copyOfRange(arr, middle + 1, arr.length);
        return BinarySearchRec1(temp, num);
    }

    // a=4, b=3
    //3+3+3+3
    //4+4+4
    //O(b)
    public static int mulRec(int a, int b) {
        if (b == 0)
            return 0;
        return mulRec(a, b - 1) + a;
    }

    //2^5 = 2*2*2*2*2 = 32
    //O(b)
    public static int powRec(int a, int b) {
        if (b == 0)
            return 1;
        return powRec(a, b - 1) * a;


    }

    public static double divRec(int a, int b) {
        if(a<b)
            return (double) a/b;
        return divRec(a-b,b)+1;
    }


}
