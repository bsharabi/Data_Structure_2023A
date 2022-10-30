package L01;

public class RefVar_15 {
    static void ChangeNum(int n1,int n2)
    {
        System.out.println("n1: "+n1+", n2: "+n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("n1: "+n1+", n2: "+n2);

    }
    public static void main(String[] args)
    {
        int num1 = 2;
        int num2 = 8;

        System.out.println("BEFORE ------------ num1: "+num1+", num2: "+num2);

        ChangeNum(num1, num2);

        System.out.println("AFTER ------------ num1: "+num1+", num2: "+num2);
    }
}
