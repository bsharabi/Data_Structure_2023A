package L06;

public class GenericsFewType {
    static <T, S> void IsEq(T n1, S n2) {
        System.out.println("n1 = " + n1 + " , n2 = " + n2);
    }

    public static void main(String[] args) {
        //IS CALLED AS: static void IsEq<int,String>(int n1, string n2)
        IsEq(2, "bob");

        //IS CALLED AS: static void IsEq<String,boolean>(string n1, bool n2)
        IsEq("bob", false);

    }
}
