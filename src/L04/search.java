package L04;

import java.util.Arrays;

public class search {

    public static void main(String[] args) {
        int[] arr = LinearFunction.generate(30);
        System.out.println(Arrays.toString(arr));
        boolean ans = LinearSearch(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
         ans =BinarySearch();
    }

    private static boolean BinarySearch() {
        return true;
    }

    private static boolean LinearSearch(int[] arr) {
        return true;
    }
}
