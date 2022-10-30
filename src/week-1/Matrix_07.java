package L01;

import java.awt.*;
import java.util.Arrays;

public class Matrix_07 {

    public static void main(String[] args) {
        //----------- way 1 to craete a mtrix ---------
        int[] arr01 = {1, 1, 1};
        int[][] matrix1 = {new int[]{1, 1, 1}, new int[]{1, 1, 1}};


        //----------- way 2 to craete a mtrix ---------
        int[] arr02 = new int[]{1, 1, 1};
        int[][] matrix2 = new int[][]{new int[]{1, 1, 1}, new int[]{1, 1, 1, 1}};


        //----------- way 3 to craete a mtrix ---------

        int[] arr03 = new int[3];
        arr03[0] = 1;
        arr03[1] = 2;
        arr03[2] = 3;


        int[][] matrix3 = new int[2][];
        matrix3[0] = new int[]{11, 12, 13};
        matrix3[1] = new int[]{21, 22, 23};

        System.out.println("\n--------------arr03 foreach ----------------------\n");

        for (int arrItem : arr03) {
            System.out.printf("arr03 foreach : %d ", arrItem);
        }

        System.out.println("\n--------------arr03 for ----------------------");

        for (int i = 0, n=arr03.length; i <n ; i++) {
            System.out.printf("arr03 for : %d  ", arr03[i]);
        }

        System.out.println("\n--------------matrix3 foreach ----------------------");
        for (int[] matrixItem : matrix3) {
            for (int arrItem : matrixItem) {
                System.out.printf("matrix3 foreach : %d ", arrItem);
            }
            System.out.println();
        }

        System.out.println("\n--------------matrix3 for ----------------------");
        for (int row = 0; row < matrix3.length; row++) {
            for (int col = 0; col < matrix3[row].length; col++) {
                System.out.printf("matrix3 for : %d ", matrix3[row][col]);
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");
        Point d = new Point(3, 5);
        System.out.println(d);
        Point[] arrPoints = {
                new Point(3, 5),
                new Point(2, 7),
                new Point(-8, 5),
                new Point(8, 4),
                new Point(7, 22),
                new Point(5, 56),
                new Point(76, 6),
                new Point(57, 76),
                new Point(23, 9)};
        for (Point p : arrPoints) {
            System.out.println(p);
        }

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};


        int[][] mat = {array1, array2, array3};
//        int[][]  mat = {Arrays.copyOfRange(array1, 0, 3), Arrays.copyOfRange(array2, 0, 3), Arrays.copyOfRange(array3, 0, 3)};


        System.out.println("---------------------------------------");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println(Arrays.deepToString(mat));
        System.out.println("---------------------------------------");
        mat[1][1] = 100;
        System.out.println("---------------------------------------");
        System.out.println(Arrays.deepToString(mat));
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));

        System.out.println("---------------------------------------");
    }
}
