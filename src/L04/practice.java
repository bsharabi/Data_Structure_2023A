package L04;

import java.util.Arrays;
import java.util.Random;

public class practice {

    public static void main(String[] args) {
        // {1,5,100,9,8}
        // {2,6,101,10,9 }
        // {3,7,102,11,10 }
        // {4,8,103,12,11 }
        // {5,9,104,13,12}

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int[][] matrix = generate(5);
        System.out.println(Arrays.deepToString(matrix));
        int[] ans = minMaxMatrix(matrix);
        System.out.println(Arrays.toString(ans));

        ans = minMaxMatrix1(matrix);
        System.out.println(Arrays.toString(ans));
    }

    //O(n)
    private static int[] minMax(int[] arr) {
        if (arr == null)
            return null;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = (arr[i] < min) ? arr[i] : min;
            max = (arr[i] > max) ? arr[i] : max;
        }
        return new int[]{min, max};
    }

    // נניח כי מספר האיברים במטריצה ( מערכים חד ממדים) הוא n
    //בנוסף נניח כי המערך החד ממדי הגדול ביותר מסומן ב-t
    // מכאן סיבוכיות הפעולה היא O(n*t)
    private static int[] minMaxMatrix(int[][] matrix) {
        // {1,5,100,9,6,5,4,-4} => {-4,100}
        // {1,5,88,9,6,5,4,-8} => {-8,88}
        // {1,5,98,9,6,5,4,-4} => {-4,98}
        // {1,5,78,9,6,-5,4,-4} => {-5,78}
        // {1,5,78,-9,6,5,4,-4}=> {-9,78}
        if (matrix == null)
            return null;
        int[] min_max;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //O(n)
        for (int i = 0; i < matrix.length; i++) {
            min_max = minMax(matrix[i]);

//            if(min_max[0] < min)
//                min =min_max[0];
//            if(min_max[1] > max)
//                max =min_max[1];

            min = (min_max[0] < min) ? min_max[0] : min;
            max = (min_max[1] > max) ? min_max[1] : max;
        }
        return new int[]{min, max};
    }

    //O(n^2)
    private static int[][] generate(int n) {
        Random rd = new Random();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rd.nextInt(120) - 80;
            }
        }
        return matrix;
    }

    //O(n*t)
    private static int[] minMaxMatrix1(int[][] matrix) {
        // {1,5,100,9,6,5,4,-4} => {-4,100}
        // {1,5,88,9,6,5,4,-8,8,9,8,7,5,2,6} => {-8,88}
        // {1,5,98,9,6,5,4,-4} => {-4,98}
        // {1,5,78,9,6,-5,4,-4} => {-5,78}
        // {1,5,78,-9,6,5,4,-4}=> {-9,78}
        if (matrix == null)
            return null;
        int[] min_max;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //O(n)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                min = (matrix[i][j] < min) ? matrix[i][j] : min;
                max = (matrix[i][j] > max) ? matrix[i][j] : max;
            }
        }
        return new int[]{min, max};
    }
    //O(n)
    private static int[] diagonalMinMaxMatrix(int[][] matrix) {
        // if( size-1 == i+j)
        //i=0, j=4 {1,5,100,9,8}
        // i=1 j=3 {1,5,88,9,6 }
        // i=2 j=2 {1,5,98,9,6 }
        // i=3 j=1 {1,5,78,9,6 }
        // i=4 j=0 {1,5,78,-9,6}
        if (matrix == null)
            return null;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            min = (matrix[i][i] < min) ? matrix[i][i] : min;
            max = (matrix[i][i] > max) ? matrix[i][i] : max;
        }
        return new int[]{min, max};
    }
    //O(n^2)
    private static int[] diagonalMinMaxMatrix2(int[][] matrix) {
        // {1,5,100,9,8}
        // {1,5,88,9,6 }
        // {1,5,98,9,6 }
        // {1,5,78,9,6 }
        // {1,5,78,-9,6}
        if (matrix == null)
            return null;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    min = (matrix[i][i] < min) ? matrix[i][i] : min;
                    max = (matrix[i][i] > max) ? matrix[i][i] : max;
                }
            }
        }
        return new int[]{min, max};
    }

}
