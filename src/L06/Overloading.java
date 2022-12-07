package L06;

import java.util.ArrayList;

public class Overloading {

    static boolean IsEq(int n1, int n2) {
        return n1 == n2;
    }

    static boolean IsEq(String n1, String n2) {
        return n1 == n2;
    }


    static boolean IsEq(boolean n1, boolean n2) {
        return n1 == n2;
    }

    public static void main(String[] args) {
        System.out.println(IsEq(2, 2));
        System.out.println(IsEq("bob", "bob"));
        System.out.println(IsEq(true, true));

    }

}
