package L01;

import static java.lang.System.out;

public class classA {


    public static void main(String[] args) {

        C myC = new C();

    }


}

class A {
     protected   int value;
}


class B extends A {

}

class C extends B {

    public C() {
    }
}
