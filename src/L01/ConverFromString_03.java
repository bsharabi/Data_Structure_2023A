package L01;

public class ConverFromString_03 {
    public static void main(String[] args) {

        //-------------------- Convert from string to number -----------------`
        int num1 = Integer.parseInt("3");

        double num2 = Double.parseDouble("7.8");

        System.out.println(num1 + num2);
        //-------------------- Convert from number to string -----------------
        String strNum1 = String.valueOf(num1);

        String strNum2 = String.valueOf(num2);

        System.out.println(strNum1+strNum2);
        System.out.println(strNum1+" "+strNum2);
    }
}
