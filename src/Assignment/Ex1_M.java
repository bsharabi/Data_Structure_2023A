package Assignment;

public class Ex1_M {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        q1(6);
        System.out.println("-------------------------------");
        q2(6);
        System.out.println("-------------------------------");
        q3(10);
        System.out.println("-------------------------------");
    }

    //O(n)
    private static void q1(int n) {
        if (n < 2)
            return;
        for (int i = 1; i < n; i++) {
            System.out.println(i + " + " + (n - i));
        }

        //n=6

        //a =1 b,c = 6-1
        //a =2 b,c = 6-2
        //a =3 b,c = 6-3
        //a =4 b,c = 6-4


    }

    private static void q2(int n) {
        if (n < 3)
            return;
        for (int j = 1; j < n -1; j++) {
            for (int i = 1; i < n - j; i++) {
                System.out.println(j + " + " + i+ " + " + (n - i - j) );
            }
        }
    }

    private static void q3(int n) {
        for (int j = 1; j < n - 1; j++) {
            for (int i = j + 1; i < n - j - 2; i++) {
                if ((n - i - j) != i && (n - i - j) != j && (n - i - j) > i)
                    System.out.println(j + " + " + i + " + " + (n - i - j));
            }
        }
    }
}
