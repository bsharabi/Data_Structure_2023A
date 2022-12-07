package L06;

public  class MyArrays {
    private MyArrays() {
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        if (arr == null)
            return new int[]{};
        if (from < 0 || from > to)
            return arr;
        int size = to - from;
        to=(to>arr.length)? arr.length : to;
        int[] newArr = new int[size];
        int k = 0;
        for (int i = from; i < to; i++) {

            newArr[k++] = arr[i];
        }
        return newArr;

    }


}
