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
    //O(log(n))
    //Suppose the array is sorted
    private static boolean BinarySearch() {
        return true;
    }
    //O(n)
    private static boolean LinearSearch(int[] arr) {
        return true;
    }
}
