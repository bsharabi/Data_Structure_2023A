package L01;

public class ShortCondition_11 {
    public static void main(String[] args) {
        boolean flag = true;
        String res1;

        if (flag) {
            res1 = "flag is true";
        } else {
            res1 = "flag is false";
        }
        System.out.println("res1: " + res1);

        String res2;

        res2 = (flag) ? "flag is true" : "flag is false";

        System.out.println("res2: " + res2);


        //--------------Example-------------------
        //if (num > 9) so res is  ( num * 2 )
        //if (num <= 9) so res is  ( num - 4 )

        int num = 10;
        int res = (num > 9) ? (num * 2) : (num - 4);

        System.out.println("num is: "+num+" , res is: "+res);

    }
}
