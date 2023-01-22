package Assignment;

public class Ex2_M {
    public static void main(String[] args) {
        //{10,9,8,5}
        //{8,5,9,10}
        isContains(new int[]{1, 2, 3, 4, 6, 8, 9});
    }
    private boolean linear_search (int a[],int num){

        for (int i = 0; i < a.length; i++) {
            if(a[i]==num)
                return true;
        }
        return false;
    }

    private static boolean isContains(int[] a) {
        return a[a.length - 1] != a[0] + a.length - 1;
    }
}
