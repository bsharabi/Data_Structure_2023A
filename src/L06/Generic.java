package L06;

public class Generic {

    static <T> void IsEq(T n1, T n2) {
        System.out.println("n1 = " + n1 + " , n2 = " + n2);
    }

    public static void main(String[] args) {
        IsEq(2, 2);
        IsEq("bob", "bob");
        IsEq(true, true);

    }
}
