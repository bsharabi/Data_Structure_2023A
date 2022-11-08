package TestExample;

public abstract class NumbersFunction {


    public static double sum(double a, double b) {
        return a + b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double diff(double a, double b) {
        return a - b;
    }

    public static double max(double a, double b) {
        if (a > b)
            return a;
        return b;
    }

    public static double min(double a, double b) {
        if (a < b)
            return a;
        return b;
    }

    public static int pow(int a, int b) {
        int pow = 1;

        for (int i = 0; i < b; i++) {
            pow = pow * a;
        }

        return pow;

    }

}
